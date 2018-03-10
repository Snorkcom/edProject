function menuitemClick() {
	
	$('.menuitem:not(.introduction)').click(function(){
		
		// Получаем data-id у менюитема
		var id = $(this).data("id");  
		
		$('.menuitem').removeAttr("id"); //убрать у всех менюитемов id
		$(this).attr('id', 'now'); // добавить id для выбранного менюитема
		//поменять его картинки	
		$('.menuitem').css('background-image', 'url(\'./StartPage_files/images/menuitem/menuitem.png\')'); 
		this.style = "background-image: url('./StartPage_files/images/menuitem/menuitem_light.png');";
		
		if($(this).hasClass("introduction")){
			return;
		}
		// Добавление текста в "contentFromDB"
		var controller = new City_statesController();
		controller.getCity_stateById(id);
		
	});
	
}
