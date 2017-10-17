package kot_online

/**
 * Created by NewNet on 2017/10/13.
 * 转义字符获取引用值
 */

fun main(args: Array<String>) {
    if(args.size == 0){
        println("please provider a name as a command-lind argument")
        return
    }
    println("Hello ${args[0]}")     //在""号中使用$转义字符表示引用值，$与引用之间不能有空格
}
