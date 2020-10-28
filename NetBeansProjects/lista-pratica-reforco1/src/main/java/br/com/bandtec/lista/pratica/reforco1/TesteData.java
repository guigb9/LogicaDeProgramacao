/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista.pratica.reforco1;

/**
 *
 * @author guilh
 */
public class TesteData {
    public static void main(String[] args) {
        Data data1 = new Data();
        Data data2 = new Data(); 
     
        System.out.println("Data1:");
        System.out.println(data1.atualizarData(12, 10, 2018)); 
        System.out.println(data1.exibeData());
        System.out.println("");
        System.out.println("Data2:");
        System.out.println(data2.atualizarData(20, 9, 2020));
        System.out.println(data2.exibeData());
        System.out.println("");
        System.out.println("Comparar data1:");
        System.out.println(data1.comparaData(12, 10, 2018));
        System.out.println("");
        System.out.println("Comparar data2:");
        System.out.println(data2.comparaData(28, 12, 1976));
        
    }

    
    
}
