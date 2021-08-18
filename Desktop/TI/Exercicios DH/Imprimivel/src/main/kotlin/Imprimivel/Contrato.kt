package Imprimivel

class Contrato() : Imprimivel {

    override var nome = "contrato"
    override var tipoDeDocumento = "contrato de trabalho"

    override fun imprimir(): String {
        return "\n CONTRATO -> Eu sou $nome, $tipoDeDocumento \n"
    }
}