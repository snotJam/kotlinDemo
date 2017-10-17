package kot_online

/**
 * Created by NewNet on 2017/10/17.
 * 复合函数
 */
fun main(args: Array<String>) {
    val odl = compose(::isOddd, ::length)
    val strs = listOf("a", "ab", "abc")
    println(strs.filter(odl))
}

fun isOddd(x: Int) = x % 2 != 0
fun length(s: String) = s.length

/**
 * 结合下面的注释,A,B,C分别对应 String，Int，Boolean
 */
fun <A, B, C> compose(f: (B) -> C, g: (A) -> B): (A) -> C {     //函数参数：f:函数接收B类型参数，返回C类型结果；g：函数接收A类型参数，返回B类型结果
    return { x -> f(g(x)) }                     //复合函数的表示，先调用g函数，再调用f函数
}
