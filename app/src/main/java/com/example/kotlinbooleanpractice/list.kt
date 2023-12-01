package com.example.kotlinbooleanpractice

fun main() {
//    val num = arrayOf(1,2,3,4,5)
//    println(num.contentToString())
    
    val num2 = arrayListOf<Int>(2,4,6,8,9)

    var total = 0
    for (i in num2)
    {
        total += i
    }
    var avg = total/ num2.size
    println("Total of the array is = $total")
    println("Avg of List is = $avg")

}