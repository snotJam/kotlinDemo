package kot_online

/**
 * Created by NewNet on 2017/10/16.
 * 委派给map
 */

class Per3(val map: Map<String, Any>) {
    val name: String by map
    val age: Int by map
}

fun main(args: Array<String>) {
    val user = Per3(mapOf("name" to "car", "age" to 7))     //mapOf创建map。这个map是只读的，不提供增删方法
    println("name = ${user.name}, age = ${user.age}")

    var km = mutableMapOf<String, Int>()                    //mutableMap是可改的map
    km.put("xxx",1)

}