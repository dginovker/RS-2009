package plugin.quest.members.thelosttribe

import core.cache.def.impl.ItemDefinition
import core.cache.def.impl.ObjectDefinition
import core.game.component.Component
import core.game.interaction.OptionHandler
import core.game.node.Node
import core.game.node.entity.player.Player
import core.game.node.item.Item
import core.plugin.InitializablePlugin
import core.plugin.Plugin
import core.tools.Items

private val BOOK = Item(Items.GOBLIN_SYMBOL_BOOK_5009)
@InitializablePlugin
class LostTribeOptionHandler : OptionHandler(){
    override fun newInstance(arg: Any?): Plugin<Any> {
        ItemDefinition.forId(5008).handlers["option:look-at"] = this
        ItemDefinition.forId(5009).handlers["option:read"] = this
        ObjectDefinition.forId(6916).handlers["option:search"] = this
        return this
    }

    override fun handle(player: Player?, node: Node?, option: String?): Boolean {
        player ?: return false
        node ?: return false
        when(node.id){
            5008 -> player.interfaceManager.open(Component(50))
            5009 -> player.interfaceManager.open(Component(183))
            6916 -> {
                if(!player.inventory.containsItem(BOOK) && !player.bank.containsItem(BOOK) && player.questRepository.getQuest("Lost Tribe").getStage(player) >= 41){
                    player.dialogueInterpreter.sendDialogue("'A History of the Goblin Race.' This must be it.")
                    player.inventory.add(BOOK)
                } else {
                    return false
                }
            }
        }
        return true
    }

}