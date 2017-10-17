package kot_online

/**
 * Created by NewNet on 2017/10/13.
 * 条件表达式
 */
fun main(args: Array<String>) {
    println(max(0, 1))                               //java中也可以
}

fun max(a: Int, b: Int) = if (a > b) a else b       //函数返回一个表达式的时候，可以省略{}，直接=表达式