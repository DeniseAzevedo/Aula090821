package Imprimivel

fun main(){
    val foto = Foto()
    val documento = Documento()
    val contrato = Contrato()
    val impressora = Impressora()

    impressora.adiciona(foto)
    impressora.adiciona(documento)
    impressora.adiciona(contrato)
    impressora.imprime()

}

