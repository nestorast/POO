<?php
requiere_once("carphp.php");
requiere_once("uberXphp.php");
requiere_once("uberpoolphp.php");
requiere_once("accountphp.php");

$uberX = new UberX ("LIC1234", new Accountphp ("NameDriver", "Numdocdriver"), "marca", "model");
// se crea un objeto uberX que tomara las variables del constructor creado en el archivo uberX
$uberX->printDataCar();
//sintaxis para llamar un metodo
$uberX = new Uberpool ("LIC1234", new Accountphp ("NameDriver", "Numdocdriver"), "marca", "model");
// se crea un objeto uberX que tomara las variables del constructor creado en el archivo uberX
$uberpool->printDataCar()
?>