package kot_action

import java.util.*

/**
 * Created by NewNet on 2017/10/19.
 * map的遍历
 */
fun main(args: Array<String>) {
    val banaryReps = TreeMap<Char, String>()

    for (c in 'A'..'F') {                                       //字符范围要使用单引号，双引号报错
        val binary = Integer.toBinaryString(c.toInt())          //c.toInt：将字符转换为int；Integer,toBinaryString()将int转换为二进制，用String展示
        banaryReps[c] = binary                                  //map[key]=value    设置map的键值对(应该是这样)
//        banaryReps.put(c,binary)                              //与上面设置键值对方式结果是一致的
    }

    for ((key, value) in banaryReps) {                          //for遍历map
        println("$key = $value")
    }

}
