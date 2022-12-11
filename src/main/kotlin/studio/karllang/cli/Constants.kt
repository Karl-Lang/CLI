package studio.karllang.cli

import ch.qos.logback.classic.Logger
import studio.karllang.cli.commands.Command
class Constants {
    companion object {
        const val version: String = "v0.0.1"
        val commands: MutableSet<Class<out Command>> = run {
            (org.slf4j.LoggerFactory.getLogger("org.reflections") as Logger).level = ch.qos.logback.classic.Level.OFF
            org.reflections.Reflections("studio.karllang.cli.commands").getSubTypesOf(Command::class.java)
        }
    }
}