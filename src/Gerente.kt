class Gerente(nombre: String,edad: Int,salarioBase: Double, porcentajeImpuestos: Double, val bonus: Double, val exentoImpuestos: Double): Empleado(nombre, edad, salarioBase, porcentajeImpuestos) {
}
