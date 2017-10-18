package kot_action

/**
 * Created by NewNet on 2017/10/18.
 * 简单的fun
 */
fun main(args: Array<String>) {
    println(max(1, 2))
}

fun max(a: Int, b: Int): Int {          //方法的:后面是返回Int类型
    return if (a > b) a else b          //if...else...类似三元表达式
}

fun max1(a: Int, b: Int): Int? {          //方法的:后面是返回Int类型，加?的Int?表示返回结果可以为null
    return if (a > b) a else b          //if...else...类似三元表达式
}