/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilopedia.dal;

import java.util.List;
import civilopedia.model.Districts;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author Anna
 */
public class DistrictsDal extends BaseDal {
    
    public DistrictsDal() {
        super();
    }
    
    public List<Districts> selectAll()
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      List<Districts> list =  session.selectList("districts.selectAll");
      session.close(); 
      return list;
    }
    
    public Districts selectById(int id)
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      Districts district =  session.selectOne("districts.selectById", id);
      session.close(); 
      return district;
    }
    
    public int deleteById(int id)
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      int count =  session.delete("districts.deleteById", id);
      session.commit();
      session.close(); 
      return count;
    }
     
    public int insert(Districts district)
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      int count =  session.insert("districts.insert", district);
      session.commit();
      session.close(); 
      return count;
    }
    public int update(Districts district)
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      int count =  session.update("districts.update", district);
      session.commit();
      session.close(); 
      return count;
    }
}
