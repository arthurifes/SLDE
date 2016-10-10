/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arthur
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Http {
    
    public String chamaUrl(String url) throws IOException {
        URL cartola = new URL(url);
        StringBuilder builder;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(cartola.openStream()))) {
            builder = new StringBuilder();
            String retornoJson;
            while ((retornoJson = bufferedReader.readLine()) != null){
                builder.append(retornoJson);
            }
        }
 
      return builder.toString();
    }   
}
