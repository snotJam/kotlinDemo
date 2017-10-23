package kot_action

/**
 * Created by NewNet on 2017/10/23.
 * 序列
 */

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4)
    list.asSequence()                                           //asSequence生成一个符合条件的序列
            .map{ print("map($it)"); it*it}                     //[1,4,9,16]
            .filter { print("filter($it)");it % 2 == 0 }        //结果发现是map，filter是一起执行的，一个item先map再filter，然后再下一个item
            .toList()

    val naturalNumbers = generateSequence(0) { it + 1 }               //generateSequence，创建一个序列
    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }
    println(numbersTo100.sum())
}
