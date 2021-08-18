package Ingresso

class IngressoVip(valor: Double, var valorAdicional: Double): Ingresso(valor) {

    override fun imprimeValor(){
        var valorIngressoVip = valor + valorAdicional
        println("Valor do Ingresso Vip: R$$valorIngressoVip")
    }
}