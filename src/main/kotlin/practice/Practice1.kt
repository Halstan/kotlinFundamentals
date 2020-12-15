package practice

import java.util.*

fun main(){

    val scanner = Scanner(System.`in`)

    //----------------------------------- EXERCISE #1 -------------------------------------------------

    /*val number: Int
    var i = 1
    println("Introduce 1 number, this number is be multiplied by 12")
    println("Introduce the number: ")
    number = scanner.nextInt()
    while (i <= 12){
        println("$i * $number = " +  i * number)
        i++
    }*/

    //----------------------------------- EXERCISE #2 -------------------------------------------------

    var y = 1
    println("Introduce the limit")
    println("Introduce number: ")
    val number2 = scanner.nextInt()
    while (y <= number2){
        if (y % 2 == 0 && y % 5 == 0){
            println("$y is divided by 2 and 5")
        }else if(y % 2 == 0){
            println("$y It's pair")
        }else if(y % 5 == 0){
            println("$y It's divided by 5")
        }else{
            println(y)
        }
        y++

    }

}