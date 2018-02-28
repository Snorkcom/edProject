package civilopedia.controllers;

/**
 *
 * @author Anna
 */

import java.util.List;
import civilopedia.model. Districts;
import org.junit.Test;
import static org.junit.Assert.*;

public class DistrictsControllerTest {
    
    public DistrictsControllerTest() {
    }

    
    @Test
    public void testGetAllDistricts() {
        
        DistrictsController instance = new DistrictsController();
        List<Districts> result = instance.getAllDistricts();
        assertTrue(result!=null && result.size()>0);        
    }


    @Test
    public void testGetDistricts() {  
        int id = 1;
        DistrictsController instance = new DistrictsController();
        Districts result = instance.getDistricts(id);
        assertTrue(result!=null && result.getID()==1);        
    }

    
   @Test
    public void testInsertUpdateDeleteDistricts() {  
        
        DistrictsController instance = new DistrictsController();        
        Districts districtsInsert = new Districts(4,"NAME4","DESCRIPTION4", "HISTORICAL_CONTEXT4",
                "IMAGE4", "FEATURES4", "REQUIREMENTS4", "UTILITY4");
       
        int result = instance.insertDistricts(districtsInsert);
        assertTrue(result==1); 

         Districts districtsUpdate = new Districts(4,"NAMEUpdate4","DESCRIPTION4", "HISTORICAL_CONTEXT4",
                "IMAGE4", "FEATURES4", "REQUIREMENTS4", "UTILITY4");
        int resultUpdate = instance.updateDistricts(districtsUpdate);
        assertTrue(resultUpdate==1);
        
        int resultDelete = instance.deleteDistricts(4);  
        assertTrue(resultDelete == 1);
        
    }
    
    // ALTER TABLE districts AUTO_INCREMENT = 3;  
    
}
