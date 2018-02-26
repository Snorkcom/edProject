/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilopedia.controllers;

import java.util.List;
import civilopedia.dal.City_statesDal;
import civilopedia.model.City_states;
/**
 *
 * @author Басков Марат
 */
public class City_statesController {
    
 protected City_statesDal city_statesDal;

    public City_statesController() 
    {
        this.city_statesDal = new City_statesDal();
    }
    
    public List<City_states> getAllCity_states()
    {
        return city_statesDal.selectAll();
    }
    
    public City_states getCity_states(int id)
    {
        return city_statesDal.selectById(id);
    }
    
    public int insertCity_states(City_states city_state)
    {
       return city_statesDal.insert(city_state);
    }
    
    public int updateCity_states(City_states city_state)
    {
       return city_statesDal.update(city_state);
    }
    
    public int deleteCity_states(int id)
    {
       return city_statesDal.deleteById(id);
    }   

}
