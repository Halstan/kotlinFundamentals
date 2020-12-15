package operations

fun main(){

    //THE RESULT OF THE FIRST FILTER IS LOOSED BECAUSE WE ARE NOT STORAGE THE VALUE
    val heroes = listOf("Spiderman", "IronMan", "Batman", "Hulk")
    heroes.filter { it.length > 3 }  // nothing happens with `numbers`, result is lost
    println("Heroes are still $heroes")

    val longerThanOrEquals3 = heroes.filter { it.length >= 6 } // result is stored in `longerThanOrEquals3`
    println("Heroes longer than 3 chars are $longerThanOrEquals3")

    //-----------------------------------------------------------------------------------

    val numbers = mutableListOf("one", "two", "three", "four")
    val sortedNumbers = numbers.sorted()
    println(numbers == sortedNumbers)
    numbers.sort()
    println(numbers == sortedNumbers)

    //-----------------------------------------------------------------------------------

    //ZIPPING: BUILD PAIRS FROM THE ELEMENTS WITH THE SAME POSITION IN BOTH COLLECTIONS
    //EXAMPLE: IN 'heroes2' WE HAVE THE FIRST ELEMENT IS 'Spiderman' AND IN 'powers' THE FIRST ELEMENT
    //IS 'SpiderSense', THE RESULT IS [(Spiderman, SpiderSense)] BECAUSE 'Spiderman' AND 'SpiderSense' ARE IN THE POSITION 0

    val heroes2 = listOf("Spiderman", "Batman", "Hulk")
    val powers = listOf("SpiderSense", "Intelligence", "SuperStrength")
    println(heroes2 zip powers)

    val twoHeroes = listOf("Spiderman", "Batman")
    println(powers.zip(twoHeroes))

    println(heroes2.zip(powers) {hero, power -> "The hero ${hero.capitalize()} have the power of $power"})

    //-----------------------------------------------------------------------------------

    //UNZIPPING
    //SEPARATES A MAP INTO TWO LIST
    val numberPairs = listOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    println(numberPairs.unzip())

    //-----------------------------------------------------------------------------------

    //FLATTENING
    data class StringContainer(val values: List<String>)

    val containers = listOf(
            StringContainer(listOf("one", "two", "three")),
            StringContainer(listOf("four", "five", "six")),
            StringContainer(listOf("seven", "eight"))
    )
    println(containers.flatMap { it.values })

    //-----------------------------------------------------------------------------------

    val foods = listOf("Pizza", "Bread", "Ceviche", "Spaghetti")
    println(foods.joinToString(separator = " | ", prefix = "Foods: ", postfix = ": end"))

    //-----------------------------------------------------------------------------------

    //PRINT THE FIRST 15 ELEMENT IN A LOOP
    val numbers2 = (1..100).toList()
    println(numbers2.joinToString(limit = 15, truncated = "<...>"))
}