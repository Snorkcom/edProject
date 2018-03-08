<?php

function connectDB() {
	$connect = mysql_connect('localhost', 'root', '');
	mysql_select_db('civilopedia', $connect) or die(mysql_error());;
	mysql_set_charset('utf8', $connect);	
	return $connect;
}


function select($select_table, $select_name) {
	$connect = connectDB();
	$sql = "SELECT * FROM ".$select_table." WHERE NAME='".$select_name."'";
	$result = mysql_query($sql, $connect );
	mysql_close($connect);
	$row = mysql_fetch_array($result);	
	return $row;
}

header('Content-Type: text/html; charset=utf-8'); // поправляет кодировку символов между браузером и бд
$name = $_POST['fname'];
$table = $_POST['ftable'];

$product = select($table, $name);
echo $product['TEXT'];

?>