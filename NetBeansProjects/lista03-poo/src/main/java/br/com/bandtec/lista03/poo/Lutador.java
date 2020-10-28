/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista03.poo;

/**
 *
 * @author guilh
 */
public class Lutador {
    Integer Vida = 100;
    
    void Apanhar(){
    if(Vida >= 0){
    Vida = Vida - 10;
    }
    }
    void CForca(){
    if(Vida >= 0 && Vida <= 98){
    Vida = Vida + 2;
    }
    }
}
