package kot_action

/**
 * Created by NewNet on 2017/10/18.
 * is用来判断类型
 * as用来类型转换
 */

interface Expr

class Num(val value: Int) : Expr       //继承自接口
class Sum(val left: Int, val right: Int) : Expr

fun eval(e: Expr): Int {
    if (e is Num) {                     //is类型判断
        val n = e as Sum                //as将Num类型的e转换为Sum类型，这里他们是有同一个父类，Java中貌似是不允许的
        return n.left
    }
    throw IllegalAccessException("Unknown expression")
}

fun main(args: Array<String>) {
    println(eval(Sum(1, 2)))
}