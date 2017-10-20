package kot_action

/**
 * Created by NewNet on 2017/10/20.
 * 这是一个验证的例子
 */
class User2(val id: Int, val name: String, val address: String)

fun saveUser(user: User2) {
    if(user.name.isEmpty()){                   //String.isEmpty判断String值是否为空字符串
        println("${user.name}")
    }

    if (user.address.isEmpty()) {              //判断String值是否为空字符串
        println("${user.id}")
    }
}

fun main(args: Array<String>) {
    saveUser(User2(1,"",""))
}