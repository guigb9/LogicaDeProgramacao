/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista.aula.dia21;

/**
 *
 * @author guilh
 */
public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("João", 5400.00);
        empregado1.setCargo("Analista de Sistemas");
        System.out.println(String.format("nome: %s \ncargo: %s \nsalário: %.2f", empregado1.getNome(), empregado1.getCargo(), empregado1.reajustarSalario(15)));
    }
}
