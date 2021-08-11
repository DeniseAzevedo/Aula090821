class ContaCorrente(
    var chequeEspecial: Int,
    cliente: Clientes,
    saldo: Int
) : Contas(
    cliente,
    saldo
) {

    fun depositarCheque(cheque: Cheque): Boolean {
        saldo += cheque.valor
        return true
    }

    override fun sacarDinheiro(quantia: Int): Int {
        if (quantia <= (saldo + chequeEspecial)) {
            saldo -= quantia
        }
        return saldo
    }
}