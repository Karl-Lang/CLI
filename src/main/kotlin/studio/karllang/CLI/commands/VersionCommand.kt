package studio.karllang.CLI.commands

import studio.karllang.CLI.Constants

class VersionCommand : Command(
    name = "version",
    description = "Displays the version of the application.",
    longOptionName = "--version",
    shortOptionName = "-v",
    usage = ""
) {
    override fun execute(args: Array<String>) {
        println("KarlCLI ${Constants.VERSION}")
    }
}