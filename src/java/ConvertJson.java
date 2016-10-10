
import java.io.IOException;
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
public class ConvertJson {
    
    private static final String API_INFO= "https://api.cartolafc.globo.com/atletas/mercado";
   
    
    public static JSONObject chamadaHttpInfo() throws IOException {
        Http http = new Http();
        String retornoJson = http.chamaUrl(API_INFO);
        JSONObject objetoJson = JSONObject.fromObject(retornoJson);
        return objetoJson;
    }
    
    
    
}
