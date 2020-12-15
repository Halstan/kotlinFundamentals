package tipoDatos

fun main(){

    println("Hola mundo");
    val age: Int = 20
    var altura: Double = 1.80000
    var peso: Float = 80.5F
    var esMujer:Boolean = true
    var tarjeta: Long = 4687984651431

    println(age)
    println(altura)
    println(peso)
    println(esMujer)
    println(tarjeta)

    val name: String = "Selina Kyle"
    println(name)
    val nameLength: Int = name.length
    println(nameLength)
    val isEmpty: Boolean = name.isEmpty()
    println(isEmpty)
    var nameContains: Boolean = name.contains("Selina")
    println(nameContains)
    nameContains = name.contains("Emma")
    println(nameContains)

    val mySubstring: String = name.substring(2, 5)
    println(mySubstring)

    val replace: String = name.replace("e", "o")
    println(replace)

    val description = "Hola soy $name, tengo $age años y mido $altura cm"
    val stringFormat: String = String.format("Hola soy %s, tengo %d años y mido %.2f cm", name, age, altura);

    println(stringFormat)

    //-------------------------------------------------------------

    val a = 1_000_000
    println(a)

    val x = 5 / 2
    //println(x == 2.5) // ERROR: Operator '==' cannot be applied to 'Int' and 'Double'
    println(x == 2)

    val y = 5L / 2
    println(y == 2L)

}