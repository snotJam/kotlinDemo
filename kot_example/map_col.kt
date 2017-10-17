package kot_online

/**
 * Created by NewNet on 2017/10/13.
 * map的使用
 */
fun main(args: Array<String>) {
    val map = hashMapOf<String,Int>()
    map.put("a",1)
    map.put("b",2)

    for((key,value) in map){                        //遍历map
        println("key = $key, value = $value")
    }
}