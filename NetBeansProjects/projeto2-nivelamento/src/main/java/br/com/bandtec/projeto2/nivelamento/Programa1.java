/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.bandtec.projeto2.nivelamento;

/**
 *
 * @author guilh
 */
public class Programa1 {
    public static void main(String[] args) {
        //vARIÁVEL DE TEXTO
        String nome = "Guilherme";
        String cidade = "São Paulo";
        String trabalha = "TIVIT";
        //Números inteiros - Integer
        Integer idade = 19;
        Integer nascimento = 1993;
        //Números reais - Double
        Double preco = 4.40;
        Double Temperatura = 22.2;
        //Variáveis Lógicas (0,1)
        Boolean ligado = true;
        Boolean professor = false;
        Boolean temMundial = false;
        
        //converter texto em inteiro
        String numeroInteiroTxt = "25";
        Integer numeroConvertido = Integer.valueOf(numeroInteiroTxt);
        //Convertendo texto em Número Real
        String numeroRealTxt2 = "25.6";
        Double numeroRealConvertido = Double.valueOf(numeroRealTxt2);
    }
}
