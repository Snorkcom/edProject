$(".tab").on("mouseover", function() {	
		var str = $(this).attr("src");
		var number =  str[str.length - 8] + str[str.length - 7];
		str = "./StartPage_files/images/tabrow/"+number+".2.png";	
		
		
		if($(this).attr("id") != "now");
		$(this).attr("src", str);
});

$(".tab").on("mouseout", function() {	
		var str = $(this).attr("src");
		var number =  str[str.length - 8] + str[str.length - 7];
		str = "./StartPage_files/images/tabrow/"+number+".1.png";	

		
			if($(this).attr("id") != "now")
		$(this).attr("src", str);
});