class uberx extends Car // extends Car es la forma como se expresa la herencia en java
//para ejecutar esta fraccion se debe crear un constructor 
//extends es la palabra reservada para herencia en java
{
    String brand;
    String model;

    public uberx (String license, Accountjv driver, String brand, String model) //un metodo constructor esta recibiendo como parametro dos datos 
    {
        super (license, driver); // llamar al metodo constructor de la clase car carjv (String license, Accountjv driver) 
        //super hara referencia a los metodos y atributos de la clase padre car
        this.brand = brand;
        this.model = model;
    }
    @Override //que es esto
    void printDataCar() 
    {
        super.printDataCar();
        System.out.println("Modelo: " + model + " Brand: " + brand);
    }

}