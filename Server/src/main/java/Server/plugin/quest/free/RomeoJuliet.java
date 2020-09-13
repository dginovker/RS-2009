package plugin.quest.free;

import core.game.node.entity.player.Player;
import core.game.node.entity.player.link.quest.QuestReward;
import core.game.node.entity.player.link.quest.QuestRewardComponentItem;
import core.plugin.InitializablePlugin;
import core.game.node.entity.player.link.quest.Quest;

/**
 * Represents the romeo and juliet quest.
 * @author 'Vexia
 */
@InitializablePlugin
public class RomeoJuliet extends Quest {

	/**
	 * Constructs a new {@code RomeoJuliet} {@code Object}.
	 */
	public RomeoJuliet() {
		super(
			"Romeo & Juliet",
			26, 25,
			5,
			144, 0, 1, 100
		);
	}

	@Override
	public void drawJournal(Player player, int stage) {
		super.drawJournal(player, stage);
		int line;
		switch (getStage(player)) {
		case 0:
			writeJournal(player,
				BLUE + "I can start this quest by speaking to " + RED + "Romeo " + BLUE + "in " + RED + "Varrock",
				BLUE + "central square by the " + RED + "fountain.");
			break;
		case 10:
			writeJournal(player,
				"<str>I have agreed to find Juliet for Romeo and tell her how he",
				"<str>feels. For some reason he can't just do this himself.",
				BLUE + "All I need to do now is find " + RED + "Juliet.");
			break;
		case 20:
			writeJournal(player,
				"<str>I have agreed to find Juliet for Romeo and tell her how he",
				"<str>feels. For some reason he can't just do this himself.",
				"<str>I found Juliet on the Western edge of Varrock, and told",
				"<str>her about Romeo. She gave me a message + take back",
				BLUE + "I should take the " + RED + "message " + BLUE + "from " + RED + "Juliet " + BLUE + "to " + RED + "Romeo.");
			break;
		case 30:
			writeJournal(player,
				"<str>I have agreed to find Juliet for Romeo and tell her how he",
				"<str>feels. For some reason he can't just do this himself.",
				"<str>I found Juliet on the Western edge of Varrock, and told",
				"<str>her about Romeo. She gave me a message to take back",
				"<str>I delivered the message to Romeo, and he was sad to hear",
				"<str>that Juliet's father opposed their marriage. However, he",
				"<str>said that Father Lawrence might be able to overcome this.",
				BLUE + "I should find " + RED + "Father Lawrence " + BLUE + "and see how we can help.");
			break;
		case 40:
			writeJournal(player,
				"<str>I have agreed to find Juliet for Romeo and tell her how he",
				"<str>feels. For some reason he can't just do this himself.",
				"<str>I found Juliet on the Western edge of Varrock, and told",
				"<str>her about Romeo. She gave me a message to take back",
				"<str>I delivered the message to Romeo, and he was sad to hear",
				"<str>that Juliet's father opposed their marriage. However, he",
				"<str>said that Father Lawrence might be able to overcome this.",
				"<str>I found Father Lawrence and he suggested the use of a",
				"<str>potion to fool Juliet's father that she is dead so that",
				"<str>Romeo and Juliet can be together in peace.",
				BLUE + "I need to find the " + RED + "Apothecary " + BLUE + "to make a " + RED + "cadava potion.");
			break;
		case 50:
			line = writeJournal(player,
				"<str>I have agreed to find Juliet for Romeo and tell her how he",
				"<str>feels. For some reason he can't just do this himself.",
				"<str>I found Juliet on the Western edge of Varrock, and told",
				"<str>her about Romeo. She gave me a message to take back",
				"<str>I delivered the message to Romeo, and he was sad to hear",
				"<str>that Juliet's father opposed their marriage. However, he",
				"<str>said that Father Lawrence might be able to overcome this.",
				"<str>I found Father Lawrence and he suggested the use of a",
				"<str>potion to fool Juliet's father that she is dead so that",
				"<str>Romeo and Juliet can be together in peace.",
				"<str>I went to the Apothecary regarding making this cadava",
				"<str>potion, and he told me to bring him some cadava berries");
			if (!player.getInventory().contains(753, 1)) {
				writeJournal(player, line,
					BLUE + "I will have to find some " + RED + "Cadava berries" + BLUE + " somewhere!");
			} else {
				writeJournal(player, line,
					BLUE + "I should take these " + RED + "cadava berries" + BLUE + " to the " + RED + "Apothecary.");
			}
			break;
		case 60:
			writeJournal(player,
				"<str>I have agreed to find Juliet for Romeo and tell her how he",
				"<str>feels. For some reason he can't just do this himself.",
				"<str>I found Juliet on the Western edge of Varrock, and told",
				"<str>her about Romeo. She gave me a message to take back",
				"<str>I delivered the message to Romeo, and he was sad to hear",
				"<str>that Juliet's father opposed their marriage. However, he",
				"<str>said that Father Lawrence might be able to overcome this.",
				"<str>I found Father Lawrence and he suggested the use of a",
				"<str>potion to fool Juliet's father that she is dead so that",
				"<str>Romeo and Juliet can be together in peace.",
				"<str>I went to the Apothecary regarding making this cadava",
				"<str>potion, and he told me to bring him some cadava berries",
				BLUE + "I should take this " + RED + "cadava potion " + BLUE + "to " + RED + "Juliet.");
			break;
		case 70:
			writeJournal(player,
				"<str>I have agreed to find Juliet for Romeo and tell her how he",
				"<str>feels. For some reason he can't just do this himself.",
				"<str>I found Juliet on the Western edge of Varrock, and told",
				"<str>her about Romeo. She gave me a message to take back",
				"<str>I delivered the message to Romeo, and he was sad to hear",
				"<str>that Juliet's father opposed their marriage. However, he",
				"<str>said that Father Lawrence might be able to overcome this.",
				"<str>I found Father Lawrence and he suggested the use of a",
				"<str>potion to fool Juliet's father that she is dead so that",
				"<str>Romeo and Juliet can be together in peace.",
				"<str>I went to the Apothecary regarding making this cadava",
				"<str>potion, and he told me to bring him some cadava berries",
				"<str>After the Apothecary made me the potion, I delivered it to",
				"<str>Juliet. She asked me to tell Romeo the plan.",
				BLUE + "I have to find " + RED + "Romeo" + BLUE + " and tell him what's happened.");
			break;
		case 100:
			writeJournal(player,
				"<str>Romeo and Juliet can be together in peace.",
				"<str>I went to the Apothecary regarding making this cadava",
				"<str>potion, and he told me to bring him some cadava berries.",
				"<str>After the Apothecary made me the potion, I delivered it to",
				"<str>Juliet. She asked me to tell Romeo the plan.",
				"<str>I told Romeo what was going to happen, but I'm not exactly",
				"<str>sure he understood what was happening. Ah well, I was",
				"<str>rewarded for all of my help regardless.",
				"",
				"<col=FF0000>QUEST COMPLETE!");
			break;
		}
	}

	@Override
	public QuestRewardComponentItem getRewardComponentItem() {
		return new QuestRewardComponentItem(756, 240);
	}

	@Override
	public QuestReward[] getQuestRewards(Player player) {
		return new QuestReward[0];
	}

	@Override
	public Quest newInstance(Object object) {
		return this;
	}
}
