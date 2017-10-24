package kot_action

import java.io.BufferedReader
import java.util.*

/**
 * Created by NewNet on 2017/10/24.
 * 可以为null和let
 */

fun strLenSafe(s: String?): Int? = if (s != null) s.length else 0               //参数带?表示该参数可以为null，返回结果带?表示返回结果可以为null

fun printCall(s: String?) {
    val Upcall : String? = s?.toUpperCase()                                     //后面是一个结果可能为空的表达式，前面变量类型也声明可能为null
}

fun readNumbers(reader: BufferedReader): List<Int?> {                           //这表示返回的List可能是size=0的
    val result = ArrayList<Int?>()
    for (line in reader.lineSequence()) {
        try {
            val number = line.toInt()
            result.add(number)
        }
        catch(e: NumberFormatException) {
            result.add(null)
        }
    }
    return result
}

fun main(args: Array<String>) {
    val email :String? = "xxxxx@xxxxx"
    email?.let { println(it+"123") }                                            //this调用参数方法
}