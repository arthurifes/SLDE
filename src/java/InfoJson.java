
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.json.JSONObject;


/**
 *
 * @author Arthur
 */
public class InfoJson {
    
    
    public List<Equipe> listEquipeJson() throws IOException, IOException{
        List<Equipe> equipes = new ArrayList<>(); 
        
         try {           
            JSONObject object = ConvertJson.chamadaHttpInfo(); //Todas Informações.
           
            JSONObject mapClubes = object.getJSONObject("clubes");        
           
            Iterator it = mapClubes.keys();
            while(it.hasNext()){
                     Equipe equipe = new Equipe();
                    String key = (String) it.next();
                     JSONObject infoClubes = mapClubes.getJSONObject(key); 
                     equipe.setIdEquipe(infoClubes.getInt("id"));
                     equipe.setNome(infoClubes.getString("nome"));
                     equipe.setAbreviacao(infoClubes.getString("abreviacao"));
                     equipe.setPosicao(infoClubes.getInt("posicao"));
                     equipes.add(equipe);
            }
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return equipes;
    }
    
    /**
     *
     * @return
     */
    public List<Jogador> listJogadorJson()  {
        
        List<Jogador> listJogadores = new ArrayList<>();
        
       
        try {           
            JSONObject object = ConvertJson.chamadaHttpInfo(); //Todas Informações.
           
            JSONObject mapAtletas = object.getJSONObject("atletas");          
           
            Iterator it = mapAtletas.keys();
            while(it.hasNext()){
                     Jogador jogador = new Jogador();
                    String key = (String) it.next();
                     JSONObject infoAtletas = mapAtletas.getJSONObject(key); 
                     jogador.setId(infoAtletas.getInt("atleta_id"));
                     jogador.setNomeJogador(infoAtletas.getString("nome"));
                     jogador.setApelido(infoAtletas.getString("apelido"));
                     jogador.setNum_jogos(infoAtletas.getInt("jogos_num"));
                     jogador.setFoto(infoAtletas.getString("foto"));
                     listJogadores.add(jogador);
            }
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listJogadores;        
    }
    
}
