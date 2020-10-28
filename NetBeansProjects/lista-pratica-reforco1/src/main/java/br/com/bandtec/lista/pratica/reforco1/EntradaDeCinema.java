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
public class EntradaDeCinema {
    private Integer ano = 0;
    private Integer hora = 0;
    private Integer sala = 0;
    private Double valor = 45.00;
    private String nome;

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }

    public Integer getSala() {
        return sala;
    }

    public void setSala(Integer sala) {
        this.sala = sala;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public void calculaDesconto(Boolean estudante, Integer idade){
    if(idade < 12){
    valor = valor * 0.5;
    }
    else if(estudante && idade >=12 && idade <= 15){
    valor = valor * 0.6;
    }
    else if(estudante && idade >= 16 && idade <= 20){
    valor = valor * 0.7;
    }
    else if(estudante && idade >= 20){
    valor = valor * 0.8;
    }
    }

    public void calculaDescontoHorario(){
        if(hora < 16){
        valor = valor * 0.9;
        }
    
    }
}
