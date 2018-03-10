//Скрипт меняет изображения на пунктах меню слева

function menuitemAnimation() {
// Сначала выбирает первый menuitem "Введение" и меняет его свойства css
    $('.menuitem:first').css('background-image', 'url(\'./StartPage_files/images/menuitem/menuitem_light.png\')');
    $('.menuitem:first').attr('id', 'now'); // и добавляет id="now"	
	
    // Событие на menuitem'ы: при наведении меняет картинку на светлую
    $(".menuitem").mouseover(function () {
        //если данный menuitem не активен
        if ($(this).attr("id") != "now") {
            this.style = "background-image: url('./StartPage_files/images/menuitem/menuitem_light.png');"
            event.preventDefault();
        }
    });

    // Событие на menuitem'ы: при выходе курсора меняет картинку на темную
    $(".menuitem").mouseout(function () {
        //если данный menuitem не активен
        if ($(this).attr("id") != "now") {
            this.style = "background-image: url('./StartPage_files/images/menuitem/menuitem.png');"
            event.preventDefault();
        }
    });
}
