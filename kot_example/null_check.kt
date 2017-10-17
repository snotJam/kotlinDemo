package kot_online

/**
 * Created by NewNet on 2017/10/13.
 * 可null检测
 */

fun parseInt(str: String): Int? {
    //：后面表示返回，Int?表示可以为null
    try {
        return str.toInt()                          //toInt()，转换为Int数据，同样的还有toShort等；其他转换为String的时候使用$
    } catch(e: NumberFormatException) {
        println("One of argument isn't Int")
    }

    return null
}

fun main(args: Array<String>) {
    val num: Int = 10
    println("num = $num")                          //其他转换为String的时候使用$
}