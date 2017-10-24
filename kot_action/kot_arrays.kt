package kot_action

/**
 * Created by NewNet on 2017/10/24.
 * arrays
 */

fun collect(){
    val source1: Collection<String> = arrayListOf("1","2")
    val source2: MutableCollection<String> = arrayListOf("1","2")           //Mutable表示是可以改变的，而上面的是只读的，只读的没有add方法
    source2.add("3")
}

fun main(args: Array<String>) {
    for (i in args.indices) {                           //对角表遍历
        println("Argument $i is: ${args[i]}")
    }

    val letters = Array<String>(26) { i -> ('a' + i).toString() }       //创建一个26个元素的Array，内部元素是后面的表达式计算的
    println(letters.joinToString(""))

    val strings = listOf("a", "b", "c")
    println("%s/%s/%s".format(*strings.toTypedArray()))                 //转换

    val squares = IntArray(5) { i -> (i+1) * (i+1) }                    //
    println(squares.joinToString())

    args.forEachIndexed { index, element ->
        println("Argument $index is: $element")
    }
}
