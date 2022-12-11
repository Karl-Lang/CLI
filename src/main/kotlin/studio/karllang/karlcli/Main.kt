package studio.karllang.karlcli

import studio.karllang.karlcli.commands.*

fun main(args: Array<String>) {
    when (args[0]) {
        "-v", "--version" -> VersionCommand().execute(args)
        "-h", "--help" -> HelpCommand().execute(args)
        else -> println("Unknown option: ${args[0]}")
    }
}