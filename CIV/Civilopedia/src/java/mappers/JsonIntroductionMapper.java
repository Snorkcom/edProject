package mappers;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import civilopedia.model.Introduction;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Валерия Чайкина
 */
public class JsonIntroductionMapper {
    
     public static String toJson(Introduction introduction)   {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(introduction);
        } catch (IOException ex) {
            Logger.getLogger(JsonIntroductionMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
     public static String toJson(List<Introduction> introduction)   {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(introduction);
        } catch (IOException ex) {
            Logger.getLogger(JsonIntroductionMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
     public static Introduction fromJson(String json)   {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(json, Introduction.class);
        } catch (IOException ex) {
            Logger.getLogger(JsonIntroductionMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
