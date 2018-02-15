<?php

function connectDB() {
	$connect = mysql_connect('localhost', 'root', '');
	mysql_select_db('civilopedia', $connect) or die(mysql_error());;
	mysql_set_charset('UTF8', $connect);
	return $connect;
}

	
function select($table, $INTR_NAME) {
	$connect = connectDB();
	$sql = "SELECT * from ".$table." WHERE INTR_NAME='".$INTR_NAME."'";
	$result = mysql_query($sql, $connect );
	mysql_close($connect);
	$row = mysql_fetch_array($result);
	return $row;
}

?>