class City_statesService
{
    
    getAllCity_statesService() {

        // запрос к серверу GetAllCity_states

        var request = new XMLHttpRequest();
        request.open('GET', '/Civilopedia/GetAllCity_states', false);
        request.send();        
        
        if (request.status == 200)
        {
            var city_states = JSON.parse(request.responseText);            
            return city_states;
            
        } else
        {
            alert(request.status + ': ' + request.statusText);
            return null;
        }
    }

    getCity_stateByIdService(id) {
        
        // запрос к серверу GetCity_statesById?id=*
        
        var request = new XMLHttpRequest();
        request.open('GET', '/Civilopedia/GetCity_statesById?id=' + id, false);
        request.send();        
       
        if (request.status != 200)
        {
            alert(request.status + ': ' + request.statusText);           
            return null;
        } else
        {            
            var city_state = JSON.parse(request.responseText);             
            return city_state;
        }
    }

}

