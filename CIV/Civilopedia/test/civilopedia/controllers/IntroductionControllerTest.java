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
        
        IntroductionController instance = new IntroductionController();
        List<Introduction> result = instance.getAllIntroduction();
        assertTrue(result!=null && result.size()>0);        
    }

    // Тест GetIntroduction(id)
    @Test
    public void testGetIntroduction() {       
        int id = 1;
        IntroductionController instance = new IntroductionController();
        Introduction result = instance.getIntroduction(id);
        assertTrue(result!=null && result.getID()==1);        
    }

    
    // Тест InsertIntroduction, UpdateIntroduction, DeleteIntroduction
   @Test
    public void testInsertIntroduction() {        
        IntroductionController instance = new IntroductionController();
        Introduction introductionInsert = new Introduction(4,"INTR_NAME4","INTR_TEXT4");
        int result = instance.insertIntroduction(introductionInsert);
        assertTrue(result==1); 
        
        Introduction introductionUpdate = new Introduction(4,"UPDATE_NAME4","UPDATE_TEXT4");
        int resultUpdate = instance.updateIntroduction(introductionUpdate);
        assertTrue(resultUpdate==1);
        
        int resultDelete = instance.deleteIntroduction(4);        
        assertTrue(resultDelete == 1);
        
    }
    
    // Обновление автоинкремента ALTER TABLE introduction AUTO_INCREMENT = 3;  
    
}
