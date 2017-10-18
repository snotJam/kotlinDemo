package kot_action

/**
 * Created by NewNet on 2017/10/18.
 * 枚举构造，也和Java相似
 */
enum class Color1(var r: Int, var g: Int, var b: Int) {
    RED(255, 0, 0), DRANGE(255, 165, 0), YELLOW(255, 255, 0), GREEN(0, 255, 0);     //这里必须有;结尾，和Java一样

    fun rgb() = (r * 256 + g) * 256 + b
}


fun main(args: Array<String>) {
    println(Color1.YELLOW.rgb())

}

