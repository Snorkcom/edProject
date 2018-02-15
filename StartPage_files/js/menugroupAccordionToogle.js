var menugroup = document.getElementsByClassName("menugroup");						

for (let i = 0;  i < menugroup.length; i++) {	
	menugroup[i].classList.add("active");
}
	
for (let i = 0;  i < menugroup.length; i++) {
	
	
						
	menugroup[i].addEventListener("click", function() {							
		this.classList.toggle("active");
		
		var panel = this.nextElementSibling;
		if (panel.style.display === "block") {
			panel.style.display = "none";
		} else {
			panel.style.display = "block";
		}
		
		/*Меняет бэкграунд при клике*/
		if($(this).hasClass("active")){		
		this.style = "background-image: url('./StartPage_files/images/menuitem/menugroupOpenActive.png');"
		}
		else{
			this.style = "background-image: url('./StartPage_files/images/menuitem/menugroupCloseActive.png');"
		}
		/*__________________________*/	
					
		});
		
		
}