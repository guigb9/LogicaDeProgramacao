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
public class Idade2030 {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        Scanner numero = new Scanner(System.in);
        
        System.out.println("Insira o seu nome:");
        String nome = texto.nextLine();
        System.out.println("Insira seu ano de nascimento");
        Integer dataNasc = numero.nextInt();
        System.out.println(String.format("Olá %s, em 2030 você terá %d anos", nome, 2030 - dataNasc));
    }
}
