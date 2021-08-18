package Imprimivel

fun main(){
    val foto = Foto()
    val documento = Documento()
    val contrato = Contrato()
    val impressora = Impressora()

    impressora.adiciona(foto.imprimir())
    impressora.adiciona(documento.imprimir())
    impressora.adiciona(contrato.imprimir())
    impressora.imprime()

}

