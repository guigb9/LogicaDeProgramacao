/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacoes;

/**
 *
 * @author guilh
 */
public class Calculadora {
    private Integer numero1 = 0;
    private Integer numero2 = 0;
    private Integer resultado = 0;

    public Integer getResultado() {
        return resultado;
    }

    public void setResultado(Integer resultado) {
        this.resultado = resultado;
    }
    
    public void somar(){
    resultado = numero1 + numero2;
    }
    public void subtrair(){
    resultado = numero1 - numero2;
    }
    public void multiplicar(){
    resultado = numero1*numero2;
    }
    public void dividir(){
    resultado = numero1/numero2;
    }

    public Integer getNumero1() {
        return numero1;
    }

    public void setNumero1(Integer numero1) {
        this.numero1 = numero1;
    }

    public Integer getNumero2() {
        return numero2;
    }

    public void setNumero2(Integer numero2) {
        this.numero2 = numero2;
    }
    
    
    
}
