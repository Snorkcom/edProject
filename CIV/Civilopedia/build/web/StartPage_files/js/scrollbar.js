 //Загружает кастомный скроллбар
 
 (function ($) {
            $(window).on("load", function () {
                $(".menu").mCustomScrollbar();
                $(".contentwide").mCustomScrollbar();
            });
        })(jQuery);