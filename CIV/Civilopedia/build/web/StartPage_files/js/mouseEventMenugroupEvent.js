// Меняет картинку при наведении мыши у разделов(которые состоят из тем)
	
$(".menugroup").mouseover(function () {

    if ($(this).hasClass("active")) {
        this.style = "background-image: url('./StartPage_files/images/menuitem/menugroupOpenActive.png');"
    } else {
        this.style = "background-image: url('./StartPage_files/images/menuitem/menugroupCloseActive.png');"
    }
});

$(".menugroup").mouseout(function () {

    if ($(this).hasClass("active")) {
        this.style = "background-image: url('./StartPage_files/images/menuitem/menugroupOpen.png');"
    } else {
        this.style = "background-image: url('./StartPage_files/images/menuitem/menugroupClose.png');"
    }
});
