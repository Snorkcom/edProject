/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilopedia.dal;

import java.io.IOException;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 *
 * @author Басков Марат
 */
public class BaseDal 
{
    protected SqlSessionFactory sqlSessionFactory;
    
    public BaseDal() 
    {
        Reader reader = null;
        try 
        {
            reader = Resources.getResourceAsReader("civilopedia/mybatis/config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            System.out.println("Connected to the database");
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(BaseDal.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }      
    
}
