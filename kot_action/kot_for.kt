package kot_action

/**
 * Created by NewNet on 2017/10/19.
 * for循环遍历
 *
 */

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz"           //==判断结果
    i % 3 == 0 -> "Fizz"
    i % 5 == 0 -> "Buzz"
    else -> "$i"
}

fun main(args: Array<String>) {
    for(i in 1..100){                   //1到100范围遍历循环，in是范围判断
        println(fizzBuzz(i))
    }

    for(i in 100 downTo 1 step 2){      //100 downTo 1，从100降到1，step：每几步执行一次，默认遍历是1，就是遍历到一个数值执行一次，
                                        // 这里step 2就表示遍历2个数值才执行一次，第一次是100，执行一次，第二次是98而不是99
        println(fizzBuzz(i))
    }
}