/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista.pratica.reforco1;

/**
 *
 * @author guilh
 */
public class Data {
    private Integer dia = 0;
    private Integer mes = 0;
    private Integer ano = 0;
    
   String atualizarData(Integer diaa, Integer mess, Integer anoo){
        if(diaa >= 1 && diaa <= 31 && mess >= 1 && mess <= 12){
            dia = diaa;
            mes = mess;
            ano = anoo;
            return "Data Válida";
        }else{
            dia = 0;
            mes = 0;
            ano = 0;
            return "Data Inválida";
        }
    }
   String exibeData(){
       String dataCompleta = String.format("%d/%d/%d", dia, mes, ano);
       return dataCompleta;
   }
   
   String comparaData(Integer diass, Integer mess, Integer anoo){
       if(diass.equals(dia) && mess.equals(mes) && anoo.equals(ano)){
       return "Datas Iguais!";
       }else{
       return "Datas Diferentes!";
       }
   }
}
    
