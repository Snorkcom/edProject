<!DOCTYPE html>
<html>
<head>
    <META http-equiv="Content-Type" content="text/html" charset="utf-8">
    <TITLE>Основные цивилизации | CIVILOPEDIA VI</TITLE>
    <META NAME="keywords" content="civilopedia,civilopedia online,civilization, civilization 6,civilization VI, civilization6, цивилопедия, цивилопедия 6, цивилопедия6">
    <META NAME="description" CONTENT="Перенос энциклопедии из игры CIVILIZATION VI. Цивилопедия 6 представляет собой подробное описание всех аспектов игры.">



    <link rel="stylesheet" type="text/css" href="./StartPage_files/css/styles.css">
    <link rel="stylesheet" type="text/css" href="./StartPage_files/css/jquery.mCustomScrollbar.css" />

    <script type="text/javascript" src="./StartPage_files/js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="./StartPage_files/js/jquery.mCustomScrollbar.concat.min.js"></script>

	<script> var table = "major_civilizations"; </script>
	
</head>

<body>
	<div class="CenterDiv">
	
    <div class="topContainer" style="z-index: 2;  position: relative;">

        <div class="header"><a href="" class="titlelink">CIVILOPEDIA VI</a></div>

        <div class="tabrow">
            <a href="1StartPage.php">                           <img src="./StartPage_files/images/tabrow/01.1.png" class="tab"   				title="Понятия">  </a>
            <a href="2BasicCivilizations.php">                  <img src="./StartPage_files/images/tabrow/02.2.png" class="tab"	id="now"	title="Основные цивилизации">           </a>
            <a href="3Leaders.php">                             <img src="./StartPage_files/images/tabrow/03.1.png" class="tab"				title="Лидеры">            </a>
            <a href="4CityStates.php">                          <img src="./StartPage_files/images/tabrow/04.1.png" class="tab"				title="Города-государства">            </a>
            <a href="5Districts.php">                           <img src="./StartPage_files/images/tabrow/05.1.png" class="tab"				title="Районы">            </a>
            <a href="6Buildings.php">                           <img src="./StartPage_files/images/tabrow/06.1.png" class="tab"				title="Здания">            </a>
            <a href="7MiraclesAndProjects.php">                 <img src="./StartPage_files/images/tabrow/07.1.png" class="tab"				title="Чудеса и проекты">            </a>
            <a href="8Units.php">                               <img src="./StartPage_files/images/tabrow/08.1.png" class="tab"				title="Юниты">            </a>
            <a href="9RiseOfUnits.php">                         <img src="./StartPage_files/images/tabrow/09.1.png" class="tab"				title="Повышение юнитов">            </a>
            <a href="10GreatPeople.php">                         <img src="./StartPage_files/images/tabrow/10.1.png" class="tab"				title="Великие люди">            </a>
            <a href="11Technologies.php">                        <img src="./StartPage_files/images/tabrow/11.1.png" class="tab"				title="Технологии">            </a>
            <a href="12SocialTechnologies.php">                  <img src="./StartPage_files/images/tabrow/12.1.png" class="tab"				title="Социальные институты">            </a>
            <a href="13GovernmentAndPolicyCourses.php">          <img src="./StartPage_files/images/tabrow/13.1.png" class="tab"				title="Правительства и политические курсы">            </a>
            <a href="14Religions.php">                           <img src="./StartPage_files/images/tabrow/14.1.png" class="tab"				title="Религии">            </a>
            <a href="15LandscapesAndTheirCharacteristics.php">   <img src="./StartPage_files/images/tabrow/15.1.png" class="tab"				title="Ландшафты и их характеристики">            </a>
            <a href="16Resources.php">                           <img src="./StartPage_files/images/tabrow/16.1.png" class="tab"				title="Ресурсы">            </a>
            <a href="17ImprovementsAndRoutes.php">               <img src="./StartPage_files/images/tabrow/17.1.png" class="tab"				title="Улучшения и маршруты">            </a>
        </div>
    </div>

     <div class="content">

        <div class="menu" class="mCustomScrollbarMy" data-mcs-theme="inset-2">

            <div class="menugroupcontainer">
					
				<a href="2BasicCivilizations.php"><div class="menuitem">Введение</div></a>	
				<div class="menuitem">Австралия</div>	
				<div class="menuitem">Америка</div>
				<div class="menuitem">Англия</div>	
				<div class="menuitem">Аравия</div>		
				<div class="menuitem">Ацтеки</div>	
				<div class="menuitem">Бразилия</div>
				<div class="menuitem">Германия</div>	
				<div class="menuitem">Греция</div>	
				<div class="menuitem">Египет</div>	
				<div class="menuitem">Индия</div>
				<div class="menuitem">Индонезия</div>	
				<div class="menuitem">Испания</div>	
				<div class="menuitem">Китай</div>	
				<div class="menuitem">Конго</div>
				<div class="menuitem">Кхмеры</div>	
				<div class="menuitem">Македония</div>								

            </div>

        </div>

        <div class="contentright">
            <div class="contentwide mCustomScrollbar" data-mcs-theme="inset-2-dark">
                
                <div class="l">
                    <div class="r">
                        <div class="t">
                            <div class="b">
                                <div class="lb">
                                    <div class="rb">
                                        <div class="lt">
                                            <div class="rt">	
											<!---------------------------------------------------------->
											<div id="contentFromDB">
											
												<?php
												require_once "./StartPage_files/php/selectForStartPage.php";
												$product = select('introduction', "Основные цивилизации");
												  echo $product['INTR_TEXT'];												   
												?>
                                                    
												</div>	
											<!---------------------------------------------------------->
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        </div>

    </div>


    <div class="borderbottom">&nbsp;</div>




    <div class="footer">
        <p>The artwork and designs contained on this site were not created by the site owner. All artwork and designs were done by <a href="https://www.civilization.com/" target="_blank">Firaxis</a> and have been exported from their game <a href="https://www.civilization.com/" target="_blank">Civilization 6</a>. The site owner does not hold any rights on the art or designs. All content was generated using the game's XML data files.</p>
    </div>
  

    <script src="./StartPage_files/js/mouseEventMenuItem.js"> </script>
    <script src="./StartPage_files/js/mouseEventTabrow.js"> </script>
	<script src="./StartPage_files/js/scrollbar.js"> </script>	
	<script src="./StartPage_files/js/tippy.all.min.js"></script>
	<script src="./StartPage_files/js/tooltip.js"></script>
	<script src="./StartPage_files/js/menugroupAccordionToogle.js"></script>
	<script src="./StartPage_files/js/mouseEventMenugroupEvent.js"></script>
	<script src="./StartPage_files/js/menuitemClick.js"></script>
	
	
	
	</div>
	
</body>
</html>
