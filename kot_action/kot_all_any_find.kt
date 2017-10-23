package kot_action

/**
 * Created by NewNet on 2017/10/23.
 * all
 * any
 * find
 */

data class Person3(val name: String, val age: Int)

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 27), Person("Bob", 31))
    println(people.all { it.age == 27 })                 //如果所有的item匹配{}内的条件，返回true
    println(people.any { it.age == 27 })                 //如果list内至少有一个item匹配{}内的条件，返回true
    println(people.find { it.age == 27 })                //返回第一个匹配的item，否则返回null
}


