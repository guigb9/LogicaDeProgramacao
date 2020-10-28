package br.com.bandtec.resolucao.ac1.poo;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author diego <diego.lima@bandtec.com.br/>
 */
public class Componente {

    Integer atual = 0;
    Integer minima = 100;
    Integer maxima = 0;
    Integer soma = 0;

    void capturarDado() {
        atual = ThreadLocalRandom.current().nextInt(0, 100);

        verificarDado();
    }

    void verificarDado() {

        if (atual < minima) {
            minima = atual;
        }

        if (atual > maxima) {
            maxima = atual;
        }

        soma += atual;
    }
}
