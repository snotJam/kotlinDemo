package kot_action

/**
 * Created by NewNet on 2017/10/23.
 */
fun createAllDoneRunnable() : Runnable{
    return Runnable { println("All done!") }
}

fun main(args: Array<String>) {
    createAllDoneRunnable().run()
}