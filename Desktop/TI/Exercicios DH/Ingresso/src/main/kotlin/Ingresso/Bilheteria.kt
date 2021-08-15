package Ingresso

import java.util.*

fun main(){

    comprarIngresso()
}

fun comprarIngresso(){
    // alterar cor da fonte para vermelho
    val red = "\u001b[31m"

    // voltar a cor padrão da fonte
    val reset = "\u001b[0m"

    //valor do ingresso padrão
    var padrão = 100.0
    // valor adicional do ingresso vip
    var adicional = 250.0

    val scanner = Scanner(System.`in`)

    println("Qual o ingresso desejado?")
    println(
        """
        1 - Padrão
        2 - VIP
        """.trimIndent()
    )
    // faz a leitura do que se escreve no teclado
    var retornoInicial = scanner.nextInt()

    if(retornoInicial == 1){
        IngressoPadrão(padrão).imprimeValor(padrão)
    } else if(retornoInicial == 2){
        IngressoVip(padrão, adicional).imprimeValor(padrão)
    } else { // Se opção diferente de 1 ou 2 escreve Opção inválida e torna a chamar a função comprarIngresso
        println("$red Opção inválida! $reset")
        comprarIngresso()
    }
}