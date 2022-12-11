package studio.karllang.karlcli.commands

class HelpCommand : Command (
    name = "help",
    description = "Displays help information for a command.",
    longOptionName = "help",
    shortOptionName = "h",
    usage = "help [command]"
) {
    override fun execute(args: Array<String>) {
        println("Help command executed.")
    }
}