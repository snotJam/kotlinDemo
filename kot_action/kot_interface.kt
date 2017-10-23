package kot_action

/**
 * Created by NewNet on 2017/10/23.
 * 接口与抽象类
 * 覆盖接口的属性
 */
interface Clickable{
    fun click()
    fun showOff() = println("I'm clickable")
}

open class RichButton:Clickable{
    fun disable(){}

    open fun animate(){}

    final override fun click() {                //final:不能再被覆盖，override覆盖父类方法

    }
}

abstract class Animated{
    abstract fun animate()                      //抽象方法
    open fun stopAnimating(){

    }
    fun animateTwice(){

    }
}

interface User6{
    val nickName:String
}

class privateUser(override val nickName: String):User6                      //覆盖接口中的属性

class SubscribUser(val email:String):User6{
    override val nickName:String get() = email.substringBefore("@")         //get访问器
}

class User7(val name:String){
    var address:String = "unspecified"
    var id:String = "2"
    set(value:String){                                                      //set访问器
        println(
                """Address was changed for $name""""
        )
        field = value                                                       //field表示当前参数(其实是最近的)
    }
}

fun main(args: Array<String>) {
    var user = User7("Jack")
    user.address = "address"                                              //貌似没有调用set访问器
    println(user.address)
    user.id = "3"                                                         //发现调用set访问器，因为id是最接近set访问器的
    println(user.id)
}