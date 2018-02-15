
$('.menuitem').click(function(){
	
	
	var NAME = $(this).text();    
	var TABLE = table;
	
	
	$('.menuitem').removeAttr("id");
	$(this).attr('id', 'now');
	$('.menuitem').css('background-image', 'url(\'./StartPage_files/images/menuitem/menuitem.png\')');	
	this.style = "background-image: url('./StartPage_files/images/menuitem/menuitem_light.png');";
	
	
	
	$.ajax({
		type: "POST",
		url: "./StartPage_files/php/Select.php",
		data: {fname:NAME, ftable:TABLE}}).done(function( result )
		{
			$("#contentFromDB").html(result);
		});
		
});
