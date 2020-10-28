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
public class Professor {
    private Integer cod;
    private String nome;
    private double salario;

    public Professor(Integer cod, String nome, double salario) {
        this.cod = cod;
        this.nome = nome;
        this.salario = salario;
    }
    
    
    

    public Integer getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }


    
    
}
