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
public class Empregado {
    private String nome;
    private String cargo;
    private Double salario;

    public Empregado(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    
    
    public Double reajustarSalario(Integer reajuste){
    Double salario;
    salario = this.salario - (this.salario * reajuste/100);
    return salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
}
