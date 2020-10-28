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
public class Times {
    private Integer vitorias = 0;
    private Integer empates = 0;
    private Integer derrotas = 0;
    
    void registrarVitorias(){
    vitorias ++;
    }
    void registrarEmpates(){
    empates++;
    }
    void registrarDerrotas(){
    derrotas++;
    }
    
    public Integer getVitorias(){
    return vitorias;
    }
    public Integer getEmpates(){
    return empates;
    }
    public Integer getDerrotas(){
    return derrotas;
    }
}
