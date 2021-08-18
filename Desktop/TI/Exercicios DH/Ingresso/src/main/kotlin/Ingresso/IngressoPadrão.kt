package Ingresso

class IngressoPadrão(valor: Double): Ingresso(valor) {

    override fun imprimeValor(){
        println("Valor do Ingresso Padrão: R$$valor")
    }
}