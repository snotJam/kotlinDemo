package kot_online

/**
 * Created by NewNet on 2017/10/13.
 */
fun main(args: Array<String>) {
    val m = 0
    val n = 4
    if(m in 1..5){              //in   1..5  表示在1-5的范围内
        println(m)
    }

    if(n !in 1..4){             //!in  表示不在范围内
        println(n)
    }

    for(it in 1..5){            //循环范围内的item
        println(it)
    }

    val array = arrayListOf("aaa","bbb","ccc")
    if("aaa" in array){         //in 集合是否包含
        println("aaa")
    }

}