class SessaoDeTreinamento() {

    fun treinarA(jogador: JogadorDeFutebol){
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        println("Esperiência inicial do jogador é " + jogador.experiencia)
        jogador.experiencia++
        println("Esperiência final do jogador é " + jogador.experiencia)


    }
}