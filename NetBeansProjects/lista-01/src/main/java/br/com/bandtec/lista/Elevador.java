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
public class Elevador {
    public static void main(String[] args) {
        Scanner leitorNumero = new Scanner(System.in);
        
        System.out.println("Digite o limite de peso de um elevador:");
        double limPeso = leitorNumero.nextDouble();
        
        System.out.println("Digite o limite de pessoas do elevador:");
        Integer limPessoas = leitorNumero.nextInt();
        
        System.out.println("Digite o peso da 1ª pessoa:");
        double pesoPessoa1 = leitorNumero.nextDouble();
        
        System.out.println("Digite o peso da 2ª pessoa:");
        double pesoPessoa2 = leitorNumero.nextDouble();
        
        System.out.println("Digite o peso da 3ª pessoa:");
        double pesoPessoa3 = leitorNumero.nextDouble();
        
        double pesoTotal = pesoPessoa1 + pesoPessoa2 + pesoPessoa3;
                
        
        System.out.println(String.format("Entraram 3 pessoas no elevador , no qual cabem %d pessoas \n O peso total no elevador é de %.2f, sendo que ele suporta %.1f", limPessoas, pesoTotal, limPeso));
    }
}
