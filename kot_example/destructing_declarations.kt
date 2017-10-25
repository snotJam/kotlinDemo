package kot_online

/**
 * Created by NewNet on 2017/10/13.
 * 解构声明
 * 用参数接收一个对象，其实也就是将对象分解，赋值给参数
 */
fun main(args: Array<String>) {
    val pair = Pair(1, "one")
    val(num, name) = pair                           //解构，前面的参数接收类中的方法返回值

    println("num = $num,name = $name")
}

class Pair<K, V>(val first: K, val second: V) {     //K,V是泛型
    operator fun component1(): K {                  //operator关键字+component1对应解构声明里面的第一个参数
        return first
    }

    operator fun component2(): V {                  //operator关键字+component2对应解构声明里面的第2个参数...依次类推
        return second
    }
}