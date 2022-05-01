/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import paquete02.InstitucionEducativa;

/**
 *
 * @author JonathanCoronel
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InstitucionEducativa inst1 = new InstitucionEducativa();
        InstitucionEducativa inst2 = new InstitucionEducativa();
        inst1.establecerNombreInstitucion("La Dolorosa");
        inst1.establecerTipoInstitucion("Fiscomisional");
        inst1.establecerNumeroAlumnos(120);
        inst1.establecerNumeroDocentes(15);
        inst1.establecerNumeroSedes(4);
        inst1.establecerGastosEstudiante(125.5);

        inst1.calcularPresupuesto();

        System.out.printf("Datos del la Institucion 1\n\nNombre de la Institucion: %s\n"
                + "Tipo de Institucion: %s\nNumero de alumnos: %d\n"
                + "Numero de Docentes: %d\nNumero de Sedes: %d\n"
                + "Gastos proyectados: %.2f\nPresupuesto: %.2f\n\n",
                inst1.obtenerNombreInstitucion(), inst1.obtenerTipoInstitucion(),
                inst1.obtenerNumeroAlumnos(), inst1.obtenerNumeroDocentes(),
                inst1.obtenerNumeroSedes(), inst1.obtenerGastosEstudiante(),
                inst1.obtenerPresupuesto());

        inst2.establecerNombreInstitucion("La Inmaculada");
        inst2.establecerTipoInstitucion("Fiscomisional");
        inst2.establecerNumeroAlumnos(110);
        inst2.establecerNumeroDocentes(35);
        inst2.establecerNumeroSedes(7);
        inst2.establecerGastosEstudiante(140.5);
        inst2.calcularPresupuesto();
        System.out.println("---------------------------------------");
        System.out.printf("Datos del la Institucion 2\n\nNombre de la Institucion: %s\n"
                + "Tipo de Institucion: %s\nNumero de alumnos: %d\n"
                + "Numero de Docentes: %d\nNumero de Sedes: %d\n"
                + "Gastos proyectados: %.2f\nPresupuesto: %.2f\n\n",
                inst2.obtenerNombreInstitucion(), inst2.obtenerTipoInstitucion(),
                inst2.obtenerNumeroAlumnos(), inst2.obtenerNumeroDocentes(),
                inst2.obtenerNumeroSedes(), inst2.obtenerGastosEstudiante(),
                inst2.obtenerPresupuesto());
    }

}
