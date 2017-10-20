package kot_koans

/**
 * Created by NewNet on 2017/10/20.
 */
fun toJson(collection: Collection<Int>): String {
    var sb = StringBuilder("[")
    collection.map {
        sb = sb.append(it.toString() + ",")
    }
    var str = sb.toString()                                 //sb.toString生成一个String，但是sb的值还是没有改变的，我们对生成的String做操作也不影响sb
    return str.substring(0, str.lastIndexOf(",")) + "]"
}

/**
 * 和上面的效果一样
 */
fun toJSON(collection: Collection<Int>): String {
    val sb = StringBuilder()
    sb.append("[")
    val iterator = collection.iterator()
    while (iterator.hasNext())
    {
        val element = iterator.next()
        sb.append(element)
        if (iterator.hasNext())
        {
            sb.append(", ")
        }
    }
    sb.append("]")
    return sb.toString()
}

fun main(args: Array<String>) {
        val list = arrayListOf(1, 3, 4, 7, 9)
        println(toJson(list))

//    val str = "abcd"
    //    println(str.substring(0, 2))
}
