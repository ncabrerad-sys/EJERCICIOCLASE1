
class Inventario {

    val productos = mutableListOf<Producto>()

    fun agregarProducto(producto: Producto) {
        productos.add(producto)
    }

    fun mostrarLista() {
        println("===== LISTA DE PRODUCTOS =====")
        for (i in productos.indices) {
            println("${i + 1}. ${productos[i].nombre}")
        }
    }

    fun mostrarProductoPorNumero(numero: Int) {
        if (numero in 1..productos.size) {
            val producto = productos[numero - 1]
            println("===== DETALLE DEL PRODUCTO =====")
            producto.mostrarInfo()
        } else {
            println("❌ Número inválido")
        }
    }
}
