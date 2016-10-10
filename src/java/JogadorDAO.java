
import com.sun.xml.xsom.impl.scd.Iterators;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
public class JogadorDAO {
    
    public List<Jogador> listaJogador(Equipe equipe){
        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection con = connectionFactory.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        
        List<Jogador> listJogador = new ArrayList<>();
        
        try{
            preparedStatement = con.prepareStatement("SELECT * FROM dadosesportivos.jogador where idEquipe = " + String.valueOf(equipe.getIdEquipe()));
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Jogador jogador = new Jogador();
                FundamentoAtaque fundamentoAtaque = new FundamentoAtaque();
                FundamentoDefesa fundamentoDefesa = new FundamentoDefesa();
                jogador.setId(resultSet.getInt("id"));
                jogador.setNomeJogador(resultSet.getString("nome"));
                jogador.setDataNascimento(resultSet.getDate("dataNascimento"));
                fundamentoAtaque.setId(resultSet.getInt("idFundmentoAtaque"));
                jogador.setFundamentoAtaque(fundamentoAtaque);
                fundamentoDefesa.setId(resultSet.getInt("idFundamenroDefesa"));
                jogador.setFundamentoDefesa(fundamentoDefesa);
                listJogador.add(jogador);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return listJogador;        
    }
    
    public Jogador bucarFundamentoAtaque(Jogador jogador){
        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection con = connectionFactory.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        
        try{
            preparedStatement = con.prepareStatement("SELECT * FROM dadosesportivos.fundamentoAtaque where id = " + String.valueOf(jogador.getFundamentoAtaque().getId()));
            resultSet = preparedStatement.executeQuery();
            
            jogador.getFundamentoAtaque().setGol(resultSet.getInt("gol"));
            jogador.getFundamentoAtaque().setAssistencia(resultSet.getInt("assistencia"));
            jogador.getFundamentoAtaque().setFinalizacaoNaTrave(resultSet.getInt("finalizacaoNaTrave"));
            jogador.getFundamentoAtaque().setFinalizacaoDefendida(resultSet.getInt("finalizacaoDefendida"));
            jogador.getFundamentoAtaque().setFinalizacaoFora(resultSet.getInt("finalizacaoFora"));
            jogador.getFundamentoAtaque().setFaltaSofrida(resultSet.getInt("faltaSofrida"));
            jogador.getFundamentoAtaque().setPenaltiPerdido(resultSet.getInt("penaltiPerdido"));
            jogador.getFundamentoAtaque().setImpedimento(resultSet.getInt("impedimento"));
            jogador.getFundamentoAtaque().setPasseErrado(resultSet.getInt("passeErrado"));
            
        
        }catch(SQLException e) {
            e.printStackTrace();
        }        
        return jogador;   
    }
    
    public Jogador bucarFundamentoDefesa(Jogador jogador){
        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection con = connectionFactory.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        
        try{
            preparedStatement = con.prepareStatement("SELECT * FROM dadosesportivos.fundamentoDefesa where id = " + String.valueOf(jogador.getFundamentoDefesa().getId()));
            resultSet = preparedStatement.executeQuery();
            
            jogador.getFundamentoDefesa().setJogosSemSofrerGol(resultSet.getInt("jogosSemSofrerGol"));
            jogador.getFundamentoDefesa().setDefesaDePenalti(resultSet.getInt("defesaDePenalti"));
            jogador.getFundamentoDefesa().setRoubadaDeBola(resultSet.getInt("roubadaDeBola"));
            jogador.getFundamentoDefesa().setDefesaDificil(resultSet.getInt("defesaDificil"));
            jogador.getFundamentoDefesa().setGolContra(resultSet.getInt("golContra"));
            jogador.getFundamentoDefesa().setCartaoVermelho(resultSet.getInt("cartaoVermelho"));
            jogador.getFundamentoDefesa().setGolSofrido(resultSet.getInt("golSofrio"));
            jogador.getFundamentoDefesa().setFaltaCometida(resultSet.getInt("faltaCometida"));
            
        
        }catch(SQLException e) {
            e.printStackTrace();
        }        
        return jogador;   
    }
    
}
