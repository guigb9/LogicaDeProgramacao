/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class MediaNotas {
    public static void main(String[] args) {
        Scanner leitorNumero = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);
        
        System.out.println("Insira o seu nome:");
        String nome = leitorTexto.nextLine();
        
        System.out.println("Insira sua primeira nota:");
        double nota1 = leitorNumero.nextDouble();
        
        System.out.println("Insira sua segunda nota:");
        double nota2 = leitorNumero.nextDouble();
        
        double mediaNotas = (nota1 + nota2)/2;
        
        System.out.println(String.format("Olá %s. Sua média foi de %.1f:", nome, mediaNotas));
    }
}
