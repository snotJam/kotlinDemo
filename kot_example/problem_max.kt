package kot_online

/**
 * Created by NewNet on 2017/10/17.
 * 返回array中最大值的index
 */

fun indexOfMax(a: IntArray): Int? {
    var num = 0;
    var maxindex = 0;
    a.map { num = if (it > num) it else num }       //将最大值赋值给num
    a.map {
        num = if (it > num) it else num
        maxindex = a.indexOf(num)                   //获取num出现在array中的index
    }
    return maxindex
}

fun main(args: Array<String>) {
    var intarr: IntArray = intArrayOf(1, 2, 3, 4, 5, 9, 7, 6, 10)
    println(indexOfMax(intarr))
}