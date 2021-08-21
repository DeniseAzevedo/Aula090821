package DataPessoa

fun main(){

    var pessoa1 = DataPessoa("Denise", 123456)
    var pessoa2 = DataPessoa("Denise", 123456)

    println(pessoa1.toString())
    println(pessoa2.toString())

    println(pessoa1.hashCode())

    println(pessoa1 == pessoa2)
}