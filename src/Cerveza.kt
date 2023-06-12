package EXAMEN_RC

class Cerveza(
    nomComercial: String,
    contenido_envase: Double,
    embalaje: Int,
    precioSinIva: Double,
    caducidad: String,
    val alcohol: Boolean
) : Bebida(nomComercial, contenido_envase, embalaje, precioSinIva, caducidad), Generable {
    val IDCerveza = generarID()
    val IvaC = 21
    val tasa = if (alcohol) 26 else 0
    // Devuelve el id de la cerveza
    companion object {
        var secuenciaIDCerveza = 120
    }
    // Función del porcentaje de IVA correspondiente a la cerveza
    override fun calcularIva(): Double {
        return IvaC.toDouble()
    }
    // Función que genera el id de la cerveza y lo devuelve a tipo cadena
    override fun generarID(): String {
        // Funciona como contador cada vez que cuenta una variable de cerveza distinta.
        val id = secuenciaIDCerveza++
        return "$id"
    }

    override fun toString(): String {
        return "Cerveza(alcohol=$alcohol, IDCerveza='$IDCerveza', IvaC=$IvaC, tasa=$tasa)"
    }

}

