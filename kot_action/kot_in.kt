package kot_action

/**
 * Created by NewNet on 2017/10/19.
 * in关键字进行范围判断
 */
fun main(args: Array<String>) {
    println(recognize('7'))
}

fun recognize(c:Char) = when(c){
    in '0'..'8' -> "num String"                 //in判断是否在这个范围
    !in '0'..'5' -> "num > 5"                   //!in判断不在这个范围，当when里面的条件满足一个后，后面的不再执行
    in 'a'..'z',in 'A'..'Z' -> "char"
    else -> "don't know"
}