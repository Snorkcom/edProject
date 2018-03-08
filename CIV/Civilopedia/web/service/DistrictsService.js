class DistrictsService
{
    getAllDistrictsService() {

        // запрос к серверу GetAllDistricts

        var request = new XMLHttpRequest();
        request.open('GET', '/Civilopedia/GetAllDistricts', false);
        request.send();        
        
        if (request.status == 200)
        {
            var districts = JSON.parse(request.responseText);            
            return districts;
            
        } else
        {
            alert(request.status + ': ' + request.statusText);
            return null;
        }
    }

    GetDistrictByIdService(id) {
        
        // запрос к серверу GetDistrictById?id=*
        
        var request = new XMLHttpRequest();
        request.open('GET', '/Civilopedia/GetDistrictsById?id=' + id, false);
        request.send();        
       
        if (request.status != 200)
        {
            alert(request.status + ': ' + request.statusText);           
            return null;
        } else
        {            
            var district = JSON.parse(request.responseText);             
            return district;
        }
    }

}


