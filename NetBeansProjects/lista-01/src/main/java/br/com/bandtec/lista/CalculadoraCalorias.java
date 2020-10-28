/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class CalculadoraCalorias {
    public static void main(String[] args) {
        Scanner leitorNumero = new Scanner(System.in);
        
        System.out.println("Qual é o tempo em minutos que você fez de aquecimento?");
        Integer aquecimento = leitorNumero.nextInt();
        
        System.out.println("Qual é o tempo em minutos que você fez exercícios aeróbicos?");
        Integer aerobico = leitorNumero.nextInt();
        
        System.out.println("Qual é o tempo em minutos que você fez exercícios de musculação?");
        Integer musculacao = leitorNumero.nextInt();
        
        Integer minutosExercicio = aquecimento + aerobico + musculacao;
        Integer totalCalorias = aquecimento*12 + aerobico*20 + musculacao*25;
        
        System.out.println
        (String.format
        ("Olá Jorge, você fez um total de %d minutos de exercícios e perdeu %d calorias.", minutosExercicio, totalCalorias));
        
    }
   
}
