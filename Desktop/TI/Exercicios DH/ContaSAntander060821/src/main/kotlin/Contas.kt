open class Contas(var cliente: Clientes, var saldo: Int) {

    fun depositarValor(quantia: Int): Unit {
        saldo += quantia
    }

    open fun sacarDinheiro(quantia: Int): Int {
        if (saldo >= quantia) {
            saldo -= quantia
        }
        return saldo
    }

    open fun consultarSaldo(): Int {
        return saldo
    }
}

