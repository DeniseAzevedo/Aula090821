class Conta(var numeroConta: Int, var saldo: Double, var titular: Cliente) {

    fun deposito(valor: Double){
        this.saldo += valor
        println("Deposito realizado com sucesso. Novo saldo é R$" + saldo)
    }

    fun saque(valor: Double) {
        if( saldo >= valor) {
            this.saldo -= valor
            println("Transação realizada! Seu saldo é R$" + saldo)
        } else println("Saldo insuficiente")

    }
}