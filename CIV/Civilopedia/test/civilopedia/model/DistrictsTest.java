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
 * @author Anna
 */
public class DistrictsTest {
    
    public DistrictsTest() {
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
 
   
    @Test
    public void testCreateDistricts() {
        System.out.println("Создание Districts");
        Districts districts = new Districts(4,"NAME4","DESCRIPTION4", "HISTORICAL_CONTEXT4",
                "IMAGE4", "FEATURES4", "REQUIREMENTS4", "UTILITY4");
        // юнит тесты
        assertEquals(districts.getID(), 4);
        assertEquals(districts.getNAME(), "NAME4");
        assertEquals(districts.getDESCRIPTION(), "DESCRIPTION4");
        assertEquals(districts.getHISTORICAL_CONTEXT(), "HISTORICAL_CONTEXT4");
        assertEquals(districts.getIMAGE(), "IMAGE4");
        assertEquals(districts.getFEATURES(), "FEATURES4");
        assertEquals(districts.getREQUIREMENTS(), "REQUIREMENTS4");
        assertEquals(districts.getUTILITY(), "UTILITY4");        
    }
    
    
    @Test
    public void testEquals() {
         System.out.println("Сравнение Districts");
        
        Districts districts1 = new Districts(4,"NAME4","DESCRIPTION4", "HISTORICAL_CONTEXT4",
                "IMAGE4", "FEATURES4", "REQUIREMENTS4", "UTILITY4");
        Districts districts2 = new Districts(4,"NAME4","DESCRIPTION4", "HISTORICAL_CONTEXT4",
                "IMAGE4", "FEATURES4", "REQUIREMENTS4", "UTILITY4");
        Districts districts3 = new Districts(5,"NAME4","DESCRIPTION4", "HISTORICAL_CONTEXT4",
                "IMAGE4", "FEATURES4", "REQUIREMENTS4", "UTILITY4");
        
        assertTrue( districts1.equals(districts2) );
        assertFalse( districts1.equals(districts3) );
        
    }
    
}
