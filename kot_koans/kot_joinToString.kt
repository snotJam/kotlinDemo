package kot_koans

/**
 * Created by NewNet on 2017/10/23.
 */
fun joinOptions(options: Collection<String>) = options.joinToString(prefix = "[",postfix = "]")     //prefix：前缀；postfix：后缀

fun main(args: Array<String>) {
    val list = listOf<String>("1","2","3")
    println(joinOptions(list))

}