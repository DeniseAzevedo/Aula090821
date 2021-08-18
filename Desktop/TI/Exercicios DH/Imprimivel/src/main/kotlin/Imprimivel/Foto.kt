package Imprimivel

import javax.swing.text.StyleConstants
import javax.swing.text.StyledEditorKit
import javax.swing.text.StyledEditorKit.BoldAction

class Foto() : Imprimivel {

    override var nome = "foto"
    override var tipoDeDocumento = "selfie"

    override fun imprimir(): String {
        return ("\n FOTO -> Eu sou $nome, $tipoDeDocumento")
    }
}
