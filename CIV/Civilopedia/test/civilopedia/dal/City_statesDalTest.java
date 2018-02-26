/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilopedia.dal;

import java.util.List;
import civilopedia.model.City_states;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Басков марат
 */
public class City_statesDalTest {
    
    public City_statesDalTest() {
    }
    
     /**
     * Test of selectAll method, of class City_statesDal.
     */
    @Test
    public void testSelectAll() {
        System.out.println("City_statesDal 'selectAll' start test");
        City_statesDal dal = new City_statesDal();        
        List<City_states> list =  dal.selectAll();
        assertTrue( list != null && list.size()>0);
        System.out.println("=============City_statesDal'selectAll' end test============= \n");
    }

    /**
     * Test of selectById method, of class City_statesDal.
     */
    @Test
    public void testSelectById() {
        System.out.println("City_statesDal 'selectById' start test");
        City_statesDal dal = new City_statesDal();
        City_states city_state =  dal.selectById(1);
        assertTrue( city_state != null && city_state.getID()==1);
        System.out.println("=============City_statesDal 'selectById' end test=============\n");
    }
    
    /**
     * Test of insert and deleteById methods, of class City_statesDal.
     * ALTER TABLE city_states AUTO_INCREMENT = 3;
     */
    @Test
    public void testInsertAndDeleteById() {
        System.out.println("City_statesDal 'insert and deleteById' start test");
        City_statesDal dal = new City_statesDal();
        City_states city_state = new City_states(4,"NAME4", "UNIQUE_ABILITY4", "HISTORICAL_CONTEXT4", "IMAGE4", "TYPE4");         
        int INSERT =  dal.insert(city_state);
        System.out.println("*Number of rows inserted: " + INSERT);
        int DELETE =  dal.deleteById(4);
        System.out.println("*Number of deleted rows: " + DELETE);
        assertTrue(INSERT == 1 && DELETE == 1);
        System.out.println("=============City_statesDal 'insert and deleteById' end test=============\n");
    } 
    
    /**
     * Test of update methods, of class City_statesDal.
     */
    @Test
    public void testUpdate() {
        System.out.println("City_statesDal 'update' start test");
        City_statesDal dal = new City_statesDal();
        City_states city_state1 = new City_states(3,"Highway to Hell", "Living easy, living free.", "Season ticket on a one-way ride,", "Asking nothing, leave me be", "Taking everything in my stride.");         
        int UPDATE =  dal.update(city_state1);
        City_states city_state2 = dal.selectById(3);
        System.out.println("*Number of rows updated: " + UPDATE + " "+ city_state2.getNAME()+"\n "+city_state2.getUNIQUE_ABILITY()
        +"\n "+city_state2.getHISTORICAL_CONTEXT()+"\n "+city_state2.getIMAGE()+"\n "+city_state2.getTYPE());
        City_states city_state3 = new City_states(3,"NAME3", "UNIQUE_ABILITY3", "HISTORICAL_CONTEXT3", "IMAGE3", "TYPE3");         
        int UPDATEback =  dal.update(city_state3);
        System.out.println("*Number of updated rows: " + UPDATEback);
        assertTrue(UPDATE == 1 && UPDATEback == 1);
        System.out.println("=============City_statesDal 'update' end test============= \n");
    }
    
}
