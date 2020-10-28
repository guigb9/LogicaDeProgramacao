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
public class CalculadoraSalario {
    public static void main(String[] args) {
        Scanner leitorNumero = new Scanner(System.in);
        
        System.out.println("Digite o seu salário:");
        double salario = leitorNumero.nextDouble();
        
        System.out.println("Porcentagem de imposto:");
        double imposto = leitorNumero.nextDouble();
        double porcentagemImposto = (100 - imposto)/100;
        double salarioDesc = porcentagemImposto *salario;
        
        System.out.println(String.format("O salário líquido é %.2f", salarioDesc));
    }
}
