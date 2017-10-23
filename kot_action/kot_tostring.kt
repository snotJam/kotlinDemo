package kot_action

/**
 * Created by NewNet on 2017/10/23.
 *
 */
class Client(val name: String, val postalCode: Int)

data class Client1(val name: String,val postalCode: Int)

fun main(args: Array<String>) {
    val client1 = Client("Alice", 342562)
    val client2 = Client("Alice", 342562)
    println(client1 == client2)                         //==，两个对象不同

    val bob = Client1("Bob",973293)
    println(bob.copy(postalCode = 382555))              //copy()复制一个bob对象
    println(bob)
}