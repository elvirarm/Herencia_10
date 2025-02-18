open class Persona(val nombre: String, var edad: Int) {

    override fun toString(): String {
        return "Nombre: $nombre, Edad: $edad"
    }

    fun celebrarCumple(): String{
        edad += 1
        return "Feliz cumpleaños Julia! Ahora tienes $edad años."
    }
}