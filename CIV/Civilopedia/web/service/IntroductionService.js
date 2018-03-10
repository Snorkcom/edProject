class IntroductionService
{
    /* Класс отправляет Get запрос к серверу(согласно его api), и получает строку формата JSON.
     * Далее функция "JSON.parse(request.responseText)" создает из 
     *  json-строки массив данных с аналогичными названиями
     */
    
    getAllIntroductionsService() {

        // GET-запрос к серверу, который получает все Введения из таблицы introduction
        
        var request = new XMLHttpRequest(); // Объект XMLHttpRequest (или, сокращенно, XHR) дает возможность браузеру делать HTTP-запросы к серверу без перезагрузки страницы.
        request.open('GET', '/Civilopedia/GetAllIntroduction', false);
        request.send();        
        
        if (request.status == 200) // Если нет ошибки
        {
            // Парсит полученную json строку
            var introductions = JSON.parse(request.responseText);            
            return introductions;
            
        } else
        {
            alert(request.status + ': ' + request.statusText);
            return null;
        }
    }

    getIntroductionByIdService(id) {
        
        // GET-запрос к серверу, который получает Введение из таблицы introduction по его id
        
        var request = new XMLHttpRequest();
        request.open('GET', '/Civilopedia/GetIntroductionById?id=' + id, false);
        request.send();        
       
        if (request.status != 200)
        {
            alert(request.status + ': ' + request.statusText);           
            return null;
        } else
        {            
            var introduction = JSON.parse(request.responseText);             
            return introduction;
        }
    }

}



