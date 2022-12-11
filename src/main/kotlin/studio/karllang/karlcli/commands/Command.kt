package studio.karllang.karlcli.commands

abstract class Command(
    private val name: String,
    private val description: String,
    private val usage: String,
    private val longOptionName: String,
    private val shortOptionName: String
    ) {
    abstract fun execute(args: Array<String>)
}