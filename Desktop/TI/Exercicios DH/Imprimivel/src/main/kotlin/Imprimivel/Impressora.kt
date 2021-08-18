package Imprimivel

import java.awt.List

class Impressora() {
    var listaImprimivel = mutableListOf<String>()

    fun adiciona(elemento: String) {
        listaImprimivel.add(elemento)
    }

    fun imprime() {
            println(listaImprimivel)
        }
}