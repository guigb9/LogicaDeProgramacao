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
public class Login {
    public static void main(String[] args) {
        Scanner leitorTexto = new Scanner(System.in);
        Scanner leitorNumero = new Scanner(System.in);
        
        System.out.println("Digite o seu login:");
        String loginPessoa = leitorTexto.nextLine();
        
        System.out.println("Digite a sua senha:");
        String senhaPessoa = leitorTexto.nextLine();
        
        System.out.println("Quantidade de vezes para errar a senha antes de ser bloqueado");
        Integer errarSenha = leitorNumero.nextInt();
        
        System.out.println
        (String.format("Seu login é %s e sua senha é %s. Você tem %d tentativas antes de ser bloqueado",
         loginPessoa, senhaPessoa, errarSenha));
        
        
    }
}
