/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilopedia.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Басков Марат
 */
public class City_statesTest {
    
    public City_statesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    /**
     * Тест проверки создания City_states
    **/
    @Test
    public void testCreateCity_states() {
        System.out.println("City_states 'Create' start test");
        City_states city_state = new City_states(4,"NAME4","UNIQUE_ABILITY4",
        "HISTORICAL_CONTEXT4","IMAGE4", "TYPE4");
        assertEquals(city_state.getID(), 4);
        assertEquals(city_state.getNAME(), "NAME4");
        assertEquals(city_state.getUNIQUE_ABILITY(), "UNIQUE_ABILITY4");
        assertEquals(city_state.getHISTORICAL_CONTEXT(), "HISTORICAL_CONTEXT4");
        assertEquals(city_state.getIMAGE(), "IMAGE4");
        assertEquals(city_state.getTYPE(), "TYPE4");
        System.out.println("City_states 'Create' end test");
    }
    
        
    /**
     * Тест проверки на равенство и неравенство двух City_states
     */
    @Test
    public void testEquals() {
        System.out.println("City_states 'Equals' start test");
        
        City_states city_state1 = new City_states(5,"NAME5","UNIQUE_ABILITY5",
        "HISTORICAL_CONTEXT5","IMAGE5", "TYPE5");
        City_states city_state2 = new City_states(5,"NAME5","UNIQUE_ABILITY5",
        "HISTORICAL_CONTEXT5","IMAGE5", "TYPE5");
        City_states city_state3 = new City_states(4,"NAME4","UNIQUE_ABILITY4",
        "HISTORICAL_CONTEXT4","IMAGE4", "TYPE4");
        
        assertTrue( city_state1.equals(city_state2) );
        assertFalse( city_state1.equals(city_state3) );
        
        System.out.println("City_states 'Equals' end test");
    }
    
}
