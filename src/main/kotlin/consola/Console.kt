package consola

import clases.Base
import clases.Class
import clases.Derived
import clases.Heroe
import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

fun main(){

    val scanner = Scanner(System.`in`)

    var n1: Int; var n2: Int; var r: Int
    println("Introduce 2 números")
    println("Introduce primer el numero: ")
    n1 = scanner.nextInt()
    println("Introduce segundo el numero: ")
    n2 = scanner.nextInt()
    r = n1 + n2
    println("El resultado es: $r")

    //----------------------------------------------------

    var n: Int; var i = 1
    println("Introduce un numero para contar multiplicarlo x 10: ")
    n = scanner.nextInt()
    while (i <= 10){
        println("El multiplo de $n * $i es: " + n * i)
        i++
    }

    //------------------------------------------------------

    val clase = Class()
    clase.name = "Hola Omar"
    println(clase.name)

    val derived = Derived(2)
    println(derived.p)

    val heroe = Heroe()
    heroe.correr()
    heroe.volar()

    var nombre: String
    println("Introduce tu nombre para descomponerlo en letras: ")
    nombre = scanner.nextLine()
    for(n in nombre){
        println(n)
    }

    //-------------------------------------

    var catetoA: Double; var catetoB: Double; var c:Double = 0.0
    println("Ingrese la longitud de 2 catetos")
    println("Ingrese el primer cateto")
    catetoA = scanner.nextDouble()
    println("Ingrese el segundo cateto")
    catetoB = scanner.nextDouble()


    c = sqrt(catetoA.pow(2) + catetoB.pow(2))
    println("La hipotenusa es: $c")

    //---------------------------------------------

    var horaActual: Int; var horaFutura: Int; var result: Int
    println("Ingrese 2 horas: presente y futura")
    println("Ingrese la hora actual: ")
    horaActual = scanner.nextInt()
    println("Ingrese la hora futura: ")
    horaFutura = scanner.nextInt()
    result = (horaActual + horaFutura) % 12

    println("Dentro de $horaFutura horas serán las: $result")



}