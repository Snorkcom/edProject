class City_statesController {

// Функции получение данных  
    getCity_stateByIdController(id) {
        var service = new City_statesService();
        return service.getCity_stateByIdService(id);
    }

    getAllCity_statesController() {
        var service = new City_statesService();
        return service.getAllCity_statesService();
    }

// Загрузка на страницу
    getAllCity_states() {

        var data = this.getAllCity_statesController();
        var WarCity_states = "";
        var CultureCity_states = "";
        var ScienceCity_states = "";
        var IndustrialCity_states = "";
        var ReligionCity_states = "";
        var TradeCity_states = "";
        for (var i = 0; i < data.length; i++) {

            var ID = data[i].id;
            var NAME = data[i].name;
            var TYPE = data[i].type;
            switch (data[i].type) {
                case 'war':
                    WarCity_states += "<div class=\"menuitem\" data-id=" + ID + ">" + NAME + "</div>";
                    break;
                case 'culture':
                    CultureCity_states += "<div class=\"menuitem\" data-id=" + ID + ">" + NAME + "</div>";
                    break;
                case 'science':
                    ScienceCity_states += "<div class=\"menuitem\" data-id=" + ID + ">" + NAME + "</div>";
                    break;
                case 'industrial':
                    IndustrialCity_states += "<div class=\"menuitem\" data-id=" + ID + ">" + NAME + "</div>";
                    break;
                case 'religion':
                    ReligionCity_states += "<div class=\"menuitem\" data-id=" + ID + ">" + NAME + "</div>";
                    break;
                case 'trade':
                    TradeCity_states += "<div class=\"menuitem\" data-id=" + ID + ">" + NAME + "</div>";
                    break;
                default:
                    alert('Я таких значений не знаю');
            }

        }

// Добавление пунктов меню
        var element;
        element = document.getElementById("war_city_states");
        element.innerHTML = WarCity_states;
        element = document.getElementById("culture_city_states");
        element.innerHTML = CultureCity_states;
        element = document.getElementById("science_city_states");
        element.innerHTML = ScienceCity_states;
        element = document.getElementById("industrial_city_states");
        element.innerHTML = IndustrialCity_states;
        element = document.getElementById("religion_city_states");
        element.innerHTML = ReligionCity_states;
        element = document.getElementById("trade_city_states");
        element.innerHTML = TradeCity_states;
    }

    getCity_stateById(id) {

        var data = this.getCity_stateByIdController(id);
        var city_state = "";

        var NAME = data.name;
        var UNIQUE_ABILITY = data.unique_ABILITY;
        var HISTORICAL_CONTEXT = data.historical_CONTEXT;
        var IMAGE = data.image;
        var TYPE = data.type;

        city_state = "<div class='contentHeader'> <br>" + NAME + "</div>" +
                "<br>"+
                "<table class='contentTable' border='0' cellpadding='0' cellspacing='0' align='center'>" +
                "<tr>" +
                "<td id='l_td' width='380'>" +
                "<div class='contentSubheader'> Уникальная способность </div>" +
                "<p style='margin-top:4px;'>" + UNIQUE_ABILITY + "</p>" +
                "<br><br>" +
                "<div class='contentSubheader'> Исторический контекст </div>" +
                "<p style='margin-top:4px;'>" + HISTORICAL_CONTEXT + "</p>" +
                "</td>" +
                "<td id=\"r_td\">" + IMAGE +
                "<br><br>" + TYPE +
                "</td>" +
                "</tr>" +
                "</table>";

        var element = document.getElementById("contentFromDB");
        element.innerHTML = city_state;

    }
}

