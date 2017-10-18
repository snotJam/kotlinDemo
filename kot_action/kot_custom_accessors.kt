package kot_action

/**
 * Created by NewNet on 2017/10/18.
 * 自定义访问器，也就是get方法
 */
class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean get() {                           //注意这里不是方法fun，而是一个变量，后面跟get方法
        return height == width
    }
}

fun main(args: Array<String>) {
    val rect = Rectangle(41, 43)
    println(rect.isSquare)
}