package Pessoa

class Pessoa(var nome: String, var rg: Int) {

    override fun equals(other: Any?): Boolean {
        return(other is Pessoa && other.rg == this.rg)
    }

    override fun toString(): String {
        return(" $nome, $rg ")
    }

    override fun hashCode(): Int {
        return(rg)
    }

}

