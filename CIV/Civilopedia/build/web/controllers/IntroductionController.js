class IntroductionController {

    // Получение массива данных Introduction по id 
        
    getIntroductionByIdController(id) {
        // Создаем экземпляр класса IntroductionService
        var service = new IntroductionService();
        // Получает данные с api в json формате, заменяет на массив(data ниже)
        return service.getIntroductionByIdService(id);
    }

    // Превращение данных в html код
    getIntroductionById(id) {
       
        /* Используем функцию этого класса getIntroductionByIdController(id),
         * чтобы получить Введение по его id
         */
        var data = this.getIntroductionByIdController(id);        
        
        var res = ""; //пустая строка, куда будут записываться данные     
               
        var ID = data.id;               // id введения     
        var INTR_NAME = data.intr_NAME; // имя введения   
        var INTR_TEXT = data.intr_TEXT; // текст введения   
            
        res = "<div class=\"contentHeader\"> <br> Введение </div> <br>"+
              "<p style=\"margin-top:4px; color:  rgba(58, 56, 56, 0.8); text-indent: 20px; font-size:16px;\">"+
               data.intr_TEXT + "</p>";        // текст введения вставляется в готовую строку html кода    
        
                
        // Выбираем из документа(куда подключен скрипт) элемент с id="contentFromDB"
        var element = document.getElementById("contentFromDB");
        element.innerHTML = res;     // Вставляем туда получившуюся строку
        
    }
}


