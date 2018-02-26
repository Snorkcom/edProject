package civilopedia.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Валерия Чайкина
 */
public class IntroductionTest {
    
    public IntroductionTest() {
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
    /**
     * Тест создания класса Introduction
    **/
    @Test
    public void testCreateIntroduction() {
        System.out.println("Начало testCreateIntroduction"); 
        // Создание экземпляра класса Introduction 
        // с параметрами ID = 3, INTR_NAME = "INTR_NAME3", INTR_TEXT = "INTR_TEXT3"
        Introduction introduction = new Introduction(3,"INTR_NAME3","INTR_TEXT3");
        // Проверка ID, INTR_NAME, INTR_TEXT
        assertEquals(introduction.getID(), 3);
        assertEquals(introduction.getINTR_NAME(), "INTR_NAME3");
        assertEquals(introduction.getINTR_TEXT(), "INTR_TEXT3");
        System.out.println("Конец testCreateIntroduction");
    }
    
        
    /**
     * Тест сравнения экземпляров класса Introduction
     */
    @Test
    public void testEquals() {
        System.out.println("Начало testEquals");
        
        // Создание объектов класса Introduction для сравнения между собой
        Introduction introduction1 = new Introduction(4,"INTR_NAME4","INTR_TEXT4");
        Introduction introduction2 = new Introduction(4,"INTR_NAME4","INTR_TEXT4");
        Introduction introduction3 = new Introduction(5,"INTR_NAME5","INTR_TEXT5");
        
        // introduction1 должен быть равен(по всем полям) introduction2, 
        // и не равен introduction3
        assertTrue( introduction1.equals(introduction2) );
        assertFalse( introduction1.equals(introduction3) );
        
        System.out.println("Конец testEquals");
    }
    
}
