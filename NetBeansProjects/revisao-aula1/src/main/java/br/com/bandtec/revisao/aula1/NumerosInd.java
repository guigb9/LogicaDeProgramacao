/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.revisao.aula1;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class NumerosInd {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        Integer resultado = 0;
        Integer numeroDigitado = 0;
        while(numeroDigitado >= 0){
            System.out.println("Insira um Número");
            resultado = resultado + numeroDigitado;
            numeroDigitado = numero.nextInt();
            if(numeroDigitado < 0){
            System.out.println("Total:" + resultado);
            break;
            }
        }
    }
}
