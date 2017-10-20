package kot_action

/**
 * Created by NewNet on 2017/10/20.
 * 对字符串处理
 */

/**
 * 分割字符串
 */
fun stringSplit() {
    println("12.345-6.A,B".split("\\.|-|,".toRegex()))            //split返回数组，元素以","分割，这里的分割规则是以.或者-或者,来分割
}

fun stringSplits() {
    println("12.345-6.A,B".split(".", ","))                       //遇到"."和","就分割字符串,Java中貌似只能指定一个分隔符
}

/**
 * 截取字符串
 */
fun stringSub(path: String) {
    val dir = path.substringBeforeLast("/")                     //截取最后一个"/"之前的
    val name = path.substringAfterLast("/")                     //截取最后一个"/"之后的
    val fn = name.substringBeforeLast(".")
    val extension = name.substringAfterLast(".")

    println("Dir: $dir, name: $name, ext:$extension")
}

/**
 * 正则匹配
 */
fun parsePath(path: String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()                             //String.toRegex表示转换为正则，"""..."""表示里面的内容不会被转义
    val matchResult = regex.matchEntire(path)                               //进行匹配，匹配失败会返回null
    if (matchResult != null) {
        val (directory, filename, extension) = matchResult.destructured
        println("Dir: $directory, name: $filename, ext: $extension")
    }
}

/**
 * trimMargin
 * 测试结果：
 * 发现：
 *  指定的边缘分隔符如果是这一行的第一个非空格字符，它前面的空格和自己会被一起删除
 *  如果指定的边缘分隔符不在行首，那么这一行前面的空格和指定的分隔符都不会被删除
 *  只有存在指定分割符的行才会受影响，如果直接由一行空格，也不会受影响
 *
 */
fun trimMar() {
    val kotlinLogo = """| //
                    .|//.|
                    .|/ \
                    """
    println(kotlinLogo.trimMargin("|"))
}

fun main(args: Array<String>) {
    stringSplit()
    stringSplits()
    stringSub("/User/yole/kotlin-book/chapter.adoc")
    parsePath("/User/yole/kotlin-book/chapter.adoc")
    trimMar()
}