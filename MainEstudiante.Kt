fun main() {

    val curso = Curso("Programación", mutableListOf())

    var opcion: Int

    do {
        println("\n===== MENÚ =====")
        println("1. Agregar estudiante")
        println("2. Ver lista de estudiantes")
        println("3. Ver información de un estudiante")
        println("4. Salir")
        print("Seleccione una opción: ")

        opcion = readLine()?.toIntOrNull() ?: 0

        when (opcion) {

            // 🔹 AGREGAR ESTUDIANTE
            1 -> {
                print("Ingrese nombre: ")
                val nombre = readLine() ?: ""

                val notas = mutableListOf<Double>()

                print("¿Cuántas notas desea ingresar?: ")
                val cantidad = readLine()?.toIntOrNull() ?: 0

                for (i in 1..cantidad) {
                    print("Nota $i: ")
                    val nota = readLine()?.toDoubleOrNull() ?: -1.0

                    if (nota in 0.0..100.0) {
                        notas.add(nota)
                    } else {
                        println("Nota inválida, no se agregó")
                    }
                }

                val estudiante = Estudiante(nombre, notas)
                curso.agregarEstudiante(estudiante)

                println("✅ Estudiante agregado")
            }

            // 🔹 VER LISTA
            2 -> {
                curso.mostrarLista()
            }

            // 🔹 VER INFO
            3 -> {
                curso.mostrarLista()

                print("Elija número: ")
                val num = readLine()?.toIntOrNull()

                if (num != null) {
                    val estudiante = curso.obtenerEstudiante(num)

                    if (estudiante != null) {
                        estudiante.mostrarInfo()
                    } else {
                        println("Número inválido")
                    }
                }
            }

            4 -> println("Saliendo...")

            else -> println("Opción inválida")
        }

    } while (opcion != 4)
}
