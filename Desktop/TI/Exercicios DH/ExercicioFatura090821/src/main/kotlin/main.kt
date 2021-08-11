fun main() {
    var listaItem = listOf<Item>(
        Item(1, "lapis", 5, 1.00),
        Item(2, "caderno", 10, 20.0),
        Item(3, "borracha", 5, 1.50)
    )
    var fatura = Fatura(listaItem)
    var total = fatura.totalDaFatura()

    listaItem.map { item -> println(
        "Código do produto: ${item.numeroItem}, " +
        "Produto: ${item.descricaoItem}, " +
        "Quantidade: ${item.quantiaItem}, " +
        "Valor: ${item.precoItem}")
    }
    println("========================================================")

    println("Valor total da fatura: $total")
}