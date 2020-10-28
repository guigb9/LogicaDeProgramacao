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
public class Aluno {
    private Integer nota1 = 0;
    private Integer nota2 = 0;
    private Integer freq1 = 0;
    private Integer media = 0;

    

    public String situacao(){
    if(media >= 9 && freq1 >= 90){
    return  "Aluno(a) Aprovado(a) com Louvor";
    }else if(media >= 6 && freq1 >= 75){
    return  "Aluno(a) Aprovado(a)";
    }else{
    return  "Aluno(a) Reprovado";
    }
    }
    public void CalcMedia(){
    media = (nota1 + nota2)/2;
    }
    
    public void Notas(Integer nota11, Integer nota22, Integer frequencia){
    nota1 = nota11;
    nota2 = nota22;
    freq1 = frequencia;
    }
    
    public Integer getNota1(){
    return nota1;
    }
    public Integer getNota2(){
    return nota2;
    }
    public Integer getFrequencia(){
    return freq1;
    }
}
