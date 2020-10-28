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
public class TesteEntradaCinema {
    public static void main(String[] args) {
        EntradaDeCinema entrada1 = new EntradaDeCinema();
        

        entrada1.setAno(2020);
        entrada1.setHora(14);
        entrada1.setNome("Estrada do Paraíso");
        entrada1.setSala(3);
        entrada1.calculaDesconto(false, 11);
        entrada1.calculaDescontoHorario();
        System.out.println(String.format("filme: %s %d", entrada1.getNome(), entrada1.getAno()));
        System.out.println(String.format("Sala: %d", entrada1.getSala()));
        System.out.println(String.format("hora: %d", entrada1.getHora()));
        System.out.println(String.format("Valor: %.2f", entrada1.getValor()));
    }

    
}
