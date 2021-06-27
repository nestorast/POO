class mainjv //declara la clase principal
{
    public static void main(String[] args) // declara la funcion principal
    {
        System.out.println("hola mundo"); //imprime Hola mundo
       
        Car car = new carjv("A21032" , new accountjv("Juan", "documJ1456" )); 
        //se crea el metodo constructor carjv en el archivo carjv
        //se crea en el main Car que es un objeto 
        //tipo de clase Car + nombre del objeto car = new + metodo constructor carjv(andentro va las variables una para carlicence  y las otras dos para el archivo account )
        //Se envia la licencia, se crea un nuevo objeto que envia nombre y documento que son creados en la clase accountjv
        car.id = "1032398"; 
        //agrega valores a la clase Car
        //car.driver = "Nestor Lagos" ; como se coloca driver y license en el archivo carjv en el metodo estos valores ya son agregados en la linea 6
        //car.license = "A21032";
        car.passenger = 4;
        car.printDataCar();//imprime lo que se encuentra en el metodo printDataCar creado en el archivo carjv
        
        Car car2 = new carjv("B21019", new accountjv("Daniel Lagos", "docum10190") );
        car2.id = "101935"; //agrega valores a la clase Car a car2
        // car2.driver = "Daniel Lagos" ; como se coloca driver y license en el archivo carjv en el metodo estos valores ya son agregados en la linea 13
        // car2.license = "B21019";
        car2.passenger = 4;
        System.out.println("Car License" + Car2.license); //imprime lo que se encuentra en car2.license

        Uberx uberx = new uberx("AMQ123", new Account("Andres Herrera", "AND123"), "Chevrolet", "Sonic");
        uberx.setPassenger(4);
        uberx.printDataCar();

        Ubervan ubervan = new ubervan("FGH345", new Account("Andres Herrera", "AND123"));
        ubervan.setPassenger(6);
        ubervan.printDataCar();

    }
}