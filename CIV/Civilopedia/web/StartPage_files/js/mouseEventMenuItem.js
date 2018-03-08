window.onload = function() {
	// Выбирает первый элемент
$('.menuitem:first').css('background-image', 'url(\'./StartPage_files/images/menuitem/menuitem_light.png\')');
$('.menuitem:first').attr('id', 'now');
	
	$(".menuitem").mouseover(function () {
		//Проверка на активность данного menuitem'a
		if($(this).attr("id") != "now"){
			
			this.style = "background-image: url('./StartPage_files/images/menuitem/menuitem_light.png');"
			event.preventDefault();
		
		}
    });
	$(".menuitem").mouseout(function () {	
		//Проверка на активность данного menuitem'a
		if($(this).attr("id") != "now"){
			
			this.style = "background-image: url('./StartPage_files/images/menuitem/menuitem.png');"
			event.preventDefault();
		
		}
		
    });
}
