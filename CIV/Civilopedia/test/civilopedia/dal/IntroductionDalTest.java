package civilopedia.dal;

import java.util.List;
import civilopedia.model.Introduction;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Валерия Чайкина
 */
public class IntroductionDalTest {
    
    public IntroductionDalTest() {
    }
    
     /**
     * Тест SelectAll в таблице introduction
     */
    @Test
    public void testSelectAll() {
        // Создание объекта IntroductionDal
        IntroductionDal dal = new IntroductionDal();   
        // Создание листа Introduction'ов и запись в него всех данных из таблицы introduction
        List<Introduction> list =  dal.selectAll();
        // Проверка на то, что лист не равен null(dal.selectAll() сработал) и в нем есть какие-то объекты
        assertTrue( list != null && list.size()>0);
    }

    /**
     * Тест SelectById в таблице introduction
     */
    @Test
    public void testSelectById() {        
        IntroductionDal dal = new IntroductionDal();
        // Теперь запрос selectById(1), где id = 1
        Introduction introduction =  dal.selectById(1);
        //Проверка на то, что лист не равен null, и id должно быть равным 1
        assertTrue( introduction != null && introduction.getID()==1);      
    }
    
    /**
     * Тест Insert в таблицу introduction
     * Тест Update в таблицу introduction
     * Тест DeleteById в таблице introduction
     */
    @Test
    public void testInsertUpdateDeleteById() {        
        IntroductionDal dal = new IntroductionDal();
        
        /**
         * Тест Insert в таблицу introduction
         */
        //Создание объекта Introduction
        Introduction introductionInsert = new Introduction(4,"INTR_NAME4","INTR_TEXT4"); 
        // Переменная INSERT показывает количество добавленных строк в таблицу introduction
        // dal.insert(X) добавляет в таблицу данные объекта "X"
        int INSERT =  dal.insert(introductionInsert);
        //Проверка на INSERT == 1
        assertTrue(INSERT == 1);
        
        /**
         * Тест Update в таблицу introduction
         */
        Introduction introductionUpdate = new Introduction(4,"IntroductionName4","IntroductionText4");         
        // Переменная UPDATE показывает количество обновленных строк в таблице introduction
        // dal.update(x) обновляет данные в таблице introduction объектом x с id = x.getID()
        int UPDATE =  dal.update(introductionUpdate);
        //Проверка на DUPDATE == 1
        assertTrue(UPDATE == 1);
        
        /**
         * Тест DeleteById в таблице introduction
         */
        // Переменная DELETE показывает количество удаленных строк в таблице introduction(в данном случае либо 0, либо 1)
        // dal.deleteById(x) удаляет из таблицы introduction запись с id = x
        int DELETE =  dal.deleteById(4);
        //Проверка на DELETE == 1
        assertTrue(DELETE == 1);        
    }     
   
    // Обновление автоинкремента ALTER TABLE introduction AUTO_INCREMENT = 3;    
}
