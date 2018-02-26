/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilopedia.controllers;

/**
 *
 * @author Басков Марат
 */

import java.util.List;
import civilopedia.model.City_states;
import org.junit.Test;
import static org.junit.Assert.*;

public class City_statesControllerTest {
    
    public City_statesControllerTest() {
    }

    // Test GetAllCity_states
    @Test
    public void testGetAllCity_states() {
        System.out.println("City_statesController 'getAllCity_states' start test");
        City_statesController instance = new City_statesController();
        List<City_states> result = instance.getAllCity_states();
        assertTrue(result!=null && result.size()>0);
        System.out.println("=============City_statesController 'getAllCity_states' end test============= \n");
    }

    // Test GetCity_states(id)
    @Test
    public void testGetCity_states() {
        System.out.println("City_statesController 'GetCity_states' start test");
        int id = 1;
        City_statesController instance = new City_statesController();
        City_states result = instance.getCity_states(id);
        assertTrue(result!=null && result.getID()==1);
        System.out.println("=============City_statesController 'GetCity_states' end test============= \n");
    }

    
    // Test InsertCity_state 
   @Test
    public void testInsertCity_states() {
        System.out.println("City_statesController 'InsertCity_states' start test");
        City_statesController instance = new City_statesController();
        City_states city_state = new City_states(4,"NAME4", "UNIQUE_ABILITY4", "HISTORICAL_CONTEXT4", "IMAGE4", "TYPE4"); 
        int result = instance.insertCity_states(city_state);
        assertTrue(result==1);
        System.out.println("=============City_statesController 'InsertCity_states' end test============= \n");
    }
    
    
    // Test UpdateCity_state and DeleteCity_state(id) || ALTER TABLE city_states AUTO_INCREMENT = 3;
    @Test
    public void testDeleteCity_state() {
        System.out.println("City_statesController 'UpdateCity_state' start test");
        City_statesController instance = new City_statesController();
        City_states city_state = new City_states(4,"NAME4Update", "UNIQUE_ABILITY4Update", "HISTORICAL_CONTEXT4Update", "IMAGE4Update", "TYPE4Update"); 
        int resultUpdate = instance.updateCity_states(city_state);        
        System.out.println("=============City_statesController 'UpdateCity_state' end test============= \n");
        
        
        System.out.println("City_statesController 'DeleteCity_state' start test");                
        int resultDelete = instance.deleteCity_states(4);
        
        assertTrue(resultUpdate==1 && resultDelete == 1);
        System.out.println("=============City_statesController 'DeleteCity_state' end test============= \n");
    }
            
}
