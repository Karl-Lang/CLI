package studio.karllang.cli

fun main(args: Array<String>) {
    // TODO: Check if Karl jar is in the same directory as the jar file.

    val command = Constants.commands.find {
        it.getConstructor().newInstance().longOptionName == args[0] || it.getConstructor()
            .newInstance().shortOptionName == args[0]
    }

    if (command != null) {
        val instance = command.getConstructor().newInstance()
        instance.execute(args)
    } else run {
        // TODO: If it's a path, run it.
        println("Unknown command: ${args[0]}")
    }
}