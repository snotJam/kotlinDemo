package kot_action

/**
 * Created by NewNet on 2017/10/19.
 * StringBuilder拼接String
 */

fun <T> joinToString(collection: Collection<T>, separator: String, prefix: String, postfix: String): String {
    val result = StringBuilder(prefix)                              //以String为参数创建对应的StringBuilder

    for ((index, element) in collection.withIndex()) {              //collection.withIndex()    返回的item格式为(index=0,value=1)
        if (index > 0) result.append(separator)                     //StringBuilder.append()    StringBuilder拼接String
        result.append(element)
    }

    for (index in collection.withIndex()) {
        println(index)
    }

    result.append(postfix)
    return result.toString()                                        //StringBuilder.toString    StringBuilder转换为String字符串
}

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    println(joinToString(list, "; ", "(", ")"))
}