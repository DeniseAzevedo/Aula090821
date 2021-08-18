package Imprimivel

interface Imprimivel {
    var nome: String
    var tipoDeDocumento: String

    open fun imprimir(): String

}