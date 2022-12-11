package studio.karllang.cli.commands

import studio.karllang.cli.Constants

class VersionCommand : Command(
    name = "version",
    description = "Displays the version of the application.",
    longOptionName = "--version",
    shortOptionName = "-v",
    usage = ""
) {
    override fun execute(args: Array<String>) {
        println("KarlCLI ${Constants.version}")
    }
}