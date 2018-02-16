package civilopedia.dal;

import java.util.List;
import civilopedia.model.City_states;
import org.apache.ibatis.session.SqlSession;


/**
 *
 * @author Марат Басков
 */
public class City_statesDal extends BaseDal{
    
    public City_statesDal() {
        super();
    }
    
    public List<City_states> selectAll()
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      List<City_states> list =  session.selectList("city_states.selectAll");
      session.close(); 
      return list;
    }
    
    public City_states selectById(int id)
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      City_states city_state =  session.selectOne("city_states.selectById", id);
      session.close(); 
      return city_state;
    }
    
    public int deleteById(int id)
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      int count =  session.delete("city_states.deleteById", id);
      session.commit();
      session.close(); 
      return count;
    }
     
    public int insert(City_states city_state)
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      int count =  session.insert("city_states.insert", city_state);
      session.commit();
      session.close(); 
      return count;
    }
    public int update(City_states city_state)
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      int count =  session.update("city_states.update", city_state);
      session.commit();
      session.close(); 
      return count;
    }
    
}



