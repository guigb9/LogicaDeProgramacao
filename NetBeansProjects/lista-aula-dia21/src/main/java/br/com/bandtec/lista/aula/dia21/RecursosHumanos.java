/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista.aula.dia21;

/**
 *
 * @author guilh
 */
public class RecursosHumanos {
    private Integer totalPromovidos = 0;
    private Integer totalSalariosReajustados = 0;
    
    public void reajustarSalario(Colaborador colaborador, Double valorReajuste){
    colaborador.setSalario(valorReajuste + colaborador.getSalario());
    ++totalSalariosReajustados;
    }
    public void promoverColaborador(Colaborador colaborador, Double novoSalario, String novoCargo){
    colaborador.setCargo(novoCargo);
    colaborador.setSalario(novoSalario);
    ++totalPromovidos;
    }
    public Integer getTotalPromovidos() {
        return totalPromovidos;
    }

    public Integer getTotalSalariosReajustados() {
        return totalSalariosReajustados;
    }
}
