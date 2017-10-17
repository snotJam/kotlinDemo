package kot_online

import kotlin.properties.Delegates

/**
 * Created by NewNet on 2017/10/16.
 * 委派的observable方法
 */
class Per {
    var name: String by Delegates.observable("no name") { d, old, new -> println("$old-$new") }     //最后一个参数是函数，使用lambda表达式传递参数
}

fun main(args: Array<String>) {
    val per = Per()
    per.name = "carl"                   //设置一次就会调用到name属性的委派
    per.name = "car2"
}

