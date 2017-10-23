package kot_action

/**
 * Created by NewNet on 2017/10/23.
 * 嵌套类，密封类
 */
class Outer {
    inner class Inner {                                  //inner内部类关键字
        fun getOuterReference(): Outer = this@Outer      //内部类使用外部类
    }
}

/**
 * 密封类
 */
sealed class Expro {                                            //sealed密封类关键字
    class Num(val value: Int) : Expro()                         //密封类内部方法声明是class？返回是外部类对象，这里调用了构造函数
    class Sum(val left: Expro, val right: Expro) : Expro()
}

fun eval(e: Expro): Int = when (e) {
    is Expro.Num -> e.value                                     //调用密封类的内部class声明的方法?
    is Expro.Sum -> eval(e.right) + eval(e.left)                //这里调用了自己，是个递归
}


