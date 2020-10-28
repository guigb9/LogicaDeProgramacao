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
public class Programa2 {
    public static void main(String[] args) {
        /*
        As operações aritméticas são as mesmas utilizadas no JavaScript 
        *
        -
        +
        /
        */
        String nome = "Guilherme";
        Integer passagensDia = 4;
        Double bilheteUnico = 229.3;
        Double precoPassagem = 4.40;
        
        //A passagem Custa 4.40
        Double passagensTotais = bilheteUnico/precoPassagem;
        Integer passagensTotaisInteiro = passagensTotais.intValue();
        Integer dias = passagensTotaisInteiro/passagensDia;
        
       //quebra de linha no console \n
        System.out.println("Total de Dias" + dias);
        System.out.println("Passagens Totais\n" + passagensTotaisInteiro);
        
        
        
    }
    
}
