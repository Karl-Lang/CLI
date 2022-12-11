package studio.karllang.karlcli.commands

import studio.karllang.karlcli.Constants

class HelpCommand : Command(
    name = "help",
    description = "Displays help information for a command.",
    longOptionName = "--help",
    shortOptionName = "-h",
    usage = "[command]"
) {
    override fun execute(args: Array<String>) {
        val commandArg = Constants.commands.find {
            it.getConstructor().newInstance().longOptionName == args[1] || it.getConstructor()
                .newInstance().shortOptionName == args[1]
        }

        if (commandArg != null) {
            val instance = commandArg.getConstructor().newInstance();
            println("Name: ${instance.name}")
            println("Description: ${instance.description}")
            println("Usage: ${instance.name} ${instance.usage}")
        } else run {
            println("Commands:")
            for (command in Constants.commands) {
                val instance = command.getConstructor().newInstance()
                val name = "${instance.longOptionName}, ${instance.shortOptionName} ${instance.usage}"
                val padding = " ".repeat(30 - name.length)

                println("$name $padding ${instance.description}")
            }
        }
    }
}