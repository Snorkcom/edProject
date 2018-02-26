package civilopedia.controllers;

/**
 *
 * @author Валерия Чайкина
 */

import java.util.List;
import civilopedia.model.Introduction;
import org.junit.Test;
import static org.junit.Assert.*;

public class IntroductionControllerTest {
    
    public IntroductionControllerTest() {
    }

    // Тест GetAllIntroduction
    @Test
    public void testGetAllIntroduction() {
        // Создается контроллер IntroductionController
        IntroductionController instance = new IntroductionController();
        // Создается лист Introduction'ов, и в него записываются все полученные из базы данных записи таблицы introduction
        List<Introduction> result = instance.getAllIntroduction();
        // Проверка листа
        assertTrue(result!=null && result.size()>0);        
    }

    // Тест GetIntroduction(id)
    @Test
    public void testGetIntroduction() {  
        // Указываем id
        int id = 1;
        IntroductionController instance = new IntroductionController();
        // Получаем объект по id из базы данных
        Introduction result = instance.getIntroduction(id);
        // Проверка объекта и его id
        assertTrue(result!=null && result.getID()==1);        
    }

    
    // Тест InsertIntroduction, UpdateIntroduction, DeleteIntroduction
   @Test
    public void testInsertIntroduction() {  
        
        IntroductionController instance = new IntroductionController();
        // Создание объекта класса Introduction для ввода в таблицу
        Introduction introductionInsert = new Introduction(4,"INTR_NAME4","INTR_TEXT4");
        // Возвращает кол-во вставленных строк в таблицу
        int result = instance.insertIntroduction(introductionInsert);
        // Проверка
        assertTrue(result==1); 
        
        // Создание объекта класса Introduction для обновления в таблице
        Introduction introductionUpdate = new Introduction(4,"UPDATE_NAME4","UPDATE_TEXT4");
        // Возвращает кол-во обновленных строк в таблице
        int resultUpdate = instance.updateIntroduction(introductionUpdate);
        // Проверка
        assertTrue(resultUpdate==1);
        
        // Возвращает кол-во удаленных строк в таблице
        int resultDelete = instance.deleteIntroduction(4);  
        // Проверка
        assertTrue(resultDelete == 1);
        
    }
    
    // Обновление автоинкремента ALTER TABLE introduction AUTO_INCREMENT = 3;  
    
}
