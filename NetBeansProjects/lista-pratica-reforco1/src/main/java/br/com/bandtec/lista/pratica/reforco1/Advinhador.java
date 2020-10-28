/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista.pratica.reforco1;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author guilh
 */
public class Advinhador {
    private Integer numero = 0;
    private Integer numeroSorteado = 0;
    private Integer tentativas = 0;
    void advinhar(){
        do{
            numeroSorteado = ThreadLocalRandom.current().nextInt(0 , 51);
            tentativas++;
            System.out.println(String.format("Tentativa %d numero sorteado %d numero real %d", tentativas, numeroSorteado, numero));
        } while(!Objects.equals(numeroSorteado, numero));
    
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumeroSorteado() {
        return numeroSorteado;
    }

    public void setNumeroSorteado(Integer numeroSorteado) {
        this.numeroSorteado = numeroSorteado;
    }

    public Integer getTentativas() {
        return tentativas;
    }

    public void setTentativas(Integer tentativas) {
        this.tentativas = tentativas;
    }
    
}
