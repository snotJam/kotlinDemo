/**
 * This is an example of a Type-Safe Groovy-style Builder
 *
 * Builders are good for declaratively describing data in your code.
 * In this example we show how to describe an HTML page in Kotlin.
 *
 * See this page for details:
 * http://kotlinlang.org/docs/reference/type-safe-builders.html
 *
 * 例子：生成html文件
 *
 */
package html

fun main(args: Array<String>) {
    val result =
            html {          //调用了html方法，往下有点像符合函数
                head {
                    title { +"XML encoding with Kotlin" }
                }
                body {
                    h1 { +"XML encoding with Kotlin" }
                    p { +"this format can be used as an alternative markup to XML" }

                    // an element with attributes and text content
                    a(href = "http://jetbrains.com/kotlin") { +"Kotlin" }

                    // mixed content
                    p {
                        +"This is some"
                        b { +"mixed" }
                        +"text. For more see the"
                        a(href = "http://jetbrains.com/kotlin") { +"Kotlin" }
                        +"project"
                    }
                    p { +"some text" }

                    // content generated from command-line arguments
                    p {
                        +"Command line arguments were:"
                        ul {
                            for (arg in args)
                                li { +arg }
                        }
                    }
                }
            }
    println(result)
}

/**
 * Element接口
 */
interface Element {
    fun render(builder: StringBuilder, indent: String)
}

/**
 * TextElement
 */
class TextElement(val text: String) : Element {             //类后面的:后面的是继承类或者接口
    /**
     * 拼接字符串
     */
    override fun render(builder: StringBuilder, indent: String) {
        builder.append("$indent$text\n")
    }
}

/**
 * Tag Element
 */
abstract class Tag(val name: String) : Element {
    val children = arrayListOf<Element>()
    val attributes = hashMapOf<String, String>()

    protected fun <T : Element> initTag(tag: T, init: T.() -> Unit): T {        //方法后面的:后面的表示返回结果类型
        tag.init()
        children.add(tag)
        return tag
    }

    override fun render(builder: StringBuilder, indent: String) {
        builder.append("$indent<$name${renderAttributes()}>\n")
        for (c in children) {
            c.render(builder, indent + "  ")
        }
        builder.append("$indent</$name>\n")
    }

    private fun renderAttributes(): String? {
        val builder = StringBuilder()
        for (a in attributes.keys) {
            builder.append(" $a=\"${attributes[a]}\"")
        }
        return builder.toString()
    }


    override fun toString(): String {
        val builder = StringBuilder()
        render(builder, "")
        return builder.toString()
    }
}

abstract class TagWithText(name: String) : Tag(name) {
    operator fun String.unaryPlus() {
        children.add(TextElement(this))
    }
}

class HTML() : TagWithText("html") {
    fun head(init: Head.() -> Unit) = initTag(Head(), init)     //调用到HEAD的无参构造函数

    fun body(init: Body.() -> Unit) = initTag(Body(), init)     //调用到Body的无参构造函数
}

class Head() : TagWithText("head") {
    fun title(init: Title.() -> Unit) = initTag(Title(), init)
}

class Title() : TagWithText("title")

abstract class BodyTag(name: String) : TagWithText(name) {
    fun b(init: B.() -> Unit) = initTag(B(), init)
    fun p(init: P.() -> Unit) = initTag(P(), init)
    fun h1(init: H1.() -> Unit) = initTag(H1(), init)
    fun ul(init: UL.() -> Unit) = initTag(UL(), init)
    fun a(href: String, init: A.() -> Unit) {
        val a = initTag(A(), init)
        a.href = href
    }
}

class Body() : BodyTag("body")
class UL() : BodyTag("ul") {
    fun li(init: LI.() -> Unit) = initTag(LI(), init)
}

class B() : BodyTag("b")
class LI() : BodyTag("li")
class P() : BodyTag("p")
class H1() : BodyTag("h1")

class A() : BodyTag("a") {
    public var href: String
        get() = attributes["href"]!!
        set(value) {
            attributes["href"] = value
        }
}

fun html(init: HTML.() -> Unit): HTML {         //参数init表示是接收一个HTML的构造函数
    val html = HTML()
    html.init()                                 //直接调用init代表的函数，也就是调用HTML的无参构造函数
    return html
}
