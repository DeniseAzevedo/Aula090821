package Pessoa

fun main() {
    var pessoa1 = Pessoa("Denise", 123456)
    var pessoa2 = Pessoa("Sabrina", 123456)

    println(pessoa1 == pessoa2)

    println(pessoa1.toString())
    println(pessoa2.toString())

    println(pessoa1.hashCode())
    println((pessoa2.hashCode()))
}