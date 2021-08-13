class Estoque(var nome: String, var qtdAtual: Int, var qtdMinima: Int) {

    init{
        if(qtdMinima < 0 )
            qtdMinima = 0

        if(qtdAtual < 0)
            qtdAtual = 0
    }

    fun mudarNome(nome: String): Unit{
        this.nome = nome
    }

    fun mudarQtdMinima(qtdMinima: Int): String {
        if(qtdMinima < 0){
            return("Estoque zerado, necessário repor.")
        } else {
            this.qtdMinima = qtdMinima
            return("Quantidade mínima $qtdMinima")
        }
    }

    fun repor(qtd: Int): Unit{
        qtdAtual += qtd
        println("Quantidade atual no estouqe é $qtdAtual.")
    }

    fun darBaixa(qtd: Int): String{
        if((qtdAtual - qtd) < 0){
            return("Estoque contém apenas $qtdAtual unidades.")
        } else {
            qtdAtual -= qtd
            return("Baixa dada em $qtd unidades. Quantidade atual do estoque é (são) $qtdAtual unidade(s).")
        }
    }

    fun mostra(): Unit{
        println("Produto: $nome, Quantidade mínima: $qtdMinima, Quantidade atual: $qtdAtual")
    }

    fun precisaRepor(): Boolean{
        return qtdAtual <= qtdMinima
    }
}
