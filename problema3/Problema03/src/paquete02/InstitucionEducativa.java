/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author SALA I
 */
public class InstitucionEducativa {

    private String nombreInstitucion;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    private double gastosEstudiante;
    private double presupuesto;

    public void establecerNombreInstitucion(String c) {
        nombreInstitucion = c;
    }

    public void establecerTipoInstitucion(String c) {
        tipoInstitucion = c;
    }

    public void establecerNumeroAlumnos(int c) {
        numeroAlumnos = c;
    }

    public void establecerNumeroDocentes(int c) {
        numeroDocentes = c;
    }

    public void establecerNumeroSedes(int c) {
        numeroSedes = c;
    }

    public void establecerGastosEstudiante(double c) {
        gastosEstudiante = c;
    }

    public void calcularPresupuesto() {
        presupuesto = numeroAlumnos * gastosEstudiante;
    }

    public String obtenerNombreInstitucion() {
        return nombreInstitucion;
    }

    public String obtenerTipoInstitucion() {
        return tipoInstitucion;
    }

    public int obtenerNumeroAlumnos() {
        return numeroAlumnos;
    }

    public int obtenerNumeroDocentes() {
        return numeroDocentes;
    }

    public int obtenerNumeroSedes() {
        return numeroSedes;
    }

    public double obtenerGastosEstudiante() {
        return gastosEstudiante;
    }

    public double obtenerPresupuesto() {
        return presupuesto;
    }
}
