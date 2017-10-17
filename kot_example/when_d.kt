package kot_online

/**
 * Created by NewNet on 2017/10/13.
 * when{...else...}
 */
fun main(args: Array<String>) {
    val language = if (args.size == 0) "EN" else args[0]      //类似三元
    println(when (language) {                       //相当于switch
        "EN" -> "Hello!"                            //相当于switch中的case
        "FR" -> "Salut!"
        "IT" -> "Ciao!"
        else -> "Sorry, I can't greet you"          //相当于switch中的default，但这里是必须存在的
    })

}
