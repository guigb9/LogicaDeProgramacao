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
public class Calculadora {
    public static void main(String[] args) {
        Scanner LeitorNumero = new Scanner(System.in);
        
        System.out.println("Digite um Número");
        
        double num1 = LeitorNumero.nextDouble();
        
        System.out.println("Digite outro Número");
        
        double num2 = LeitorNumero.nextDouble();
        
        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1/num2;
        
        
        System.out.println(String.format("A soma dos números digitados é: %.2f", soma));
        System.out.println(String.format("A subtração do primeiro númeo digitado pelo segundo é: %.2f", subtracao));
        System.out.println(String.format("A multiplicação dos números digitados é: %.2f", multiplicacao));
        System.out.println(String.format("A divisão do primeiro digitado pelo segundo é: %.2f", divisao));
        
        
    }
}
