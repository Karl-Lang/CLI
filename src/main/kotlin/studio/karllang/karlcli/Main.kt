package studio.karllang.karlcli

import studio.karllang.karlcli.commands.HelpCommand

fun main(args: Array<String>) {
    val version: String = "v0.0.1"
    val name: String = "KarlCLI"

    when (args[0]) {
        "-v", "--version" -> println("$name $version")
        "-h", "--help" -> HelpCommand().execute(args)
        else -> println("Unknown option: ${args[0]}")
    }
}