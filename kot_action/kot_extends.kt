package kot_action

/**
 * Created by NewNet on 2017/10/20.
 * 继承，方法重载
 */
open class View{
    open fun click() = println("View Click")                    //open表示该方法可以被子类重写
}

class Button : View() {                                         //类名:类()    继承，这里的继承符号是：，后面是父类的构造方式，而不是单独的父类
    override fun click() = println("Button Clicked")            //overrider表示重写父类的该方法
}

fun View.showOff() = println("view showOff")                    //类型.方法     函数扩展


fun main(args: Array<String>) {
    val view = Button()
    view.click()
}