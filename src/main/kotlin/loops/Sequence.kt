package loops

fun main(){

    val numbersSequence = sequenceOf("four", "three", "two", "one")
    numbersSequence.forEach(::println)

    //-----------------------------------------------------------------------------------

    val numbers = listOf("one", "two", "three", "four")
    val numbersSequence2 = numbers.asSequence()

    //-----------------------------------------------------------------------------------

    val oddNumbers = generateSequence(1) { it + 2} // `it` is the previous element
    println(oddNumbers.take(5).toList())

}