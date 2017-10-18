package kot_action

/**
 * Created by NewNet on 2017/10/18.
 */
data class Person(val name: String, val age: Int? = null)     //构造函数，age可以为null，默认为null

fun main(args: Array<String>) {
    val persons = listOf(Person("Alice"), //只传一个name，age调用默认值
            Person("Bob", age = 29))             //指定了age的值

    val old = persons.maxBy { it.age ?: 0 }     //maxBy方法：遍历获取list中的最大
    println("the older is : $old")
}