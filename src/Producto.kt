package EXAMEN_RC

open class Producto(nomComercial: String, contenido_envase: Double, embalaje:Int, precioSinIva: Double){
    // Añadimos las variables de la clase Producto
    val nomComercial = nomComercial
    val contenido_envase = contenido_envase
    val embalaje = embalaje
    val precioSinIva = precioSinIva
    // Funcion para calcular el IVA
    open fun calcularIva(): Double {
        return 0.0
    }
    // Funcion para calcular el precio de la venta
    open fun calcularPrecioVenta(): Double {
        return precioSinIva * (1 + calcularIva() / 100)
    }

    override fun toString(): String {
        return "Producto(nomComercial='$nomComercial', contenido_envase=$contenido_envase, embalaje=$embalaje, precioSinIva=$precioSinIva)"
    }

}