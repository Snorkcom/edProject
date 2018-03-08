class City_statesController {

    // DATA  
    getCity_statesById(id) {
        var service = new City_statesService();
        return service.getCity_statesById(id);
    }

    getAllCity_statesController() {
        var service = new City_statesService();
        return service.getAllCity_statesService();
    }

    // VIEW
    getAllCity_states() {
       
        var data = this.getAllCity_statesController();        
        
        var res = "";
      
        for (var i = 0; i < data.length; i++) {
            var ID = data[i].id;
            var NAME = data[i].name;
            var UNIQUE_ABILITY = data[i].unique_ABILITY;
            var HISTORICAL_CONTEXT = data[i].historical_CONTEXT;
            var IMAGE = data[i].image;
            var TYPE = data[i].type;
            
            res += "<div class=\"menuitem\">" + NAME + "</div>";            
        }
                
        //menu
        var element = document.getElementById("city_states");
        element.innerHTML = res;     
        //название
        var element = document.getElementById("header");
        element.innerHTML = "<br>" + data[0].name;
        //уник способность
        var element = document.getElementById("unique_ABILITY");
        element.innerHTML = data[0].unique_ABILITY;
        //историч описание
        var element = document.getElementById("historical_CONTEXT");
        element.innerHTML = data[0].historical_CONTEXT;
    }

}


