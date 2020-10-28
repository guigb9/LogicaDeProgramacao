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
public class ProgramaCalculo {
    public static void main(String[] args) {
        Calculadora calculadora01 = new Calculadora();
        Scanner numero = new Scanner(System.in);
        System.out.println("Número1:");
        Integer numero1 = numero.nextInt();
        calculadora01.setNumero1(numero1);
        System.out.println("Número2:");
        Integer numero2 = numero.nextInt();
        calculadora01.setNumero2(numero2);
        calculadora01.somar();
        System.out.println(String.format("%d + %d = %d", calculadora01.getNumero1(), calculadora01.getNumero2(), calculadora01.getResultado()));
        calculadora01.subtrair();
        System.out.println(String.format("%d - %d = %d", calculadora01.getNumero1(), calculadora01.getNumero2(), calculadora01.getResultado()));
        calculadora01.multiplicar();
        System.out.println(String.format("%d * %d = %d", calculadora01.getNumero1(), calculadora01.getNumero2(), calculadora01.getResultado()));
        calculadora01.dividir();
        System.out.println(String.format("%d / %d = %d", calculadora01.getNumero1(), calculadora01.getNumero2(), calculadora01.getResultado()));
    }
}
