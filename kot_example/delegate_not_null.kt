package kot_online

import kotlin.properties.Delegates

/**
 * Created by NewNet on 2017/10/16.
 * 委派的notNull方法
 */

class Perl {
    var name: String by Delegates.notNull()

    fun init(name: String) {
        this.name = name
    }
}

fun main(args: Array<String>) {
    val per = Perl()
//    println(per.name)                   //没有初始化，调用name，因为name委派了notNull检查，这时的name是null，那么就会报异常
    per.init("car")
    println(per.name)                     //先调用了初始化，那么再调用name的时候，name委派检查不是Null，就不会报错
}
