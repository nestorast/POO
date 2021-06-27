<?php
require_once('carphp.php'); //De donde se encuentra la informacion que va a heredar esta funcion o clase llamada uber
class UberX extends Carphp //clase uberx que hereda de la clase carphp
//la palabra o funcion extends es la que utiliza php para heredar de otra variable
{
    public $brand;
    public $model;
    public function __construct($license, $driver, $model, $brand)
    { //constructor de la clase uberx que tiene 4 parametos 2 de car y 2 de uber x
        parent::__construct($license, $driver); //metodo para traer de car las dos variables  
        $this->brand = $brand;
        $this->model = $model;
    }
    
}
?>