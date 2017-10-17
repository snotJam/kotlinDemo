package kot_online

/**
 * Created by NewNet on 2017/10/13.
 * while和for循环
 */
fun main(args: Array<String>) {
    var i = 0
    while(i < 3){                   //while循环
        println(i++)
    }

    val arr = arrayOf(1,2,3,4)      //创建数组
    val br1 = arrayOf<Int>()                //其他创建数组方式1
    val arl = arrayListOf<Int>(1,2,3,4)     //其他创建数组方式2，这个数组可以扩展
    arl.add(5)

    for(item in arr){               //遍历item
        println(item)
    }
    for(item in arr.indices){       //遍历item角标
        println(item)
    }

}