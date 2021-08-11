fun main() {
    //cliente1
    var cliente1 = Clientes(1, "Azevedo", 1234, "123.123.123-12")
    var contaCliente1 = ContaCorrente(1000, cliente1, 100)

    //cliente2
    var cliente2 = Clientes(2, "Pereira", 4567, "456.456.456-45")
    var contaCliente2 = Poupanca(2, cliente2, 500)

    println("TITULAR: ${cliente2.sobrenome}")
    println("saldo ${contaCliente2.saldo}")
    //sacar dinheiro da poupança
    contaCliente2.sacarDinheiro(100)
    println("Saldo após saque da poupança ${contaCliente2.saldo}")
    //recolher juros da poupanca
    println("Juros recolhido da poupança: ${contaCliente2.recolherJuros()}")

    println()//espaço

    println("TITULAR: ${cliente1.sobrenome}")
    println("saldo ${contaCliente1.saldo}")
    //depósito
    contaCliente1.depositarValor(100)
    println("Saldo após depósito: ${contaCliente1.saldo}")
    //saque
    contaCliente1.sacarDinheiro(100)
    println("Saldo após saque: ${contaCliente1.saldo}")
    //usar cheque especial
    contaCliente1.sacarDinheiro(500)
    println("Saldo após saque usando cheque especial: ${contaCliente1.saldo}")
    //depósito de cheque
    contaCliente1.depositarCheque(Cheque(500, "Banco do Brasil", "10/08/21"))
    println("Saldo após depósito de cheque: ${contaCliente1.saldo}")
}