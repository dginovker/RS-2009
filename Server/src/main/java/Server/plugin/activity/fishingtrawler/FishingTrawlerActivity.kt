package plugin.activity.fishingtrawler

import core.game.node.entity.player.Player
import core.game.system.task.Pulse
import core.game.world.GameWorld
import core.game.world.map.Location
import core.game.world.map.build.DynamicRegion
import core.game.world.map.zone.ZoneRestriction
import core.plugin.InitializablePlugin
import core.tools.ticksToSeconds
import plugin.activity.ActivityManager
import plugin.activity.ActivityPlugin
import plugin.stringtools.colorize


/**
 * Handles the fishing trawler "waiting room"
 * @author Ceikry
 */
private val WAIT_TIME = if(GameWorld.settings?.isDevMode == true) 10 else 500
private val waitingPlayers = ArrayList<Player>()
private val sessions = ArrayList<FishingTrawlerSession>()
private var activity: FishingTrawlerActivity? = null
private var nextStart = GameWorld.ticks + WAIT_TIME
@InitializablePlugin
class FishingTrawlerActivity : ActivityPlugin("fishing trawler",false,false,true,ZoneRestriction.CANNON,ZoneRestriction.FIRES,ZoneRestriction.FOLLOWERS,ZoneRestriction.RANDOM_EVENTS) {

    init {
        activity = this
    }
    override fun configure() {
        GameWorld.Pulser.submit(
        object  : Pulse(1){
            override fun pulse(): Boolean {
                if((nextStart - GameWorld.ticks) % 100 == 0){
                    for(player in waitingPlayers) {
                        player.sendMessage (colorize("%R${ticksToSeconds(nextStart - GameWorld.ticks) / 60} minutes until next game."))
                    }
                }
                if(GameWorld.ticks >= nextStart && waitingPlayers.isNotEmpty()){
                    val session = FishingTrawlerSession(DynamicRegion.create(8011), activity!!)
                    session.start(waitingPlayers)
                    sessions.add(session)
                    waitingPlayers.clear()
                    nextStart = GameWorld.ticks + WAIT_TIME
                }
                return false
            }
        })
    }

    override fun start(player: Player?, login: Boolean, vararg args: Any?): Boolean {
        player ?: return false
        waitingPlayers.add(player)
        return true
    }

    fun addPlayer(player: Player){
        if(waitingPlayers.isEmpty())
            nextStart = GameWorld.ticks + WAIT_TIME
        waitingPlayers.add(player)
    }

    fun removePlayer(player: Player){
        waitingPlayers.remove(player)
    }

    override fun newInstance(p: Player?): ActivityPlugin {
        ActivityManager.register(this)
        return this
    }

    override fun getSpawnLocation(): Location {
        return Location.create(2667, 3161, 0)
    }
}