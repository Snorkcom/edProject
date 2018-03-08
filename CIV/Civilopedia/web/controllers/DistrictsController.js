class DistrictsController {

    // DATA  
    getDistrictByIdController(id) {
        var service = new DistrictsService();
        return service.GetDistrictByIdService(id);
    }

    getAllDistrictsController() {
        var service = new DistrictsService();
        return service.getAllDistrictsService();
    }

    // VIEW
    getAllDistricts() {
       
        var data = this.getAllDistrictsController();        
        
        var res = "";        
      
        for (var i = 0; i < data.length; i++) {
            var ID = data[i].id;
            var NAME = data[i].name;
            var DESCRIPTION = data[i].description;
            var HISTORICAL_CONTEXT = data[i].historical_CONTEXT;
            var IMAGE = data[i].image;
            var FEATURES = data[i].features;
            var REQUIREMENTS = data[i].requirements;
            var UTILITY = data[i].utility;
            
            res += "<div class=\"menuitem\">" + NAME + "</div>";            
        }
                
        //menu
        var element = document.getElementById("districts");
        element.innerHTML = res;     
        //название
        var element = document.getElementById("header");
        element.innerHTML = "<br>" + data[0].name;
        //уник способность
        var element = document.getElementById("description");
        element.innerHTML = data[0].description;
        //историч описание
        var element = document.getElementById("historical_context");
        element.innerHTML = data[0].historical_CONTEXT;
    }

}


