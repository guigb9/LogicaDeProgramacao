/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista.pratica.reforco1;

/**
 *
 * @author guilh
 */
public class TesteTermometro {
    public static void main(String[] args) {
        Termometro termometro1 = new Termometro();
        
        termometro1.aumentaTemperatura(10.0);
        termometro1.aumentaTemperatura(15.0);
        System.out.println(String.format("Temperatura Atual: %.2f°C \nTemperatura Máxima Registrada: %.2f°C \nTemperatura Mínima Registrada: %.2f°C", termometro1.getTemperaturaAtual(), termometro1.getTemperaturaMaxRegistrada(), termometro1.getTemperaturaMinRegistrada()));
        System.out.println("");
        termometro1.diminuiTemperatura(5.5);
        termometro1.diminuiTemperatura(10.0);
        System.out.println(String.format("Temperatura Atual: %.2f°C \nTemperatura Máxima Registrada: %.2f°C \nTemperatura Mínima Registrada: %.2f°C", termometro1.getTemperaturaAtual(), termometro1.getTemperaturaMaxRegistrada(), termometro1.getTemperaturaMinRegistrada()));
        System.out.println("");
        termometro1.converterTemperatura();
        System.out.println(String.format("Temperatura Atual Convertida: %.2f°F", termometro1.converterTemperatura()));
        
}
}
