//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val persona = Persona("Pepe", 46)
    val empleado = Empleado("Luis", 76, 1460.78, 10.0)
    val gerente = Gerente("María", 34, 2500, 40.9, 200, false)

    println(persona)

    persona.celebrarCumple()

    println(persona)

    println(empleado)

    empleado.trabajar()

    println(empleado.calcularSalario())

    println(gerente)

    println(gerente.calcularSalario()
    )

}