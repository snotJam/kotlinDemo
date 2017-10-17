package kot_online

/**
 * Created by NewNet on 2017/10/13.
 * 创建对象
 */

class Greeter(val name: String) {
    fun greet() {
        println("hello, ${name}")
    }
}

fun main(args: Array<String>) {
    Greeter("joke").greet()                 //创建对象的方式，不是new，而是直接：类名(参数)创建一个对象
}