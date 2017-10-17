package kot_online

/**
 * Created by NewNet on 2017/10/13.
 * 数据类
 */

data class User(val name: String, val id: Int)          //可以省略类的{}

fun main(args: Array<String>) {
    val user = User("jork", 2)
    println("name = ${user.name}, id = ${user.id}")     //普通使用

    val(name, id) = User("tom", 7)
    println("name = $name, id = $id")                   //解构方式，那么说明数据类默认提供有operator fun component1(){...}

    val u3 = User(name = "u3", id = 3)                  //明确指定参数值
    val c2 = u3.copy(name = "c2")                       //copy方法
    val c3 = c2.copy("Max")                             //直接对应到name，直接对应第一个参数
    println("name = ${u3.name}, id = ${u3.id}")
    println("name = ${c2.name}, id = ${c2.id}")
    println("name = ${c3.name}, id = ${c3.id}")

}
