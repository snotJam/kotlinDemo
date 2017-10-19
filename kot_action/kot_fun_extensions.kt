package kot_action

/**
 * Created by NewNet on 2017/10/19.
 * 函数扩展
 */

//函数扩展，使用  类型.方法()  的方式来对类型进行扩展，那么在这个扩展方法中使用this关键字就表示被扩展的类型对象
fun <T> Collection<T>.joinToString(separator: String, prefix: String, postfix: String): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {              //this.withIndex()    返回的item格式为(index=0,value=1),这里的this是collection，因为这个方法是对Collection的扩展
        if (index > 0) result.append(separator)               //StringBuilder.append()    StringBuilder拼接String
        result.append(element)
    }

    result.append(postfix)
    return result.toString()                                  //StringBuilder.toString    StringBuilder转换为String字符串
}

//这个方法结果是一个函数表达式，也是对Collection的扩展
fun Collection<String>.join(separator: String = ", ", prefix: String = "", postfix: String = "") = joinToString(separator, prefix, postfix)

fun main(args: Array<String>) {
    val list = arrayListOf(1, 2, 3)
    println(list.joinToString(" "))                           //使用扩展方法需要符合 类型.方法() 的调用方式

    val sl = arrayListOf("1","2","3")
    println(sl.join(";"))
}
