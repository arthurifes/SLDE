
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arthur
 */
public class Equipe {
    
    private int idEquipe, numeroJogos, numeroVitoria, numeroEmpate, numeroDerrota, posicao;
    private String nome, abreviacao;
    private List<Jogador> jogadorList;

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public String getAbreviacao() {
        return abreviacao;
    }

    public void setAbreviacao(String abreviacao) {
        this.abreviacao = abreviacao;
    }
    
    

    public String getNome() {
        return nome;
    }

    public int getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(int idEquipe) {
        this.idEquipe = idEquipe;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Jogador> getJogadorList() {
        return jogadorList;
    }

    public void setJogadorList(List<Jogador> jogadorList) {
        this.jogadorList = jogadorList;
    }

    public int getNumeroJogos() {
        return numeroJogos;
    }

    public void setNumeroJogos(int numeroJogos) {
        this.numeroJogos = numeroJogos;
    }

    public int getNumeroVitoria() {
        return numeroVitoria;
    }

    public void setNumeroVitoria(int numeroVitoria) {
        this.numeroVitoria = numeroVitoria;
    }

    public int getNumeroEmpate() {
        return numeroEmpate;
    }

    public void setNumeroEmpate(int numeroEmpate) {
        this.numeroEmpate = numeroEmpate;
    }

    public int getNumeroDerrota() {
        return numeroDerrota;
    }

    public void setNumeroDerrota(int numeroDerrota) {
        this.numeroDerrota = numeroDerrota;
    }
    
    
    
}
