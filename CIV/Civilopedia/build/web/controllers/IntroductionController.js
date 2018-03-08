class IntroductionController {

    // DATA  
    
    getAllIntroductionsController() {
        var service = new IntroductionService();
        return service.getAllIntroductionsService();
    }
    
    getIntroductionByIdController(id) {
        var service = new IntroductionService();
        return service.getIntroductionById(id);
    }

    

    // VIEW
    getIntroductionById(id) {
       
        var data = this.getIntroductionByIdController(id);        
        
        var res = "";      
               
        var ID = data.id;        
        var INTR_NAME = data.intr_NAME;        
        var INTR_TEXT = data.intr_TEXT;
            
        res = "<div class=\"contentHeader\"> <br> Введение </div> <br>"+
              "<p style=\"margin-top:4px; color:  rgba(58, 56, 56, 0.8); text-indent: 20px; font-size:16px;\">"+
               data.intr_TEXT + "</p>";            
        
                
        // Введение
        var element = document.getElementById("contentFromDB");
        element.innerHTML = res;     
        
    }
}


