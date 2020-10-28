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
public class BolsaFilhos {
    public static void main(String[] args) {
        Scanner leitorNumero =  new Scanner(System.in);
        
        System.out.println("Quantos filhos de 0 a 3 anos você possui?");
        Integer filhos03 = leitorNumero.nextInt();
        
        System.out.println("Quantidade de filhos de 4 a 16 anos você possui?");
        Integer filhos416 = leitorNumero.nextInt();
        
        System.out.println("Quantidade de filhos de 17 a 18 anos você possui?");
        Integer filhos1718 = leitorNumero.nextInt();
        
        double valorBolsa = (filhos03*25.12) + (filhos416*15.88) + (filhos1718*12.44);
        Integer totalFilhos = filhos03 + filhos416 + filhos1718;
        
        System.out.println(String.format("Você tem um total de %d filhos e vai receber %.2f de bolsa", totalFilhos, valorBolsa));
        
    }
}
