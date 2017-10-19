package kot_action

/**
 * Created by NewNet on 2017/10/19.
 * 对集合的简单操作示例
 *
 */
fun main(args: Array<String>) {
    val strings = listOf("first", "second", "third")
    println(strings.last())                     //打印list中最后一个元素

    val numbers = setOf(1, 5, 9)
    println(numbers.max())                      //打印set集合中的最大元素，对应的是Java中的java.util.Collections.max(set)
    println(numbers.last())
}