package core

import core.game.system.SystemLogger
import core.game.system.SystemShutdownHook
import core.game.system.mysql.SQLManager
import core.game.world.GameSettings.Companion.parse
import core.game.world.GameWorld
import core.gui.ConsoleFrame
import core.net.NioReactor
import core.net.amsc.WorldCommunicator
import core.tools.TimeStamp
import core.tools.backup.AutoBackup
import plugin.ge.GEAutoStock
import java.io.File
import java.net.BindException

/**
 * The main class, for those that are unable to read the class' name.
 * @author Emperor
 * @author Vexia
 */
object Server {
    /**
     * The time stamp of when the server started running.
     */
	@JvmField
	var startTime: Long = 0

    /**
     * The NIO reactor.
     */
    var reactor: NioReactor? = null
    private val backup: AutoBackup? = null

    /**
     * The main method, in this method we load background utilities such as
     * cache and our world, then end with starting networking.
     * @param args The arguments cast on runtime.
     * @throws Throwable When an exception occurs.
     */
    @Throws(Throwable::class)
    @JvmStatic
    fun main(args: Array<String>) {
        if (GameWorld.getSettings() == null) {
            println("WARNING: Can't find config file. Make sure starting dir is set to 2009scape/Server!")
        }
        if (args.isNotEmpty()) {
            try {
                GameWorld.setSettings(parse(args))
            } catch(e: Exception){
                print("Unable to find config file $args")
            }
        }
        if (GameWorld.getSettings()!!.isGui) {
            try {
                ConsoleFrame.getInstance().init()
            } catch (e: Exception) {
                println("X11 server missing - launching server with no GUI!")
            }
        }
        startTime = System.currentTimeMillis()
        val t = TimeStamp()
        //		backup = new AutoBackup();
        GameWorld.prompt(true)
        SQLManager.init()
        Runtime.getRuntime().addShutdownHook(Thread(SystemShutdownHook()))
        SystemLogger.log("Starting NIO reactor...")
        try {
            NioReactor.configure(43594 + GameWorld.getSettings()!!.worldId).start()
        } catch (e: BindException) {
            println("Port " + 43594 + GameWorld.getSettings()!!.worldId + " is already in use!")
            throw e
        }
        WorldCommunicator.connect()
        SystemLogger.log(GameWorld.getName() + " flags " + GameWorld.getSettings().toString())
        SystemLogger.log(GameWorld.getName() + " started in " + t.duration(false, "") + " milliseconds.")
        GEAutoStock.parse("data" + File.separator + "eco" + File.separator + "itemstostock.xml")
        // TODO Run the eco kick starter 1 time for the live server then comment it out
//		ResourceManager.kickStartEconomy();
    }

    /**
     * Gets the startTime.
     * @return the startTime
     */
    fun getStartTime(): Long {
        return startTime
    }

    /**
     * Sets the bastartTime.ZZ
     * @param startTime the startTime to set.
     */
    fun setStartTime(startTime: Long) {
        Server.startTime = startTime
    }
}