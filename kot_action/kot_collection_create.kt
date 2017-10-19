package kot_action

/**
 * Created by NewNet on 2017/10/19.
 * Kotlin中集合的创建,set，list，map
 */

val set = hashSetOf(1, 7, 35)
val list = arrayListOf(1, 2, 3)
val map = hashMapOf(1 to "val1", 3 to "val2", 5 to "val3")

fun main(args: Array<String>) {
    println(set.javaClass)                              //打印对应的Java类，比如这个对应的是class java.util.HashSet
    println(list)
    println(map)
}
