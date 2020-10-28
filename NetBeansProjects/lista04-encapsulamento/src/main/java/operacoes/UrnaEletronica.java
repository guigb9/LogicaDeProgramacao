/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacoes;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class UrnaEletronica {
    
    
    
    public static void main(String[] args) {
        Candidatos candidato01 = new Candidatos("Guiza");
        Candidatos candidato02 = new Candidatos("Ramon");
        Scanner numero = new Scanner(System.in);
        System.out.println(String.format("Numero de Votos de %s", candidato01.getNome()));
        Integer votosCand1 = numero.nextInt();
        candidato01.setVotos(votosCand1);
        System.out.println(String.format("Numero de Votos de %s", candidato02.getNome()));
        Integer votosCand2 = numero.nextInt();
        candidato02.setVotos(votosCand2);
        System.out.println(String.format("Quantidade de Votos de %s: %d \nQuantidade de votos de %s: %d", candidato01.getNome(), candidato01.getVotos(), candidato02.getNome(), candidato02.getVotos()));
        if(candidato01.getVotos() > candidato02.getVotos()){
            System.out.println(String.format("%s Venceu!", candidato01.getNome()));
        }else if(candidato01.getVotos() < candidato02.getVotos()){
            System.out.println(String.format("%s Venceu!", candidato02.getNome()));
        }else{
            System.out.println("Empate!");
        }
        
    }

    
}
