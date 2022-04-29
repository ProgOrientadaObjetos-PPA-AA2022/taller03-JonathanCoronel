/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author SALA I
 */
public class Terreno {

    private double ancho;
    private double largo;
    private double valorMetroCuadrado;
    private double area;
    private double costoTerreno;

    public void establecerAncho(double c) {
        ancho = c;
    }

    public void establecerLargo(double c) {
        largo = c;
    }

    public void establecerValorMetroCuadrado(double c) {
        valorMetroCuadrado = c;
    }

    public void calcularArea() {
        area = ancho * largo;
    }

    public void calcularCostoTerreno() {
        costoTerreno = area * valorMetroCuadrado;
    }

    public double obtenerAncho() {
        return ancho;
    }

    public double obtenerLargo() {
        return largo;
    }

    public double obtenervalorMetroCuadrado() {
        return valorMetroCuadrado;
    }

    public double obtenerarea() {
        return area;
    }
     public double obtenercostoTerreno() {
        return costoTerreno;
    }

}
