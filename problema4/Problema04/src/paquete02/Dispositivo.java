/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author SALA I
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

    public void calcularIvaCosto(double c) {
        ivaCosto = (ivaPorcentaje*costoInicial)/100;
    }

    public void calcularCostoFinal(double c) {
        costoFinal = costoInicial + ivaCosto;
    }
    public void establecerDireccionMac(String c) {
        direccionMac = c;
    }
    
    public void establecerImei(String c) {
        imei = c;
    }

    public String obtenerSistemaOperativo(String c) {
        return sistemaOperativo;
    }

    public String obtenerTamanioPantalla(double c ) {
        return tamanioPantalla;
    }

    public double obtenerIvaPorcentaje(double c) {
        return ivaPorcentaje;
    }

    public double obtenerIvaCosto(double c) {
        return ivaCosto;
    }

    public double obtenerNumeroSedes() {
        return costoFinal;
    }

    public String obtenerDireccionMac(String c) {
        return direccionMac;
    }

    public String obtenerImei(String c) {
        return imei;
    }
}


