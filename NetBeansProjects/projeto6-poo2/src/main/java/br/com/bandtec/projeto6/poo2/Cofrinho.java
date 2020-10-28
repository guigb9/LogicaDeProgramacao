/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projeto6.poo2;

/**
 *
 * @author guilh
 */
public class Cofrinho {
    //Características Atributo ou Instância
    Double saldo = 0.0;
    //Habilidades
    //Métodos
    void depositar10(){
        if(saldo >=0 && saldo <= 90){
            saldo+=10.0;
        }
    }
    void sacar5(){
    if(saldo  >=5){
        saldo-=5.0;
    }
}
}