@file:Suppress("UNUSED_PARAMETER")

package lesson3.task1

import kotlin.math.sqrt

// Урок 3: циклы
// Максимальное количество баллов = 9
// Рекомендуемое количество баллов = 7
// Вместе с предыдущими уроками = 16/21

/**
 * Простая (2 балла)
 *
 * Найти количество цифр в заданном числе n.
 * Например, число 1 содержит 1 цифру, 456 -- 3 цифры, 65536 -- 5 цифр.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun main() {
    println("**Find the number of digits in a given number n**")
    print("Write any number: ")
    val number = Integer.valueOf(readLine())

    if (number < 100000000) {
        if (number < 100000000 && number >= 10000000) {
            println("$number => 8 digits")
        }
        if (number < 10000000 && number >= 1000000) {
            println("$number => 7 digits")
        }
        if (number < 1000000 && number >= 100000) {
            println("$number => 6 digits")
        }
        if (number < 100000 && number >= 10000) {
            println("$number => 5 digits")
        }
        if (number < 10000 && number >= 1000) {
            println("$number => 4 digits")
        }
        if (number < 1000 && number >= 100) {
            println("$number => 3 digits")
        }
        if (number < 100 && number >= 10) {
            println("$number => 2 digits")
        }
        if (number < 10 && number >= 0) {
            println("$number => 1 digit")
        }
    } else {
        println("$number this number is too big")
    }

    /**
     * Простая (2 балла)
     *
     * Найти число Фибоначчи из ряда 1, 1, 2, 3, 5, 8, 13, 21, ... с номером n.
     * Ряд Фибоначчи определён следующим образом: fib(1) = 1, fib(2) = 1, fib(n+2) = fib(n) + fib(n+1)
     */
    val fib1 = 1
    val fib2 = 1
    println("number: ")
    val num = Integer.valueOf(readLine())
    val i1 = 3
    for (i1 in i1..num) {
        val i1 = i1 + 1
        println("$i1")
        val fib3 = fib1 + fib2
        val fib1 = fib2
        val fib2 = fib3
    }
    println("$fib2")

    /**
     * Простая (2 балла)
     *
     * Для заданного числа n > 1 найти минимальный делитель, превышающий 1
     */
    println("integr: ")
    val int = Integer.valueOf(readLine())

    val i2 = 1
    while (i2 in i2..int) {
        val i2 = i2 + 1
        if (int % i2 == 0) {
            println("$i2 minDivistor")
        } else {
            println("Not Found!")
        }
        break
    }

    /**
     * Простая (2 балла)
     *
     * Для заданного числа n > 1 найти максимальный делитель, меньший n
     */
    println("integr: ")
    val integer = Integer.valueOf(readLine())

    val i3 = 1
    while (i3 in i3..integer) {
        val i3 = i3 + 1
        if (integer % i3 != 0) {
            println("$i3 maxDivisor")
        } else {
            println("Not Found!")
        }
        break
    }

    /**
     * Простая (2 балла)
     *
     * Гипотеза Коллатца. Рекуррентная последовательность чисел задана следующим образом:
     *
     *   ЕСЛИ (X четное)
     *     Xслед = X /2
     *   ИНАЧЕ
     *     Xслед = 3 * X + 1
     *
     * например
     *   15 46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1 4 2 1 4 2 1 ...
     * Данная последовательность рано или поздно встречает X == 1.
     * Написать функцию, которая находит, сколько шагов требуется для
     * этого для какого-либо начального X > 0.
     */
    println("**Even and odd**")
    print("Write any digits: ")
    val digit = Integer.valueOf(readLine())
    var c = 0
    while (digit != 1) {
        if (digit % 2 == 0) {
            val digit = digit / 2
        } else {
            val digit = (3 * digit) + 1
        }
        c++
    }
    println("$digit")
    println("$c")

    /**
     * Средняя (3 балла)
     *
     * Для заданных чисел m и n найти наименьшее общее кратное, то есть,
     * минимальное число k, которое делится и на m и на n без остатка
     */
    print("m = ")
    val m = Integer.valueOf(readLine())
    print("n = ")
    val n = Integer.valueOf(readLine())

    if (m == n) {
        println("$m")
    }
    val k = m - n
    if (k < 0) {
        val k = -k
    } else {
        println("$n, $k")
    }
}