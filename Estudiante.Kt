class Estudiante(
    val nombre: String,
    val notas: MutableList<Double>
) {

    fun promedio(): Double {
        return if (notas.isNotEmpty()) notas.average() else 0.0
    }

    fun notaMasAlta(): Double {
        return notas.maxOrNull() ?: 0.0
    }

    fun notaMasBaja(): Double {
        return notas.minOrNull() ?: 0.0
    }

    fun obtenerNivel(): String {
        val prom = promedio()
        return when {
            prom >= 90 -> "Excelente"
            prom >= 60 -> "Aprobado"
            else -> "Reprobado"
        }
    }

    fun agregarNota(nota: Double) {
        if (nota in 0.0..100.0) {
            notas.add(nota)
        } else {
            println("Nota inválida")
        }
    }

    fun mostrarInfo() {
        println("\n===== INFORMACIÓN =====")
        println("Nombre: $nombre")
        println("Notas: $notas")
        println("Promedio: ${promedio()}")
        println("Nota más alta: ${notaMasAlta()}")
        println("Nota más baja: ${notaMasBaja()}")
        println("Nivel: ${obtenerNivel()}")
    }
}
