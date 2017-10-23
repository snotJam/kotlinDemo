package kot_action

/**
 * Created by NewNet on 2017/10/23.
 * 类的构造函数
 */
class User(val nikeName: String)                        //普通类

class User1 constructor(_nikeName: String) {            //constructor：构造函数声明，后面直接跟的构造函数参数
    val nikeName: String

    init {                                              //初始化模块
        nikeName = _nikeName
    }
}

class User4(_nikeName: String) {                        //省略了constructor关键字
    val nikeName = _nikeName
}

class User5(val nickName: String, val isSubscribe: Boolean = true)      //构造函数参数指明参数的默认值

fun main(args: Array<String>) {
    val user = User1("nike")
    println(user.nikeName)
}