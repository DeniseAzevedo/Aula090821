class Poupanca(var taxaJuros: Int, cliente: Clientes, saldo: Int) : Contas(cliente, saldo) {

    fun recolherJuros(): Int {
        var juros = (saldo * taxaJuros)/100
        saldo -= juros
        return juros
    }
}