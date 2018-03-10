//Скрипт для сворачивания пунктов меню слева "гармошкой"

var menugroup = document.getElementsByClassName("menugroup");

//Сначала все разделы открыты
for (let i = 0; i < menugroup.length; i++) {
    menugroup[i].classList.add("active");
}

// Вешает событие при нажатии на раздел: скрывает все темы
for (let i = 0; i < menugroup.length; i++) {

    menugroup[i].addEventListener("click", function () {
        this.classList.toggle("active"); // Удаляет/добавляет класс "active" при нажатии

        var panel = this.nextElementSibling;
        if (panel.style.display === "block") {
            panel.style.display = "none";
        } else {
            panel.style.display = "block";
        }

        // Меняет бэкграунд при клике
        if ($(this).hasClass("active")) {
            this.style = "background-image: url('./StartPage_files/images/menuitem/menugroupOpenActive.png');"
        } else {
            this.style = "background-image: url('./StartPage_files/images/menuitem/menugroupCloseActive.png');"
        }
    });
}