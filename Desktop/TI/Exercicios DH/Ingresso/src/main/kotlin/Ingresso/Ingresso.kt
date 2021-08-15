package Ingresso

abstract class Ingresso(var valor: Double) {

    open fun imprimeValor(valor: Double) {
        println("Valor do ingresso: R$$valor")
    }
}