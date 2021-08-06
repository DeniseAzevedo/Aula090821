fun main() {
    //cliente Denise
    var denise = Cliente("Denise", "Azevedo")
    var contaDenise = Conta(1234,100.0, denise)
    //cliente Sabrina
    var sabrina = Cliente("Sabrina", "Pereira")
    var contaSabrina = Conta(4567, 200.0, sabrina)
    //deposito em contas
    contaSabrina.deposito(100.0)
    contaDenise.deposito(500.0)
    //saque em contas
    contaSabrina.saque(200.0)
    contaDenise.saque(500.0)

}