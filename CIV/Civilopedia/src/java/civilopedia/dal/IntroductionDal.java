/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilopedia.dal;

import java.util.List;
import civilopedia.model.Introduction;
import org.apache.ibatis.session.SqlSession;

/*
 * @author Валерия Чайкина
 */
public class IntroductionDal extends BaseDal {
    
    public IntroductionDal() {
        super();
    }
    
    public List<Introduction> selectAll()
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      List<Introduction> list =  session.selectList("introduction.selectAll");
      session.close(); 
      return list;
    }
    
    public Introduction selectById(int id)
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      Introduction introduction =  session.selectOne("introduction.selectById", id);
      session.close(); 
      return introduction;
    }
    
    public int deleteById(int id)
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      int count =  session.delete("introduction.deleteById", id);
      session.commit();
      session.close(); 
      return count;
    }
     
    public int insert(Introduction introduction)
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      int count =  session.insert("introduction.insert", introduction);
      session.commit();
      session.close(); 
      return count;
    }
    public int update(Introduction introduction)
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      int count =  session.update("introduction.update", introduction);
      session.commit();
      session.close(); 
      return count;
    }
}
