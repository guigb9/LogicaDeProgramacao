/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista.pratica.reforco1;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author guilh
 */
public class Termometro {
    private Double temperaturaAtual = 0.0;
    private Double temperaturaMaxRegistrada = 0.0;
    private Double temperaturaMinRegistrada = 0.0;

    public Termometro(){
        this.temperaturaAtual = ThreadLocalRandom.current().nextDouble(0, 50);
        this.temperaturaMaxRegistrada = this.temperaturaAtual;
        this.temperaturaMinRegistrada = this.temperaturaAtual;
    }
    public void aumentaTemperatura(Double temperaturaAumentada){
        temperaturaAumentada = temperaturaAumentada + this.temperaturaAtual;
        this.temperaturaAtual = temperaturaAumentada;
        temperaturaMaximaMinima();
    }
    public void diminuiTemperatura(Double diminuiTemperatura){
        diminuiTemperatura = this.temperaturaAtual - diminuiTemperatura;
        this.temperaturaAtual = diminuiTemperatura;
        temperaturaMaximaMinima();
    }
    private void temperaturaMaximaMinima(){
    if(this.temperaturaAtual > this.temperaturaMaxRegistrada){
        this.temperaturaMaxRegistrada = this.temperaturaAtual;
    }
    if(this.temperaturaAtual < this.temperaturaMinRegistrada){
        this.temperaturaMinRegistrada = temperaturaAtual;
    }
    }
    public Double converterTemperatura(){
    return (this.temperaturaAtual * 1.8) + 32;
    }

    public Double getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public Double getTemperaturaMaxRegistrada() {
        return temperaturaMaxRegistrada;
    }

    public Double getTemperaturaMinRegistrada() {
        return temperaturaMinRegistrada;
    }
    
}
