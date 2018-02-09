<?php
				$p1 = (isset($_GET['p1'])) ? (int) $_GET['p1'] : 0;
				$p2 = (isset($_GET['p2'])) ? (int) $_GET['p2'] : 0;
				$p3 = (isset($_GET['p3'])) ? (int) $_GET['p3'] : 0;
				$p4 = (isset($_GET['p4'])) ? (int) $_GET['p4'] : 0;
				
				exec("/home/pi/pi $p1 $p2 $p3 $p4", $op, $return);
				
				if ($return!== 77){
					echo "ERROR <br>";
				} 
				else{
					echo "<br><br>";					
				}
							
				?>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>RPI Sterowanie światłem - Apache2 Debian Server +PHP</title>
    <style type="text/css" media="screen">
  * {
    margin: 0px 0px 0px 0px;
    padding: 0px 0px 0px 0px;
  }

  body, html {
    padding: 3px 3px 3px 3px;

    background-color: #D8DBE2;

    font-family: Verdana, sans-serif;
    font-size: 11pt;
    text-align: center;
  }

  div.main_page {
    position: relative;
    display: table;

    width: 800px;

    margin-bottom: 3px;
    margin-left: auto;
    margin-right: auto;
    padding: 0px 0px 0px 0px;

    border-width: 2px;
    border-color: #212738;
    border-style: solid;

    background-color: #FFFFFF;

    text-align: center;
  }

  div.page_header {
    height: 99px;
    width: 100%;

    background-color: #F5F6F7;
  }

  div.page_header span {
    margin: 15px 0px 0px 50px;

    font-size: 180%;
    font-weight: bold;
  }

  div.page_header img {
    margin: 3px 0px 0px 40px;

    border: 0px 0px 0px;
  }

  div.table_of_contents {
    clear: left;

    min-width: 200px;

    margin: 3px 3px 3px 3px;

    background-color: #FFFFFF;

    text-align: left;
  }

  div.table_of_contents_item {
    clear: left;

    width: 100%;

    margin: 4px 0px 0px 0px;

    background-color: #FFFFFF;

    color: #000000;
    text-align: left;
  }

  div.table_of_contents_item a {
    margin: 6px 0px 0px 6px;
  }

  div.content_section {
    margin: 3px 3px 3px 3px;

    background-color: #FFFFFF;

    text-align: left;
  }

  div.content_section_text {
    padding: 4px 8px 4px 8px;

    color: #000000;
    font-size: 100%;
  }

  div.content_section_text pre {
    margin: 8px 0px 8px 0px;
    padding: 8px 8px 8px 8px;

    border-width: 1px;
    border-style: dotted;
    border-color: #000000;

    background-color: #F5F6F7;

    font-style: italic;
  }

  div.content_section_text p {
    margin-bottom: 6px;
  }

  div.content_section_text ul, div.content_section_text li {
    padding: 4px 8px 4px 16px;
  }

  div.section_header {
    padding: 3px 6px 3px 6px;

    background-color: #8E9CB2;

    color: #FFFFFF;
    font-weight: bold;
    font-size: 112%;
    text-align: center;
  }

  div.section_header_red {
    background-color: #CD214F;
  }

  div.section_header_grey {
    background-color: #9F9386;
  }

  .floating_element {
    position: relative;
    float: left;
  }

  div.table_of_contents_item a,
  div.content_section_text a {
    text-decoration: none;
    font-weight: bold;
  }

  div.table_of_contents_item a:link,
  div.table_of_contents_item a:visited,
  div.table_of_contents_item a:active {
    color: #000000;
  }

  div.table_of_contents_item a:hover {
    background-color: #000000;

    color: #FFFFFF;
  }

  div.content_section_text a:link,
  div.content_section_text a:visited,
   div.content_section_text a:active {
    background-color: #DCDFE6;

    color: #000000;
  }

  div.content_section_text a:hover {
    background-color: #000000;

    color: #DCDFE6;
  }

  div.validator {
  }
    </style>
  </head>
  <body>



    <div class="main_page">
      <div class="page_header floating_element">
        <img src="/icons/openlogo-75.png" alt="Debian Logo" class="floating_element"/>
        <span class="floating_element">
		Apache2 Debian serwer na RPI +PHP
        </span>
      </div>
      <div class="content_section floating_element">


        <div class="section_header section_header_red">
          <div id="about"></div>
          <center> STRONA PHP - zarządzanie zapalaniem światła w pomieszczeniach
        </div>
        <div class="content_section_text">
          <p>
                
				<center><b>Plik tej strony zlokalizowany jest w folderze: </b> <br />
                <tt>/var/www/html/light.php</tt> <br />
			<b>na Raspberry Pi</b> <br />
			<b> ------------------------------------------------------</b></center>
          </p>


          <p>
                <center><b>WYKONAWCY PROJEKTU:</b> <br />
		Jacek Cieślak | 29487 <br />
		Maciej Karol  | 29687 </center>
          </p>
		  <p>
		  <i> Wyższa Szkoła Informatyki i Umiejętności w Łodzi<br>
				Wydział: Informatyka i Zarządzanie <br>
				Kierunek: Informatyka<br>
				semestr 5 2017/18; niestacjonarne
				</i>
		  </p>

        </div>
        <div class="section_header">
          <div id="changes"></div>
                <b><center>KRÓTKI OPIS DZIAłANIA STRONY</center></b>
        </div>
        <div class="content_section_text">
          <p>
              <center> Strona ta jest odpowiedzialna za komunikację pomiędzy aplikacją desktopową (JAVA)
						a programem kontrolującym zapalanie świateł.</center> 

          </p>
          <p>
                <center>-------------------------------------</center>
          </p>

          <ul>

          </ul>
        </div>

        <div class="section_header">
            <div id="docroot"></div>
                POWIĄZANE PLIKI
        </div>

        <div class="content_section_text">
            <p>
                <i>/var/www/html/light.php</i> - strona główna (strona na której się znajdujesz obecnie)
            </p>
			<p>
                <i>/home/pi/pi</i> - plik wykonywalny odpowiedzialny za zapalanie światła
            </p>
            <p>
                <i>/var/www/html/infophp.php</i> - informacje o serwerze
            </p>
        </div>

        <div class="section_header">
          <div id="bugs"></div>
                AKTUALNE WARTOŚCI PRZEKAZANYCH ARGUMENTÓW
        </div>
        <div class="content_section_text">
          <p>
                

		<?php
		echo "Przekazane argumenty to: ";
		echo " ".$p1." ".$p2." ".$p3." ".$p4;
		?>
          </p>
        </div>




      </div>
    </div>
    <div class="validator">
    </div>

  </body>
</html>

