package Imprimivel

class Documento() : Imprimivel {

    override var nome = "documento"
    override var tipoDeDocumento = "RG"

    override fun imprimir(): String {
        return ("\n DOCUMENTO -> Eu sou $nome, $tipoDeDocumento")
    }
}