package kot_online

import kotlin.reflect.KProperty

/**
 * Created by NewNet on 2017/10/13.
 * 委派
 */

class Delegate() {                  //接收委派的类，必须存在getValue和setValue方法，注意方法参数
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {                  //第一个参数是委派类，第二个参数是固定的？getValue返回对应类型
        return "$thisRef ,thank you ..."
    }

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) {           //setValue传递对应类型
        println("$value has been ....")
    }
}

class Example {
    var p: String by Delegate()                             //by 关键字进行委派，那么我们要获取或者设置p这个属性值的时候都会调用被委派类的对应方法
    override fun toString() = "Example Class"
}

fun main(args: Array<String>) {
    val e = Example()
    println(e.p)            //执行了getValue
    e.p = "NEW"             //执行了setValue
}