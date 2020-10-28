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
public class Programa3 {
    public static void main(String[] args) {
        String nome = "João Grilo";
        Integer idade = 30;
        Double bilheteUnico = 255.6;
       // System.out.println(nome + " tem " + idade + " anos e possui" + bilheteUnico + " em seu Bilhete único.");
        //Interpolação de String
        
        String frase = String.format("%s tem %d anos e possui %.2f reais em seu BU" ,nome, idade, bilheteUnico);
        System.out.println(frase);
        
        
    }
    
}
