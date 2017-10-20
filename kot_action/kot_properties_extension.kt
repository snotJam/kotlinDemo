package kot_action

/**
 * Created by NewNet on 2017/10/20.
 * 属性扩展
 */

var StringBuilder.lastChar: Char                                //对属性进行扩展      这里使用var表示可以被改变，一般后面跟get，set方法
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }

fun main(args: Array<String>) {
    val sb = StringBuilder("Kotlin")
    sb.lastChar = '!'                                           //=进行赋值操作，从而调用了set方法
    println(sb)
}