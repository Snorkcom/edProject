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
    getDistrictById(id) {

        var data = this.getDistrictByIdController(id);

        var res = "";


        var ID = data.id;
        var NAME = data.name;
        var DESCRIPTION = data.description;
        var HISTORICAL_CONTEXT = data.historical_CONTEXT;
        var IMAGE = data.image;
        var FEATURES = data.features;
        var REQUIREMENTS = data.requirements;
        var UTILITY = data.utility;

        res += "<div class='contentHeader'> <br>" + NAME + "</div>" +
                "<br>" +
                "<table class='contentTable' border='0' cellpadding='0' cellspacing='0' align='center'>" +
                "<tr>" +
                "<td id='l_td' width='380'>" +
                "<div class='contentSubheader'> Описание </div>" +
                "<p style='margin-top:4px;'>" + DESCRIPTION + "</p>" +
                "<br><br>" +
                "<div class='contentSubheader'> Исторический контекст </div>" +
                "<p style='margin-top:4px;'>" + HISTORICAL_CONTEXT + "</p>" +
                "</td>" +
                "<td id=\"r_td\">" + IMAGE +
                "<br><br>" +
                FEATURES +
                "<br><br>" +
                REQUIREMENTS +
                "<br><br>" +
                UTILITY +
                "</td>" +
                "</tr>" +
                "</table>";


        // innerHTML
        var element = document.getElementById("contentFromDB");
        element.innerHTML = res;

    }

    getAllDistricts() {
        var data = this.getAllDistrictsController();

        var res = "<a href=''><div class='menuitem  introduction'>Введение</div></a>";

        for (var i = 0; i < data.length; i++) {

            var ID = data[i].id;
            var NAME = data[i].name;

            res += "<div class=\"menuitem\" data-id=" + ID + ">" + NAME + "</div>";
        }

        // innerHTML
        var element = document.getElementById("districts");
        element.innerHTML = res;
    }

}


