package colecciones

fun main(){

    val nombres = mutableListOf("Enzo", "Daniel", "Marcus", "Jhon")
    nombres.add("Tobi")
    val lugar = nombres[2]
    println(nombres)
    println(lugar)

    //-------------------------------------- COLLECTION ---------------------------------------------

    fun printAll(strings: Collection<String>) {
        for(s in strings) print("$s, ")
        print(strings.size)
        println()
    }

        val stringList = listOf("one", "two", "one")
        printAll(stringList)

        val stringSet = setOf("one", "two", "three")
        printAll(stringSet)

    //-------------------------------------- MUTABLELIST ---------------------------------------------

    fun List<String>.getShortWordsTo(shortWords: MutableList<String>, maxLength: Int) {
        this.filterTo(shortWords) {
            it.length <= maxLength
        }
        // throwing away the articles
        val articles = setOf("a", "A", "an", "An", "the", "The")
        shortWords -= articles
    }

    val words = "A long time ago in a galaxy far far away".split(" ")
    val shortWords = mutableListOf<String>()
    words.getShortWordsTo(shortWords, 5)
    println(shortWords)

    val words2 = "The big foot".split(" ")
    val shortWords2 = mutableListOf<String>()
    words2.getShortWordsTo(shortWords2, 7)
    println(shortWords2)

    //--------------------------------------- LIST OF WITH STRINGS --------------------------------------------

    val numbers = listOf("one", "two", "three", "four", "five")
    println("Number of elements: ${numbers.size}")
    println("Third element: ${numbers.get(2)}")
    println("Fourth element: ${numbers[3]}")
    println("Five element: ${numbers[4]}")
    println("Last element: ${numbers.size - 1}")
    println("Index of element \"two\" ${numbers.indexOf("two")}")

    //----------------------------------- LISTOF WITH OBJECTS ------------------------------------------------

    data class Person(val name: String, var age: Int)

    val jhon = Person("Jhon", 25)
    val people = listOf(Person("Douglas", 42), jhon, jhon)
    val people2 = listOf(Person("Douglas", 42), Person("Jhon", 25), jhon)
    println(people == people2)
    jhon.age = 18
    print(people == people2)

    //------------------------------------- MUTABLELISTOF ----------------------------------------------

    val numbersMu = mutableListOf(1, 2, 3, 4)
    numbersMu.add(5)
    numbersMu.removeAt(1)
    numbersMu[0] = 0
    numbersMu.shuffle()
    println(numbersMu)

    //---------------------------------- MAPS -------------------------------------------------

    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)

    println("All keys: ${numbersMap.keys}")
    println("All values: ${numbersMap.values}")
    if ("key2" in numbersMap) println("Value by key \"key2\": ${numbersMap["key2"]}")
    if (1 in numbersMap.values) println("The value 1 is in the map")
    if (numbersMap.containsValue(1)) println("The value 1 is in the map")

    val numbersMap2 = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)
    val anotherMap = mapOf("key2" to 2, "key1" to 1, "key4" to 1, "key3" to 3)

    println("The maps are equal: ${numbersMap2 == anotherMap}")

    val numbersMap3 = mutableMapOf("one" to 1, "two" to 2)
    numbersMap3.put("three", 3)
    numbersMap3["one"] = 11

    println(numbersMap3)


}