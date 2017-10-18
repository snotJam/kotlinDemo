package kot_action

/**
 * Created by NewNet on 2017/10/18.
 * String 模板 $
 */

fun main(args: Array<String>) {
    val name = if (args.size > 0 ) args[0] else "Kotlin"
    println("Hello, $name")         //$后面跟引用，表示使用引用值
}

fun templates1(args: Array<String>) {
    if(args.size > 0){
        println("Hello, ${args[0]}")        //$后面{}内部是一个表达式
    }
}
