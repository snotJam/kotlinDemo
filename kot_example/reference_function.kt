package kot_online

/**
 * Created by NewNet on 2017/10/17.
 * 调用函数引用
 */
fun main(args: Array<String>) {
    val number = listOf(1, 2, 3)
    println(number.filter(::isOdd))         //filter是过滤方法，参数是一个lambda表达式，::表示直接引用这个方法
    println(number.filter { it % 2 != 0 })  //与上面的结果相同，上面的调用时将这个表达式封装为一个方法，然后使用::调用。
                                            //1，方法的最后一个参数是函数，可以写在参数的括号外面使用lambda表达式{x->表达式}；参考Delegates.observable
                                            //2，方法只有一个参数，可以使用表达式{}
}

fun isOdd(x: Int) = x % 2 != 0