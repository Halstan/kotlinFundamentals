package funciones

fun main() {

    fun sumar(n1: Int, n2: Int): Int {
        return n1 + n2
    }

    val r = sumar(21, 5)

    print(r)

    //-----------------------------------------------------------------------------------

    fun contar(n: Int) {
        for (i in 1..n)
            println(i * 2)
    }

    contar(40)

    //-----------------------------------------------------------------------------------

    fun bucle2(n2: Int) {
        var i = 1
        while (i <= n2) {
            if (i % 2 == 0) {
                println("$i es par")
            } else {
                println("$i es impar")
            }
            i++
        }
    }

    bucle2(10)

}