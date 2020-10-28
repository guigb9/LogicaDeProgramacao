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
public class Tabuada {
    
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Digite um número:");
        Integer numeroDigitado = numero.nextInt();
        for(Integer i = 1; i <= 10; i++){
        Integer numeroMultiplicado = numeroDigitado * i;
        System.out.println(String.format("%d * %d = %d", numeroDigitado, i, numeroMultiplicado));
        }
    }
    
}
