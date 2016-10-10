
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Arthur
 */
class EquipeDAO {
    
    public List<Equipe> listarEquipeDao(){

        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection con = connectionFactory.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        List<Equipe> equipeList = new ArrayList<>();

        try{
            preparedStatement = con.prepareStatement("SELECT * FROM equipe");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Equipe equipe = new Equipe();
                equipe.setNome(resultSet.getString("nome"));
                equipe.setIdEquipe(resultSet.getInt("id"));
                equipe.setNumeroJogos(resultSet.getInt("numeroJogos"));
                equipe.setNumeroVitoria(resultSet.getInt("numeroVitoria"));
                equipe.setNumeroEmpate(resultSet.getInt("numeroEmpate"));
                equipe.setNumeroDerrota(resultSet.getInt("numeroDerrota"));
                equipeList.add(equipe);
            }
            preparedStatement.close();
            con.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return  equipeList;
    }
    
}
