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
public class Filho {
    private Integer qtdFilhos02 = 0;
    private Integer qtdFilhos38 = 0;
    private Integer qtdFilhos815 = 0;
    private double filhos02 = 0;
    private double filhos38 = 0;
    private double filhos815 = 0;
    private double valorBolsa = 0;
    
    public void QtdFilhos(Integer Filhos02, Integer Filhos38, Integer Filhos815){
    qtdFilhos02 = Filhos02;
    qtdFilhos38 =  Filhos38;
    qtdFilhos815 = Filhos815;
    }
    public void calcBolsa(){
    valorBolsa = filhos02 + filhos38 + filhos815;
    }
    public void Filhos02(){
    filhos02 = qtdFilhos02*15.5;    
    }
    public void Filhos38(){
    filhos38 = qtdFilhos38*10;
    }
    public void Filhos815(){
    filhos815 = qtdFilhos815*5.5;
    }
    public Integer GetQtdFilhos02(){
    return qtdFilhos02;
    }
    public Integer GetQtdFilhos38(){
    return qtdFilhos38;
    }
    public Integer GetQtdFilhos815(){
    return qtdFilhos815;
    }
    public double GetFilhos02(){
    return filhos02;
    }
    public double GetFilhos38(){
    return filhos38;
    }
    public double GetFilhos815(){
    return filhos815;
    }
    public double GetValorBolsa(){
    return valorBolsa;
    }
}
