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
public class CalculadoraTroco {
    public static void main(String[] args) {
        Scanner leitorNumero = new Scanner(System.in);
        
        System.out.println("Digite o valor unitário do produto:");
        double valorProduto = leitorNumero.nextDouble();
        
        System.out.println("Digite a quantidade vendida do produto:");
        Integer quantidadeVendida = leitorNumero.nextInt();
        
        System.out.println("Valor pago pelo cliente:");
        double valorCliente = leitorNumero.nextDouble();
        
        double troco = valorCliente - (valorProduto*quantidadeVendida);
        
        System.out.println(String.format("Seu troco será de %.2f", troco));
    }
}
