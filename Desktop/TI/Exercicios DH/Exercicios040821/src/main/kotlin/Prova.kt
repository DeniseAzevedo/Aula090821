class Prova(var dificuldade: Int, var energiaNecessaria: Int) {

    fun podeRealizar(atleta: Atleta): Boolean {
        if(atleta.nivel >= dificuldade && atleta.energia >= energiaNecessaria) {
            return true
        } else {
            return false
        }
    }
}