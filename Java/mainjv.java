class mainjv //declara la clase principal
{
    public static void main(String[] args) // declara la funcion principal
    {
        System.out.println("hola mundo"); //imprime Hola mundo
        Car car = new carjv(); //tipo de clase Carjs + nombre del objeto = new + metodo constructor()
        car.id = "1032398"; //agrega valores a la clase Car
        car.driver = "Nestor Lagos" ;
        car.license = "A21032";
        car.passenger = 4;
        car.printDataCar();//imprime lo que se encuentra en el metodo printDataCar creado en el archivo carjv
        
        Car car2 = new carjv();
        car2.id = "101935"; //agrega valores a la clase Car a car2
        car2.driver = "Daniel Lagos" ;
        car2.license = "B21019";
        car2.passenger = 4;
        System.out.println("Car License" + Car2.license); //imprime lo que se encuentra en car2.license

    }
}