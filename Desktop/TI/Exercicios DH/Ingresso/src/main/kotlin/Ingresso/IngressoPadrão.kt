package Ingresso

class IngressoPadrão(valor: Double): Ingresso(valor) {

    override fun imprimeValor(valor: Double){
        println("Valor do Ingresso Padrão: R$$valor")
    }
}