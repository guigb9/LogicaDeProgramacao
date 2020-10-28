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
public class Idade {
    public static void main(String[] args) {
        Scanner leitorTexto = new Scanner(System.in);
        Scanner leitorNumero = new Scanner(System.in);
        
        System.out.println("Digite o seu nome:");
        String nome = leitorTexto.nextLine();
        System.out.println(String.format("Olá %s qual é o seu ano de nascimento?", nome));
        Integer ano = leitorNumero.nextInt();
        Integer idade = 2030 - ano;
        System.out.println(String.format("Em 2030 você terá %d anos", idade));
        
    }
}
