package kot_action

import java.math.BigDecimal

/**
 * Created by NewNet on 2017/10/25.
 * 都说operator是一个重载操作符, 自带的运算符操作是+,-,*,/，等，一般适用于基本数据类型
 * 在Kotlin中，我们可以使用operator决定某个其他类型的运算符的实现，也就是说我们可以定义一个例如User的+的操作
 * 重载是指一个类中的方法名相同，但是参数不同
 */

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}

operator fun Point.times(scale: Double): Point {
    return Point((x * scale).toInt(), (y * scale).toInt())
}

operator fun Point.plus(other: Point): Point {
    return Point(x + other.x, y + other.y)
}

operator fun Point.unaryMinus(): Point {
    return Point(-x, -y)
}

operator fun BigDecimal.inc() = this + BigDecimal.ONE

fun main(args: Array<String>) {
    val point = Point(1,2);
    point.times(1.2)

}