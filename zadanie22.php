<?php
   ob_start(); //rozpoczecie buforowania 
   $user= 'root';
   $pass= 'krasnal';
   $host = 'localhost';
   $base = 'Z22';    //tutaj nazwa twojej bazy
   $con=mysql_connect($host,$user,$pass);
   mysql_select_db($base);
      $ret = mysql_query("SELECT * FROM `kontakty_kryniewski` order by numer",$con);  //tutaj nazwa twojej tabeli
      echo "<br>";
 while($row = mysql_fetch_assoc($ret))
     {
              echo '   numer:   '.$row['numer'].'   Nazwisko:   '.$row['nazwisko'].'  Waga:   '.$row['waga'];
              echo '<br />';
    }
    $foremka = $_GET['sub'];
    if($foremka =='ok')
		 {
		   echo "dodaje";
mysql_query('INSERT INTO kontakty_kryniewski (numer, nazwisko, waga) VALUES('.$_GET['num'].', "'.$_GET['nazw'].'", '.$_GET['waga'].')')or die("problem z dodaniem wpisu");
                        header("Location: zadanie22.php"); // odœwie¿enie strony
                                 }
      ob_end_flush(); //zakonczenie buforowania 
?>

<form action="" method="get">
Numer:<input type="text" name="num"><br>
Nazwisko:<input type="text" name="nazw"><br>
Waga:<input type="text" name="waga"><br>
<input name="sub" type="submit" value="ok">
</form>
