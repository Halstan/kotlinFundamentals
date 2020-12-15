package colecciones

fun main(){
    val numberSet = setOf("one", "two", "three", "four")

    //-----------------------------------------------------------------------------------

    val emptySet = mutableSetOf<String>()
    emptySet.add("Hello")
    emptySet.add("World")

    //-----------------------------------------------------------------------------------

    val numbersMap = mapOf("key1" to 1, "key2" to 2)
    numbersMap.get("key1")

    //-----------------------------------------------------------------------------------

    val numbersMap2 = mutableMapOf<String, String>().apply {
        this["one"] = "1"; this["two"] = "2"
    }

    //-----------------------------------------------------------------------------------

    val empty = emptyList<String>()

    //-----------------------------------------------------------------------------------

    //CREATE A LIST WHERE THE SIZE IS 8 AND EVERY ELEMENT IS MULTIPLIED BY 2
    val doubled = MutableList(8) { it * 2 }
    println(doubled)

    //-----------------------------------------------------------------------------------

    //THE COPY OF A LIST DON'T AFFECT THE MAIN LIST, BUT IF THE MAIN LIST IS EDITED THE COPY
    //WILL BE AFFECTED
    val firstList = mutableListOf(1, 2, 3, 4, 5)
    val copyListRead = firstList.toList()
    //copyList.add(6) //WILL PRODUCE ERROR
    val copyListEdit = firstList.toMutableList()
    copyListEdit.add(6)

    println("The size of the first list is ${firstList.size}")
    println("The size of the copyListRead is ${copyListRead.size}")
    println("The size of the copyListEdit is ${copyListEdit.size}")

    //-----------------------------------------------------------------------------------

    //THE COPY OF A LIST CAN BE CONVERTED TO A ANOTHER TYPE OF LIST
    val sourceList = mutableListOf(1, 2, 3)         //mutableListOf
    val copySet = sourceList.toMutableSet()         //CONVERTED TO A 'MutableSet'
    copySet.add(3)
    copySet.add(4)
    println(copySet)

    //-----------------------------------------------------------------------------------

    //WE CAN REFERENCE A LIST IN A VARIABLE AND MANIPULATE THIS WITH THAT REFERENCE
    val sourceList2 = mutableListOf(1, 2, 3)
    val referenceList = sourceList2
    referenceList.add(4)
    println("Source size: ${sourceList2.size}")

    //-----------------------------------------------------------------------------------

    //IF WE INITIALIZED A VARIABLE FOR THIS CASE 'referenceList2', WE CAN RESTRICTED THE MANIPULATION
    //OF THE REFERENCE
    val sourceList3 = mutableListOf(1, 2, 3)
    val referenceList2: List<Int> = sourceList
    //referenceList2.add(4)            //compilation error
    sourceList3.add(4)
    println(referenceList2) // shows the current state of sourceList

    //-----------------------------------------------------------------------------------

    //PRINT THE VALUES WHERE THE LENGTH IF MORE THAN 3
    val numbers = listOf("one", "two", "three", "four", "five")
    val longerThan3 = numbers.filter { it.length > 3 }
    println(longerThan3)

    //-----------------------------------------------------------------------------------

    //PRINT THE VALUES EN THE SET ARRAY AND MULTIPLY FOR 3
    //PRINT AN ARRAY WHERE THE RESULT IS THE INDEX OF EVERY ELEMENT MULTIPLIED BY THE ELEMENT, EXAMPLE
    //INDEX = 0 * VALUE = 1 = 0
    //INDEX = 1 * VALUE = 2 = 2
    val numbers2 = setOf(1, 2, 3)
    println(numbers2.map { it * 3 })
    println(numbers2.mapIndexed { idx, value -> value * idx })

    //----------------------------------- ITERATORS ------------------------------------------------

    //THIS LOOPS IS EQUALS THAN
    val foods = listOf("Causa", "Pizza", "Spaghetti", "Ceviche")
    val iterableFoods = foods.iterator()
    while (iterableFoods.hasNext()){
        println("- ${iterableFoods.next()}")
    }

    //THIS LOOP
    var i = 0
    for (food in foods){
        i++
        println("$i $food")
    }

    //OR THIS LOOP
    //VERY SIMPLE NO?
    foods.forEach {
        println(it)
    }

    //-----------------------------------------------------------------------------------

    val numbers3 = listOf("one", "two", "three", "four")
    val listIterator = numbers3.listIterator()
    while (listIterator.hasNext()) listIterator.next()
    println("Iterating backwards:")
    while (listIterator.hasPrevious()) {
        print("Index: ${listIterator.previousIndex()}")
        println(", value: ${listIterator.previous()}")
    }

}