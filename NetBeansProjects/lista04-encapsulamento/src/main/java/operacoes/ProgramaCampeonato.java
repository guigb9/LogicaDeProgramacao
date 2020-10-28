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
public class ProgramaCampeonato {
    
    public static void main(String[] args) {
        Clubes clube01 = new Clubes();
        Clubes clube02 = new Clubes();
        Scanner numero = new Scanner(System.in);
        Scanner texto = new Scanner(System.in);
        System.out.println("Nome do time 1:");
        String time01 = texto.nextLine();
        clube01.setNome(time01);
        System.out.println(String.format("Insira as vitórias do %s", clube01.getNome()));
        Integer vitorias = numero.nextInt();
        clube01.setVitorias(vitorias);
        System.out.println("Nome do time 2:");
        String time02 = texto.nextLine();
        clube02.setNome(time02);
        System.out.println(String.format("Insira as Vitórias do %s", clube02.getNome()));
        Integer vitorias1 = numero.nextInt();
        clube02.setVitorias(vitorias1);
        clube01.AtualizarPontos();
        clube02.AtualizarPontos();
        
        if(clube01.getPontos() > clube02.getPontos()){
            System.out.println(String.format("%s Venceu \n Vitórias: %d \n Pontos: %d \n ", clube01.getNome(), clube01.getVitorias(), clube01.getPontos()));
            System.out.println(String.format("%s Perdeu \n Vitórias: %d \n Pontos: %d \n ", clube02.getNome(), clube02.getVitorias(), clube02.getPontos()));
        }else if(clube02.getPontos() > clube01.getPontos()){
            System.out.println(String.format("%s Venceu \n Vitórias: %d \n Pontos: %d ", clube02.getNome(), clube02.getVitorias(), clube02.getPontos()));
            System.out.println(String.format("%s Perdeu \n Vitórias: %d \n Pontos: %d ", clube01.getNome(), clube01.getVitorias(), clube01.getPontos()));
        }else{
            System.out.println("Empate");
        }
    }
}
