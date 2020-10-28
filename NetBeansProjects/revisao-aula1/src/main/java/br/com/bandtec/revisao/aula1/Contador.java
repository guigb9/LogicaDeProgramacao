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
public class Contador {
     public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        Integer numeroIns = 0;
        Integer i = 0;
        while(i.equals(0)){
        System.out.println("Insira um numero:");
        Integer numeroInserido = numero.nextInt();
        if(numeroInserido >= 1){
        i++;
        numeroIns = numeroInserido;
        Contador.contagem(numeroIns);
        }else{
            System.out.println("Errrooooou!!!");
        }
        }
        
        
    }
    public static void contagem(Integer numero){
        System.out.println("");
       for(Integer i = numero; i >= 0;--i){
           System.out.println(i);
       }
    }
}
