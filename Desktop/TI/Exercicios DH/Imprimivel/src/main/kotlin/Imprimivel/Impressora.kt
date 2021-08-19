package Imprimivel

import java.awt.List

class Impressora() {
    var listaImprimivel = mutableListOf<Imprimivel>()

    fun adiciona(elemento: Imprimivel) {
        listaImprimivel.add(elemento)
    }

    fun imprime() {
        for (i in listaImprimivel) {
            println(i.imprimir())
        }
    }
}