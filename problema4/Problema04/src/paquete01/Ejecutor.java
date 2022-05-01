/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import paquete02.Dispositivo;

/**
 *
 * @author JonathanCoronel
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dispositivo dis1 = new Dispositivo();
        Dispositivo dis2 = new Dispositivo();

        dis1.establecerSistemaOperativo("Android");
        dis1.establecerTamanioPantalla("6.2 pulgadas");
        dis1.establecerCostoInicial(900);
        dis1.establecerIvaPorcentaje(10);
        dis1.calcularIvaCosto();
        dis1.calcularCostoFinal();
        dis1.establecerDireccionMac("11:22:33:AA:BB:CC");
        dis1.establecerImei("353682111397921");
        System.out.printf("Datos del Dispositivo 1\n\nSistema Operativo: %s "
                + "\nTamanio Pantalla: %s \nCosoto Inicial: %.2f \nPorcentaje "
                + "Iva: %.2f \nCosto de Iva: %.2f \nCosto Final : %.2f "
                + "\nDireccion Mac: %s \nImei: %s \n\n",
                dis1.obtenerSistemaOperativo(), dis1.obtenerTamanioPantalla(),
                dis1.obtenerCostoInicial(), dis1.obtenerIvaPorcentaje(),
                dis1.obtenerIvaCosto(), dis1.obtenerCostoFinal(),
                dis1.obtenerDireccionMac(), dis1.obtenerImei());

        dis2.establecerSistemaOperativo("iOS");
        dis2.establecerTamanioPantalla("5.4 pulgadas");
        dis2.establecerCostoInicial(1400);
        dis2.establecerIvaPorcentaje(16);
        dis2.calcularIvaCosto();
        dis2.calcularCostoFinal();
        dis2.establecerDireccionMac("11:28:13:BA:BB:DC");
        dis2.establecerImei("353682351391256");
        System.out.println("---------------------------------------");
        System.out.printf("Datos del Dispositivo 2\n\nSistema Operativo: %s "
                + "\nTamanio Pantalla: %s \nCosoto Inicial: %.2f \nPorcentaje "
                + "Iva: %.2f \nCosto de Iva: %.2f \nCosto Final : %.2f "
                + "\nDireccion Mac: %s \nImei: %s \n\n",
                dis2.obtenerSistemaOperativo(), dis2.obtenerTamanioPantalla(),
                dis2.obtenerCostoInicial(), dis2.obtenerIvaPorcentaje(),
                dis2.obtenerIvaCosto(), dis2.obtenerCostoFinal(),
                dis2.obtenerDireccionMac(), dis2.obtenerImei());
    }
}
