/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projeto.linguagem.prog1;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author guilh
 */
public class DadosRandom {
    Integer dados3 = 0;
    Integer maximo = 0;
    Integer minimo = 100;
    Integer media;
    Integer contador = 0;
    Integer somaDados = 0;
    void aleatorio(){
        dados3 = ThreadLocalRandom.current().nextInt(0, 101);
    }
    void maximo(){
       if(dados3 > maximo){
           maximo = dados3;
       }
    }
    void minimo(){
        if(dados3 < minimo){
        minimo = dados3;
        }
    }
    void contador(){
        contador++;
        somaDados = somaDados+dados3;
    }
    void media(){
    media = somaDados/contador;
    }
    
}
