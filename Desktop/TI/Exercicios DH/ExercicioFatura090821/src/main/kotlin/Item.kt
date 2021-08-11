class Item(
    var numeroItem: Int,
    var descricaoItem: String,
    var quantiaItem: Int,
    var precoItem: Double
) {
    init {
        if (numeroItem < 0) {
            numeroItem = 0
        }
        if (quantiaItem < 0) {
            quantiaItem = 0
        }
    }
}