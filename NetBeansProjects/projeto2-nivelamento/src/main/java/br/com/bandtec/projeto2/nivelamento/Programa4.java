/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projeto2.nivelamento;


/**
 *
 * @author guilh
 */
public class Programa4 {
    public static void main(String[] args) {
       /*Operadores de comparação
        > maior
        < menor
        == igual
        != diferente de
        <= menor igual
        >= maior igual
        */
        Integer num1 = 8;
        if(num1 < 10){
            System.out.println("É menor");
        }else{
            System.out.println("É maior");
        }
        
        String nome = "Diego";
        String nome2 = "Diego";
        //sempre que for comparar texto em Java use o .equals()
        
        if(nome.equals(nome2)){
            
            System.out.println("Está certo");
        }
        /*Operadores lógicos "and" ou "e" / "or" ou "ou"
        or -> ||
        and -> &&
        */
        Integer idade = 27;
        if(nome.equals("Diego") && idade.equals(27)){
            System.out.println("É o Diego mesmo");
        }else{
            System.out.println("É impostor");
        }
        /*
        toUppercase - garante que todo o string esteja em maiúscculo
        toLowercase - garante que todo o string esteja em mminúsculo
        toIgnorecase - ignora se esta em maiúsculo ou em minúsculo a string
        */
    }
}
