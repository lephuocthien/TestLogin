<?php
require_once "config.php";
require_once "function.php";

$request = $_GET['apicall'];
switch ($request){
    case 'login':
        include "login.php";
        break;
    case'register':
        include "register.php";
        break;
}