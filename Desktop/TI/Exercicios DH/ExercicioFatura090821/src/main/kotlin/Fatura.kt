class Fatura(var listaItens: List<Item>){

    fun totalDaFatura(): Double{
        var valorTotal = 0.0
        for(item in listaItens){
            valorTotal += item.quantiaItem * item.precoItem
        }
        return valorTotal
    }

}