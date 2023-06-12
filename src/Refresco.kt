package EXAMEN_RC

class Refresco(
    nomComercial: String,
    contenido_envase: Double,
    embalaje: Int,
    precioSinIva: Double,
    caducidad: String,
    var azucar: Boolean
) : Bebida(nomComercial, contenido_envase, embalaje, precioSinIva, caducidad), Generable {
    val IDRefresco = generarID()
    val IvaR = 21
    // Companion object del id del refresco
    companion object {
        var secuenciaIDRefresco = 500
    }
    // Función del porcentaje de IVA correspondiente al refresco
    override fun calcularIva(): Double {
        return if (azucar) IvaR.toDouble() else 10.0
    }
    // Función que genera el id y lo devuelve a tipo cadena
    override fun generarID(): String {
        val id = secuenciaIDRefresco++
        return "$id" + "refresco"
    }

    override fun toString(): String {
        return "Refresco(azucar=$azucar, IDRefresco='$IDRefresco', IvaR=$IvaR)"
    }

}