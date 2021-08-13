fun main(){
    var estoque = Estoque("Parafuso", -1, 20)
    //mudar nome
    estoque.mudarNome("Martelo")
    println(estoque.nome)
    //Exibindo estoque
    estoque.mostra()
    //retorna verdadeiro ou falso se estoque está precisando de reposição
    println(estoque.precisaRepor())
    //altera quantidade mínima
    println(estoque.mudarQtdMinima(2))
    //repor
    println(estoque.repor(10))
    //baixa quantidade de produto
    println(estoque.darBaixa(11))
}