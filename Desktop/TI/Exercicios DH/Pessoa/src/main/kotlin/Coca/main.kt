package Coca

fun main(){

    var coca1 = Coca(600,3.0)
    var coca2 = Coca(600, 7.0)

    println(coca1 == coca2)

    println(coca1.toString())
    println(coca2.toString())

    println(coca1.hashCode())
    println(coca2.hashCode())
}