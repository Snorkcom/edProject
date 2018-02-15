	$(".menugroup").mouseover(function () {		
       
		if($(this).hasClass("active")){		
		this.style = "background-image: url('./StartPage_files/images/menuitem/menugroupOpenActive.png');"
		}
		else{
			this.style = "background-image: url('./StartPage_files/images/menuitem/menugroupCloseActive.png');"
		}
        /*event.preventDefault();*/
    });
	
	$(".menugroup").mouseout(function () {	
	
        if($(this).hasClass("active")){		
		this.style = "background-image: url('./StartPage_files/images/menuitem/menugroupOpen.png');"
		}
		else{
			this.style = "background-image: url('./StartPage_files/images/menuitem/menugroupClose.png');"
		}
       /* event.preventDefault();*/
    });
