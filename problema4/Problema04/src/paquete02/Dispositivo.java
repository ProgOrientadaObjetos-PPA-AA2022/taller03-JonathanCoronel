/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author JonathanCoronel
 */
public class Dispositivo {
    private String sistemaOperativo;
    private String tamanioPantalla;
    private double costoInicial;
    private double ivaPorcentaje;
    private double ivaCosto;
    private double costoFinal;
    private String direccionMac;
    private String imei;


    public void establecerSistemaOperativo(String c) {
        sistemaOperativo = c;
    }

    public void establecerTamanioPantalla(String c) {
        tamanioPantalla = c;
    }

    public void establecerCostoInicial(double c) {
        costoInicial = c;
    }

    public void establecerIvaPorcentaje(double c) {
        ivaPorcentaje = c;
    }

    public void calcularIvaCosto() {
        ivaCosto = (ivaPorcentaje*costoInicial)/100;
    }

    public void calcularCostoFinal() {
        costoFinal = costoInicial + ivaCosto;
    }
    public void establecerDireccionMac(String c) {
        direccionMac = c;
    }
    
    public void establecerImei(String c) {
        imei = c;
    }

    public String obtenerSistemaOperativo() {
        return sistemaOperativo;
    }

    public String obtenerTamanioPantalla( ) {
        return tamanioPantalla;
    }

    public double obtenerCostoInicial( ) {
        return costoInicial;
    }

    public double obtenerIvaPorcentaje() {
        return ivaPorcentaje;
    }

    public double obtenerIvaCosto() {
        return ivaCosto;
    }

    public double obtenerCostoFinal() {
        return costoFinal;
    }

    public String obtenerDireccionMac() {
        return direccionMac;
    }

    public String obtenerImei() {
        return imei;
    }
}


