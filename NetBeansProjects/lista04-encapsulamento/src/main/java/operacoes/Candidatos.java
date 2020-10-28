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
public class Candidatos {
    private Integer votos = 0;
    private String nome = "";
    private Boolean encElei = true;
    public Candidatos(String nomeCandidato) {
        nome = nomeCandidato;
    }
    public void adicionarVotos(){
        if(encElei){
            votos++;
        }
    }
    

    public Integer getVotos() {
        return votos;
    }

    public void setVotos(Integer votos) {
        this.votos = votos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getEncElei() {
        return encElei;
    }

    public void setEncElei(Boolean encElei) {
        this.encElei = encElei;
    }
    
}
