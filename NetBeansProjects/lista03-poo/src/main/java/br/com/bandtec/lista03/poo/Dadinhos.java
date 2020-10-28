/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista03.poo;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author guilh
 */
public class Dadinhos {
    private Integer Sorteio = 0;
    private Integer Vitorias = 0;
    
    void AdicionarVitorias(){
    Vitorias = Vitorias + 1;
    
    }   
    void SorteioDadinhos(){
    Sorteio = ThreadLocalRandom.current().nextInt(1 , 7);
    
    }
    public Integer getSorteio() {
        return Sorteio;
    }
    public Integer GetVitorias(){
    return Vitorias;
    }
}
