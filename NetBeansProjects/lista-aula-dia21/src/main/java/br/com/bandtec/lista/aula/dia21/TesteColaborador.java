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
public class TesteColaborador {

    
    public static void main(String[] args) {
    Colaborador funcionario1 = new Colaborador("João");
    Colaborador funcionario2 = new Colaborador("Marcio");
    RecursosHumanos RH1 = new RecursosHumanos();
    funcionario1.setCargo("Estagiário QA");
    funcionario1.setSalario(2000.00);
    funcionario2.setCargo("Analista de Sistemas");
    funcionario2.setSalario(3000.00);
    System.out.println(String.format("Funcionário 1 \nnome: %s \ncargo: %s \nsalário: %.2f", funcionario1.getNome(), funcionario1.getCargo(), funcionario1.getSalario()));
    System.out.println(String.format("Funcionário 2 \nnome: %s \ncargo: %s \nsalário: %.2f", funcionario2.getNome(), funcionario2.getCargo(), funcionario2.getSalario()));
    RH1.promoverColaborador(funcionario1, 2800.00, "QA");
    RH1.promoverColaborador(funcionario2, 3000.00, "trainee Jr");
    RH1.reajustarSalario(funcionario2, 200.00);
    System.out.println(String.format("Funcionário 1 \nnome: %s \ncargo: %s \nsalário: %.2f", funcionario1.getNome(), funcionario1.getCargo(), funcionario1.getSalario()));
    System.out.println(String.format("Funcionário 2 \nnome: %s \ncargo: %s \nsalário: %.2f", funcionario2.getNome(), funcionario2.getCargo(), funcionario2.getSalario()));
    System.out.println(String.format("Total de Salários Reajustados: %d \n Total de funcionários promovidos: %d", RH1.getTotalSalariosReajustados(), RH1.getTotalPromovidos()));
    }
}
