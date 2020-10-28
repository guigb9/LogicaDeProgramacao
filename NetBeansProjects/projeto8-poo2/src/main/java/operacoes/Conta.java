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
public class Conta {
    private Integer saldo = 0;
    private Integer transacoes = 0;
    private String mensagem;
    
    public void ComprarPontos(Integer novoValor){
        saldo += novoValor;
        RegistrarTransacao();
    }
    private void MensagemAprovada(){
    mensagem = "Compra Aprovada";
    }
    private void MensagemNegada(){
    mensagem = "Compra Negada";
    }
    
    public void DebitarPontos(Integer novoValor){
        if(saldo - novoValor >= 0 && novoValor > 0){
        saldo -= novoValor;
        RegistrarTransacao();
        MensagemAprovada();
        }else{
        MensagemNegada();
        }
        
    }
    private void RegistrarTransacao(){
    transacoes++;
    
    }
    
    public Integer getSaldo(){
    
    return saldo;
    
    }
    public Integer getTransacoes(){
    return transacoes;
    
    }
    public String getMensagem(){
    return mensagem;
    }
}
