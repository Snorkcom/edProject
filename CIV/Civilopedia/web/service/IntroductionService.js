class IntroductionService
{
    getAllIntroductionsService() {

        // запрос к серверу GetAllIntroduction

        var request = new XMLHttpRequest();
        request.open('GET', 'GetAllIntroduction', false);
        request.send();        
        
        if (request.status == 200)
        {
            var introductions = JSON.parse(request.responseText);            
            return introductions;
            
        } else
        {
            alert(request.status + ': ' + request.statusText);
            return null;
        }
    }

    getIntroductionById(id) {
        
        // запрос к серверу GetIntroductionById?id=*
        
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



