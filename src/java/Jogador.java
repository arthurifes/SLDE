
import java.sql.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arthur
 */
class Jogador {
    
    private int id, num_jogos;
    private FundamentoAtaque fundamentoAtaque;
    private FundamentoDefesa fundamentoDefesa;
    private Equipe equipe;
    private String nomeJogador, foto;
    private String apelido;
    private Date dataNascimento;

    public int getNum_jogos() {
        return num_jogos;
    }

    public void setNum_jogos(int num_jogos) {
        this.num_jogos = num_jogos;
    }
    
    

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
  
    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    
    

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FundamentoAtaque getFundamentoAtaque() {
        return fundamentoAtaque;
    }

    public void setFundamentoAtaque(FundamentoAtaque fundamentoAtaque) {
        this.fundamentoAtaque = fundamentoAtaque;
    }

    public FundamentoDefesa getFundamentoDefesa() {
        return fundamentoDefesa;
    }

    public void setFundamentoDefesa(FundamentoDefesa fundamentoDefesa) {
        this.fundamentoDefesa = fundamentoDefesa;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }
    
   }
   
    

