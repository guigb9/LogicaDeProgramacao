/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projeto5.poo1;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author guilh
 */
public class App {
    public static void main(String[] args) {
        
        //Gerando Numeros Aleatórios Inteiros de 0 a 10
        System.out.println(ThreadLocalRandom.current().nextInt(0, 10));
        //Gerando Numeros Aleatórios Reais  com parâmetro de 0.5 até 10.5
        Double numeroReal = ThreadLocalRandom.current().nextDouble(0.5, 10.5);
        System.out.println(numeroReal);
    }
}
