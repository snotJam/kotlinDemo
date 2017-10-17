package kot_online

/**
 * Created by NewNet on 2017/10/13.
 */
fun main(args: Array<String>) {
    println(getString("xxx"))
    println(getString(1))
}

fun getString(obj: Any): Int? {
    if (obj is String) {            //is判断是否是这个类型
        return obj.length
    }
    return null
}