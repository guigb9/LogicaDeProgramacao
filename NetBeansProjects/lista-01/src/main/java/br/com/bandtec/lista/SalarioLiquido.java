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
public class SalarioLiquido {
    public static void main(String[] args) {
        Scanner leitorNumero = new Scanner(System.in);
        
        System.out.println("Digite o seu salário bruto:");
        double salarioBruto = leitorNumero.nextDouble();
        
        double descINSS = 0.1*salarioBruto;
        double descIR =  0.2*salarioBruto;
        double totalDesc = descINSS + descIR;

        
        System.out.println("Qual o valor da condução diária de ida ao serviço?");
        double valorConducaoIda = leitorNumero.nextDouble();
        double valorTotalConducao = (valorConducaoIda*2)*22;
        double salarioLiquido = salarioBruto - (descIR + descINSS + valorTotalConducao);
        System.out.println
        (String.format("Seu bruto é de R$%.2f, você tem um total de R$%.2f de descontos e receberá um líquido de R$%.2f", salarioBruto, totalDesc,salarioLiquido ));
    }
}
