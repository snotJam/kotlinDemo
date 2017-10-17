package kot_online

/**
 * Created by NewNet on 2017/10/17.
 * 求数组里元素的和
 */
fun sum(a: IntArray): Int {
    // Write your solution here
    var num = 0
    a.map { num = num + it }           //map循环，参数是一个函数，接收int参数，返回int，这个表达式就相当于下面的fun num方法
    //    a.map { it -> num + it }            //操作item才能用lambda表达式? 在上面使用lambda表达式报错

    //    for (it in a) {               //for循环
    //      sum = sum + it
    //    }

    return num
}

//fun num(num: Int, it: Int) = num + it;

fun main(args: Array<String>) {
    var intarr: IntArray = intArrayOf(1, 2, 3, 4, 5)
    println(sum(intarr))
}