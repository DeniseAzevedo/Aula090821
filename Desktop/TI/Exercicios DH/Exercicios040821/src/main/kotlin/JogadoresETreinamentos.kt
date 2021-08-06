fun main() {

    var romario = JogadorDeFutebol("Romario", 10, 10, 10, 10)
    var zico = JogadorDeFutebol("Zico", 5,5,5,5,)
    // treinamento
    SessaoDeTreinamento().treinarA(romario)
    SessaoDeTreinamento().treinarA(zico)
}
