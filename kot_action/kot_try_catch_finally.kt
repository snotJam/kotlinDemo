package kot_action

import java.io.BufferedReader
import java.io.StringReader

/**
 * Created by NewNet on 2017/10/19.
 * try。。catch。。finally
 * try表达式
 */
fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("239"))
    println(readNumber(reader))

    val reader1 = BufferedReader(StringReader("abc"))
    readNumber1(reader1)

    val reader2 = BufferedReader(StringReader("abc"))
    readNumber2(reader2)
}

fun readNumber(reader: BufferedReader): Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    } catch(e: NumberFormatException) {                 //catch到错误返回null
        return null
    } finally {                                         //一定会执行的部分
        reader.close()
    }
}

fun readNumber1(reader: BufferedReader) {
    val num = try {                                     //注意这里是一个变量，也就是说后面整个算是一个表达式
        Integer.parseInt(reader.readLine())
    } catch(e: NumberFormatException) {
        return                                          //catch到错误就return退出函数，不会执行后面的打印
    }
    println(num)
}

fun readNumber2(reader: BufferedReader) {
    val num = try {                                     //注意这里是一个变量，也就是说后面整个算是一个表达式
        Integer.parseInt(reader.readLine())
    } catch(e: NumberFormatException) {
        null                                           //catch到错误，将null赋值给num
    }
    println(num)
}
