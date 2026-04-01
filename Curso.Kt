class Curso(
    val nombre: String,
    val estudiantes: MutableList<Estudiante>
) {

    fun agregarEstudiante(estudiante: Estudiante) {
        estudiantes.add(estudiante)
    }

    fun mostrarLista() {
        println("\n===== ESTUDIANTES =====")
        estudiantes.forEachIndexed { index, e ->
            println("${index + 1}. ${e.nombre}")
        }
    }

    fun obtenerEstudiante(posicion: Int): Estudiante? {
        return if (posicion in 1..estudiantes.size) {
            estudiantes[posicion - 1]
        } else null
    }
}
