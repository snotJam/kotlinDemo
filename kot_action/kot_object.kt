package kot_action

import java.io.File
import java.util.*

/**
 * Created by NewNet on 2017/10/23.
 * 单例对象
 * 伴生对象
 */
object CaseInsensitiveFileComparator : Comparator<File>{            //object关键字，类似class，创建一个单例对象类，不提供构造方法
    override fun compare(o1: File?, o2: File?): Int {
        throw UnsupportedOperationException()
    }

}

object SingleTon{
    fun sing(){println("SingleTon sing song")}
}

class A{
    companion object{                                       //companion object伴生对象关键字，很多博客说类似于Java中的static，而kotlin中是没有static的
        fun bar(){
            println("companion object called")
        }
    }
}

fun main(args: Array<String>) {
    SingleTon.sing()
    A.bar()
}