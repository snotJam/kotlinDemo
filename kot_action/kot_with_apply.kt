package kot_action

/**
 * Created by NewNet on 2017/10/23.
 * with：两个参数，第二个是方法参数，执行的是参数1.参数2()
 * apply：一个方法参数，执行的是this.参数()，和with有点类似
 */
fun alphabet(): String {
    val stringBuilder = StringBuilder()
    return with(stringBuilder) {                        //with接收两个参数，第一个参数会执行第二个参数代表的函数
        for (letter in 'A'..'Z') {
            this.append(letter)
        }
        append("\nNow I know the alphabet!")
        this.toString()
    }
}

fun alphabet1() = StringBuilder().apply {               //返回调用了apply的this对象，这里就是返回调用了apply参数函数的StringBuilder
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
}.toString()


fun main(args: Array<String>) {
    println(alphabet())
    println(alphabet1())
}

