package EXAMEN_RC

fun main() {
    // Creamos algunos objetos de las clases definidas
    val cerveza1 = Cerveza("Cruzcampo", 1.5, 4, 12.50, "si", true)
    val cerveza2 = Cerveza("Radler", 1.5, 4, 10.20, "si", false)
    val refresco1 = Refresco("Pepsi", 1.0, 6, 5.50, "no", false)
    val refresco2 = Refresco("Fanta", 1.0, 6, 8.20, "si", true)

    var listaRefresco = listOf<Producto>(cerveza1, cerveza2, refresco1, refresco2)
    // Muestra la lista de los refrescos
    listaRefresco.toString()

    // Podemos acceder a los atributos y métodos de los objetos creados
    println("ID de la primera cerveza: ${cerveza1.IDCerveza}")
    println("Precio de venta de la segunda cerveza: ${cerveza2.calcularPrecioVenta()}€")
    println("ID del primer refresco: ${refresco1.IDRefresco}")
    println("Precio de venta del segundo refresco: ${refresco2.calcularPrecioVenta()}€")
}