package kot_action

/**
 * Created by NewNet on 2017/10/18.
 * 类
 */
class Person1(val name: String, var isMarried: Boolean)

fun main(args: Array<String>) {
    val person = Person1("Bob",true)        //创建对象，不用new
    println(person.name)                    //引用属性用xxx.属性名
    println(person.isMarried)
}
