function Carsjs(license, driver) //nombre de la funcion
{ 
    this.id;    //variable tipo entero
    this.license;  //variable tipo caracter
    this.driver;  
    this.passenger;
    
}

Car.prototype.printDataCar= function () //creando un metodo de tipo car 
{
    console.log (this.driver)
}