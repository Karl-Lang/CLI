package studio.karllang.CLI.commands

abstract class Command(
    val name: String,
    val description: String,
    val usage: String,
    val longOptionName: String,
    val shortOptionName: String
) {
    abstract fun execute(args: Array<String>)
}