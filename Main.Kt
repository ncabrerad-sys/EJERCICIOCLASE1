fun main() {

    val inventario = Inventario()

    inventario.agregarProducto(Producto("Arroz", 5.0, 10, 3))
    inventario.agregarProducto(Producto("Azucar", 7.5, 4, 5))
    inventario.agregarProducto(Producto("Leche", 6.0, 8, 2))

    inventario.mostrarLista()

    print("Ingrese el número del producto: ")
    val opcion = readLine()?.toIntOrNull()

    if (opcion != null) {
        inventario.mostrarProductoPorNumero(opcion)
    } else {
        println("❌ Entrada inválida")
    }
}
