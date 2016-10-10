
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.json.JSONObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arthur
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Jogador> listJogadores = new ArrayList<>();
        try {           
            JSONObject object = ConvertJson.chamadaHttpInfo(); //Todas Informações.
             Iterator it1 = object.keys();
             String Key1 = (String) it1.next();
            JSONObject mapAtletas = object.getJSONObject(Key1);          
           
            Iterator it = mapAtletas.keys();
            while(it.hasNext()){
                     Jogador jogador = new Jogador();
                    String key = (String) it.next();
                     JSONObject infoAtletas = mapAtletas.getJSONObject(key); 
                     
                     listJogadores.add(jogador);
            }
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
