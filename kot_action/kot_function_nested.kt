package kot_action

/**
 * Created by NewNet on 2017/10/20.
 * 嵌套方法
 */
class User3(val id: Int, val name: String, val address: String)

/**
 * 扩展函数
 */
fun User3.validateBeforeSave() {
    fun validate(value: String, filedName: String) {                //这是一个函数内的嵌套函数，作用域在函数内
        if (value.isEmpty()) {
            println("value is Empty")
        }
    }

    validate(name, "Name")                                          //内嵌函数的调用要在函数声明之后

}

fun saveUser(user: User3) {
    user.validateBeforeSave()
}


fun main(args: Array<String>) {
    saveUser(User3(1,"","add=BJ"))
}
