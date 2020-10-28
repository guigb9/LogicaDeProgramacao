/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projeto2.nivelamento;

import java.util.Scanner; 

/**
 *
 * @author guilh
 */
public class Programa5 {
public static void main(String[] args) {
        
    
    //Exemplo de como instanciar um objeto do tipo Scanner
    //Para evitar erros é necessário utilizar um scanner para texto e um para nímero
    Scanner leitor = new Scanner(System.in);
    Scanner leitorNumero = new Scanner(System.in);
    
    System.out.println("Digite seu nome");
    String nome = leitor.nextLine();
    System.out.println(String.format("Olá %s", nome));
    //O next() capitura sómente a primeira palavra
    //O nextLine() captura tudo
    System.out.println("Qual a sua idade?");
    //O nextInt() captura e converte para inteiro o valor digitado
    Integer idade = leitorNumero.nextInt();
    if(idade >= 18){
        System.out.println("Você pode tirar habilitação");
    }else{
        System.out.println("Infelizmente vai ter que ir de busão");
    }
    System.out.println("Qual faculdade você faz?");
    String faculdade = leitor.nextLine();
    System.out.println(String.format("%s faz a faculdade %s", nome, faculdade));
    
    System.out.println("Quanto custa a passagem na sua cidade?");
    Double precoPassagem = leitorNumero.nextDouble();
    System.out.println(String.format("Na cidade de %s a passagem custa %.2f", nome, precoPassagem));
    
}
}