
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arthur
 */
public class UsuarioDAO {
    
     public void salvarUsuario(Usuario usuario){
         
         ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection con = connectionFactory.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        
       try{
           String sql = "insert into dadosesportivos.usuario(nome,senha,email) values ( ? , ? ,  ?)";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, usuario.getNome());
            preparedStatement.setInt(2, usuario.getSenha());
            preparedStatement.setString(3, usuario.getEmail());
            
            preparedStatement.executeUpdate();
            preparedStatement.close();
            con.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
     
     public Boolean buscarUser(Usuario usuario){
         Boolean b = null;
         
        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection con = connectionFactory.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try{
            Statement s = con.createStatement();
	      String sql = 
	        "SELECT nome, senha" +
	        " FROM dadosesportivos.usuario" +
	        " WHERE nome='" + usuario.getNome() + "' " +
	        		"AND senha="+ usuario.getSenha();
	      ResultSet rs = s.executeQuery(sql);
              b = (Boolean)rs.next();
             
              s.close();
             con.close();
        }catch(SQLException exception){
            exception.printStackTrace();
        }
        return b;
         
     }
    
}
