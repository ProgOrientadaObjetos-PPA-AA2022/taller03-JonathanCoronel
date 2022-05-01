/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import paquete02.Terreno;

/**
 *
 * @author JonathanCoronel
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Terreno terreno1 = new Terreno();
        Terreno terreno2 = new Terreno();
        terreno1.establecerAncho(40);
        terreno1.establecerLargo(60);
        terreno1.establecerValorMetroCuadrado(20);

        terreno1.calcularArea();
        terreno1.calcularCostoTerreno();


        System.out.printf("Datos del terreno 1\n\nAncho del Terreno: %.2f\n"
                + "Largo del Terreno: %.2f\nValor metro cuadrado: %.2f\n"
                + "Area del Terreno: %.2f\nCosto del Terreno: %.2f\n\n",
                terreno1.obtenerAncho(), terreno1.obtenerLargo(),
                terreno1.obtenervalorMetroCuadrado(), terreno1.obtenerarea(),
                terreno1.obtenercostoTerreno());

        terreno2.establecerAncho(30);
        terreno2.establecerLargo(70);
        terreno2.establecerValorMetroCuadrado(20);

        terreno2.calcularArea();
        terreno2.calcularCostoTerreno();
        System.out.println("---------------------------------------");
        System.out.printf("Datos del terreno 2\n\nAncho del Terreno: %.2f\n"
                + "Largo del Terreno: %.2f\nValor metro cuadrado: %.2f\n"
                + "Area del Terreno: %.2f\nCosto del Terreno: %.2f\n",
                terreno2.obtenerAncho(), terreno2.obtenerLargo(),
                terreno2.obtenervalorMetroCuadrado(), terreno2.obtenerarea(),
                terreno2.obtenercostoTerreno());
    }

}
