package kot_action

/**
 * Created by NewNet on 2017/10/23.
 * 过滤器和map遍历
 */

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4)
    list.filter { it % 2 == 0 }                 //返回一个过滤后的list
    println(list)                               //打印原list
    println(list.filter { it % 2 == 0 })        //打印一个过滤后的list，过滤条件是{}中的，符合的才留下

    val list1 = listOf(1, 2, 3, 4)
    list1.map { it * it }                       //返回一个过滤后的list
    println(list1)
    println(list1.map { it * it })              //map，遍历且操作，操作是{}内的

}

