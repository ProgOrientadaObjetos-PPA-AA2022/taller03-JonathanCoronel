/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author JonathanCoronel
 */
public class EquivalenteHora {
    private double hora;
    private double minutos;
    private double segundos;
    private double dias;

    public void establecerHora(double c) {
        hora = c;
    }

    public void calcularMinutos() {
        minutos = hora*60;
    }

    public void calcularSegundos() {
        segundos = hora * 3600;
    }

    public void calcularDias() {
        dias = hora / 24;
    }

    public double obtenerHora() {
        return hora;
    }

    public double obtenerMinutos() {
        return minutos;
    }

    public double obtenerSegundos() {
        return segundos;
    }

    public double obtenerdias() {
        return dias;
    }

}
