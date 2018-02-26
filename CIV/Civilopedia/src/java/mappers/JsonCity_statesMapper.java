/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mappers;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import civilopedia.model.City_states;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Басков Марат
 */
public class JsonCity_statesMapper {
    
     public static String toJson(City_states city_state)   {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(city_state);
        } catch (IOException ex) {
            Logger.getLogger(JsonCity_statesMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
     public static String toJson(List<City_states> city_states)   {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(city_states);
        } catch (IOException ex) {
            Logger.getLogger(JsonCity_statesMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
     public static City_states fromJson(String json)   {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(json, City_states.class);
        } catch (IOException ex) {
            Logger.getLogger(JsonCity_statesMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
