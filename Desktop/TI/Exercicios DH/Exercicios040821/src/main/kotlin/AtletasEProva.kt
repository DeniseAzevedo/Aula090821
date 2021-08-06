fun main() {

    var atleta1 = Atleta("Daiane dos Santos", 10, 10)
    var atleta2 = Atleta("Ronaldo", 5, 5)

    var provaBicilceta = Prova(7, 4)
    var provaNatacao = Prova(5, 8)
    var provaCorrida = Prova(3, 10)
    //atleta1
    println(provaBicilceta.podeRealizar(atleta1))
    println(provaNatacao.podeRealizar(atleta1))
    println(provaCorrida.podeRealizar(atleta1))
    //atleta2
    println(provaBicilceta.podeRealizar(atleta2))
    println(provaNatacao.podeRealizar(atleta2))
    println(provaCorrida.podeRealizar(atleta2))

}