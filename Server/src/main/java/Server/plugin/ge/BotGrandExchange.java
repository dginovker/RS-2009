package plugin.ge;

import core.game.node.entity.player.Player;
import core.game.node.entity.player.info.PlayerDetails;
import core.game.system.SystemLogger;

import java.util.*;

/**
 * Handles the bots' Grand Exchange history.
 *
 * @author eli
 */
public class BotGrandExchange {
    private static HashMap<Integer, GrandExchangeOffer> botOffers = new HashMap<Integer, GrandExchangeOffer>();

    private static final int MAGIC_UID = -1031243425;

    public static void loadOffersFromDB() {
        Collection<GrandExchangeOffer> offers = GEOfferDispatch.getOfferMapping().values();
        for (GrandExchangeOffer o : offers){
            if (o.getPlayerUID() == MAGIC_UID) {
                if (botOffers.containsKey(o.getItemId())) {
                    GrandExchangeOffer bo = botOffers.get(o.getItemId());
                    bo.setAmount(bo.getAmount() + o.getAmountLeft());
                    botOffers.put(o.getItemId(), bo);
                } else {
                    botOffers.put(o.getItemId(), o);
                }
                GEOfferDispatch.remove(o.getUid());
            }
        }
        SystemLogger.log("Extracted " + botOffers.size() + " unique items from DB. Saving...");
        for (GrandExchangeOffer o : botOffers.values()) {
            GEOfferDispatch.dispatch(new Player(PlayerDetails.getDetails("2009scape")), o);
            SystemLogger.log("Selling " + o.getItemId() + " in amt " + o.getAmount());
        }
    }

    public static void sellOnGE(int id, int value, int amount) {
        GrandExchangeOffer o;
        if (botOffers.containsKey(id)) {
            o = botOffers.get(id);
            o.setAmount(amount + o.getAmount());
            o.setOfferedValue(value);
            SystemLogger.log("Updated item " + id + " on GE to selling " + o.getAmount() + " items.");
            GEOfferDispatch.setOfferMap(o);
        } else {
            o = new GrandExchangeOffer(id, true);
            o.setAmount(amount);
            o.setOfferedValue(value);
            GEOfferDispatch.dispatch(new Player(PlayerDetails.getDetails("2009scape")), o);
            SystemLogger.log("Adding new item " + id + " in amt " + o.getAmount());
        }
        botOffers.put(id, GEOfferDispatch.getOfferMapping().get(GEOfferDispatch.getLastItemUID()));
    }
}
