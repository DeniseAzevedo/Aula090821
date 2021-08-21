package Lambda

import javax.swing.text.StyledEditorKit

fun main() {

    var reset = "\u001B[0m"
    var verde = "\u001B[32m"
    var vermelho = "\u001B[31m"

    val soma = { x: Int, y: Int -> println("$verde Soma $reset de $x + $y = ${x + y}") }
    val subtracao = { x: Int, y: Int -> println("$verde Subtração $reset de $x - $y = ${x - y}") }
    val multiplicacao = { x: Int, y: Int -> println("$verde Multiplicação $reset de $x * $y = ${x * y}") }
    val divisao = { x: Int, y: Int -> println("$verde Divisão $reset de $x : $y = ${x / y}") }

    //operações
    println("***************************************************************")
    soma(10, 5)
    subtracao(10, 5)
    multiplicacao(10, 5)
    divisao(10, 5)
    println("***************************************************************")

    //valida e-mail
    val validaEmail: (String) -> Unit = {
        if (it.contains("@"))
            println("$verde E-mail validado com sucesso! $reset")
        else println("$vermelho E-mail inválido! $reset")
    }

    validaEmail("denise@gmail.com")
    println("***************************************************************")

    //lista de inteiros
    val lista: (List<Int>) -> Unit = {
        var produto: Int = 1
        for( i in it) {
            produto *= i
        }
        println("O produto do conteúdo da lista $it é $verde $produto $reset")
    }

    lista(listOf(1,2,3,4))
    println("***************************************************************")
}

