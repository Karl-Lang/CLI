package studio.karllang.CLI

import ch.qos.logback.classic.Logger
import studio.karllang.CLI.commands.Command
class Constants {
    companion object {
        const val VERSION: String = "v0.0.1"

        const val RESET: String = "\u001B[0m"
        const val ITALIC: String = "\u001B[3m"
        const val BOLD: String = "\u001B[1m"

        const val BLACK: String = "\u001B[30m"
        const val RED: String = "\u001B[31m"
        const val GREEN: String = "\u001B[32m"
        const val YELLOW: String = "\u001B[33m"
        const val BLUE: String = "\u001B[34m"
        const val MAGENTA: String = "\u001B[35m"
        const val CYAN: String = "\u001B[36m"
        const val WHITE: String = "\u001B[37m"

        val commands: MutableSet<Class<out Command>> = run {
            (org.slf4j.LoggerFactory.getLogger("org.reflections") as Logger).level = ch.qos.logback.classic.Level.OFF
            org.reflections.Reflections("studio.karllang.CLI.commands").getSubTypesOf(Command::class.java)
        }
    }
}