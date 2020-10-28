/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projeto.poo;

/**
 *
 * @author guilh
 */
public class TesteProfessor {
    
    public static void main(String[] args) {
        Professor professor01 = new Professor(001, "Gerson", 30000);
        
        
        
        System.out.println(String.format("Cod: %d", professor01.getCod()));
        System.out.println(String.format("nome: %s", professor01.getNome()));
        System.out.println(String.format("Salário: %.2f", professor01.getSalario()));
    }
}
