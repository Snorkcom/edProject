package mappers;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import civilopedia.model.Districts;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Anna
 */
public class JsonDistrictsMapper {
    
     public static String toJson(Districts districts)   {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(districts);
        } catch (IOException ex) {
            Logger.getLogger(JsonDistrictsMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
     public static String toJson(List<Districts> districts)   {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(districts);
        } catch (IOException ex) {
            Logger.getLogger(JsonDistrictsMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
     public static Districts fromJson(String json)   {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(json, Districts.class);
        } catch (IOException ex) {
            Logger.getLogger(JsonDistrictsMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
