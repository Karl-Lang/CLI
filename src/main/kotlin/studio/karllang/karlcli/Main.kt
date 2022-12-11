package studio.karllang.karlcli

fun main(args: Array<String>) {
    val commandArg = Constants.commands.find {
        it.getConstructor().newInstance().longOptionName == args[0] || it.getConstructor()
            .newInstance().shortOptionName == args[0]
    }

    if (commandArg != null) {
        val instance = commandArg.getConstructor().newInstance()
        instance.execute(args)
    } else run {
        println("Unknown command: ${args[0]}")
    }
}