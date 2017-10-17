package kot_online

/**
 * Created by NewNet on 2017/10/17.
 * 啤酒歌，感觉没什么用...
 */

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        printBottles(99)
    }
}

fun printBottles(bottleCount: Int) {
    if (bottleCount <= 0) {
        println("No bottle - no song")
        return
    }

    println("The \"${bottlesOfBeer(bottleCount)}\" song\n")
    var bottles = bottleCount
    while (bottles > 0) {
        val bottlesOfBeer = bottlesOfBeer(bottles)
        print("$bottlesOfBeer on the wall, $bottlesOfBeer.\n Take one down, pass it around, ")
        bottles--
        print("${bottlesOfBeer(bottles)} on the wall.\n")
    }
    println("No more bottles of beer on the wall, no more bottles of beer.\n" +
            "Go to the store and buy some more, ${bottlesOfBeer(bottleCount)} on the wall.")
}

fun bottlesOfBeer(bottleCount: Int): String = when (bottleCount) {
    0 -> "no more bottles"
    1 -> "1 bottle"
    else -> "$bottleCount bottles"
} + "of beer"

val <T> Array<T>.isEmpty: Boolean get() = size == 0

