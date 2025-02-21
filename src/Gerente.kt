class Gerente(nombre: String,edad: Int,salarioBase: Double, porcentajeImpuestos: Double = 33.9, val bonus: Double, var exentoImpuestos: Boolean = false): Empleado(nombre, edad, salarioBase, porcentajeImpuestos) {

    constructor(nombre: String,edad: Int,salarioBase: Int, porcentajeImpuestos: Double = 33.9, bonus: Int, exentoImpuestos: Boolean = false): this(nombre, edad, salarioBase.toDouble(), porcentajeImpuestos.toDouble(), bonus.toDouble(), exentoImpuestos)


    override fun calcularSalario(): Double {

        if (!exentoImpuestos){
            return super.calcularSalario()
        }else{
            return salarioBase
        }
    }

    fun mostrarExentoImpuestos(): String{
        if(exentoImpuestos){
            return "está exento de impuestos"}
        else{
            return "no está exento de impuestos"
            }
        }


    override fun toString(): String {
        return super.toString() + " el bonus es de $bonus y ${mostrarExentoImpuestos()}"
    }
    fun administrar():String{
        return "$nombre está administrando la empresa"
    }

}
