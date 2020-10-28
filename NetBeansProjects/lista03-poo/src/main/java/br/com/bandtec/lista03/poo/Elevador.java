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
public class Elevador {
    Integer PesoPessoa = 0;
    Integer PesoElevador = 0;
    Integer NumPessoas = 0;
    void Homem(){
    PesoPessoa = 90;
    }
    void Mulher(){
    PesoPessoa = 65;
    }
    void Crianca(){
    PesoPessoa = 40;
    }
    
    void EntrarPessoa(){
    PesoElevador = PesoElevador + PesoPessoa;
    NumPessoas++;
    
    }
    
}
