package civilopedia.dal;

import java.util.List;
import civilopedia.model.Districts;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Anna 
 */
public class DistrictsDalTest {
    
    public DistrictsDalTest() {
    }
    

    @Test
    public void testSelectAll() {      
        DistrictsDal dal = new DistrictsDal();        
        List<Districts> list =  dal.selectAll();
        assertTrue( list != null && list.size()>0);
    }


    @Test
    public void testSelectById() {
        DistrictsDal dal = new DistrictsDal();
        Districts districts =  dal.selectById(1);
        assertTrue( districts != null && districts.getID()==1);
    }
    

    @Test
    public void test() {
        DistrictsDal  dal = new DistrictsDal();
       Districts districts = new Districts(4,"NAME4","DESCRIPTION4", "HISTORICAL_CONTEXT4",
                "IMAGE4", "FEATURES4", "REQUIREMENTS4", "UTILITY4");         
        int INSERT =  dal.insert(districts);
        System.out.println(INSERT);
        
       Districts districts2 = new Districts(4,"NAME444","DESCRIPTION444", "HISTORICAL_CONTEXT444", 
               "IMAGE444", "FEATURES444", "REQUIREMENTS444", "UTILITY444"); 
        int UPDATE =  dal.update(districts2);
         System.out.println(UPDATE);
         
       int DELETE =  dal.deleteById(4);
       System.out.println(DELETE);
       assertTrue(INSERT == 1 && DELETE == 1 && UPDATE == 1);
    }     
    //ALTER TABLE districts AUTO_INCREMENT = 3; 
}
