/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import paquete02.EquivalenteHora;

/**
 *
 * @author SALA I
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EquivalenteHora hora1 = new EquivalenteHora();
        EquivalenteHora hora2 = new EquivalenteHora();
        hora1.establecerHora(48);
        hora1.calcularMinutos();
        hora1.calcularSegundos();
        hora1.calcularDias();

        System.out.printf("Convertidor 1\n\nNumero de Horas: %.2f\n"
                + "Numero de Minutos: %.2f\nNumero de Segundos: %.2f\n"
                + "Numero de Dias: %.2f\n\n",
                hora1.obtenerHora(), hora1.obtenerMinutos(),
                hora1.obtenerSegundos(), hora1.obtenerdias());

        hora2.establecerHora(72);
        hora2.calcularMinutos();
        hora2.calcularSegundos();
        hora2.calcularDias();

        System.out.printf("Convertidor 2\n\nNumero de Horas: %.2f\n"
                + "Numero de Minutos: %.2f\nNumero de Segundos: %.2f\n"
                + "Numero de Dias: %.2f\n\n",
                hora2.obtenerHora(), hora2.obtenerMinutos(),
                hora2.obtenerSegundos(), hora2.obtenerdias());
    }
}
