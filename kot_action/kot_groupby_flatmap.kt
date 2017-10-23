package kot_action

/**
 * Created by NewNet on 2017/10/23.
 * 分组和
 */
fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 31),
            Person("Bob", 29), Person("Carol", 31))
    println(people.groupBy { it.age })                          //groupBy，根据条件来对collection内部的item进行分组，返回map

    val strings = listOf("abc", "def")
    println(strings.flatMap { it.toList() })                    //合并两个集合，可以在合并的时候对item进行操作


}