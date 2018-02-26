package civilopedia.controllers;

import java.util.List;
import civilopedia.dal.IntroductionDal;
import civilopedia.model.Introduction;
/**
 *
 * @author Валерия Чайкина
 */
public class IntroductionController {
    
 protected IntroductionDal introductionDal;

    public IntroductionController() 
    {
        this.introductionDal = new IntroductionDal();
    }
    
    public List<Introduction> getAllIntroduction()
    {
        return introductionDal.selectAll();
    }
    
    public Introduction getIntroduction(int id)
    {
        return introductionDal.selectById(id);
    }
    
    public int insertIntroduction(Introduction introduction)
    {
       return introductionDal.insert(introduction);
    }
    
    public int updateIntroduction(Introduction introduction)
    {
       return introductionDal.update(introduction);
    }
    
    public int deleteIntroduction(int id)
    {
       return introductionDal.deleteById(id);
    }   

}
