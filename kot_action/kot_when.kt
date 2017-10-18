package kot_action

/**
 * Created by NewNet on 2017/10/18.
 * when调用
 * 普通条件，函数条件，没有条件
 */
enum class Color2 {
    RED, DRANGE, YELLOW, GREEN
}

fun getMnemonic(color1: Color1) = when (color1) {           //方法返回值是一个表达式的时候可以直接用fun xxx()=表达式，此时的when相当于Java中的switch
    Color1.RED -> "RED"
    Color1.DRANGE -> "DRANGE"
    Color1.YELLOW -> "YELLOW"
    Color1.GREEN -> "GREEN"
    Color1.RED, Color1.GREEN, Color1.YELLOW -> "Color"          //多个
    else -> "NULL"
}

fun mix(c1:Color,c2:Color) = when(setOf(c1,c2)){            //when后面的条件是一个方法调用
    setOf(Color.RED, Color.GREEN) -> "RG"
    setOf(Color.YELLOW, Color.GREEN) -> "YG"
    else -> throw Exception("Dirty color")
}

fun mix1(c1:Color,c2:Color) = when{                         //when后面没有条件
    (c1 == Color.RED) -> "RED"
    (c2 == Color.GREEN) -> "Green"
    else -> throw Exception("Dirty color")
}


fun main(args: Array<String>) {
    println(getMnemonic(Color1.GREEN))
}