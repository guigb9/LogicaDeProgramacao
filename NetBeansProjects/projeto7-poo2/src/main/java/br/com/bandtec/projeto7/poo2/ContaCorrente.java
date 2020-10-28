/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projeto7.poo2;

/**
 *
 * @author guilh
 */
public class ContaCorrente {
    private Double saldo = 0.0;
    private String situacao = null;
    private String cor = "#000000";
    
    void depositar20(){
    if(saldo + 20 <= 600){
    saldo = saldo + 20;
    }
    verificarSituacao();
    }
    
    void sacar20(){
    if(saldo-20 >= -200){
    saldo = saldo - 20;
    verificarSituacao();
    }
    }
    
    void verificarSituacao(){
    if(saldo < 0){
        situacao = "Péssimo";
        cor = "#AA0000";
    }else if(saldo <= 400){
        situacao = "Controlada";
        cor = "#0000AA";
        
    }else{
        situacao = "Rei do Camarote";
        cor = "#00AA00";
    }
    
    }

    public Double getSaldo() {
        return saldo;
    }

    public String getSituacao() {
        return situacao;
    }

    public String getCor() {
        return cor;
    }

}
