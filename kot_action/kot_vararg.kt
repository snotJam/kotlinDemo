package kot_action

/**
 * Created by NewNet on 2017/10/20.
 * 可变参数
 * Java中的可变参数形式为  类型...参数名，只能是最后一个参数，在函数内可以当做数组来使用
 */

class Book(val name: String) {                          //类的构造方法函数可以声明val，不声明默认为val

}

fun vargs(vararg params: String, age: Int) {            //1：方法参数不能声明val或者var；2：可变参数不一定要位于最后一个，但是可以在方法内当做数组使用
    println(params[0])
}

fun vargs(id: Int, vararg params: String, age: Int) {   //1：方法参数不能声明val或者var；2：可变参数不一定要位于最后一个，但是可以在方法内当做数组使用
    println(params[0])
}

fun main(args: Array<String>) {
    vargs("1", "2", "3", age = 3)                       //调用有可变参数的函数，可变参数后面的需要用 参数名=值 的方式来传递
    vargs(2, "3", "4", age = 6)
}
