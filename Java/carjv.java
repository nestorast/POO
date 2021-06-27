class carjv  //clase 
{
    
    private Integer id; //variable tipo entero, variable de tipo global
    private String license;//variable tipo caracter, variable de tipo global
    private Accountjv driver;
    // String driver; Se cambia la variable driver porque es una variable de la clase account y account es mamá de car 
    private Integer passenger;



    public carjv (String license, Accountjv driver)  //metodo constructor... public +nombre de la clase (los parametros que sean obligatorios para que se cree un objeto de tipo car) estan siendo declarados como variables locales 
    { //estoy llamando la variable license y le voy a asignar license para ello se utiliza this
        this.license = license;
        this.driver = driver;
    
    }
    void printDataCar () //declando un metodo para traer los datos ingresados en main 
    {
        if (passenger != null)
        {
            System.out.println("License: " + license + "Driver: " + driver.name + "Passenger:" + passenger);
        }
    }
        public Integer getPassenger()
        {
            return passenger;
        }
        public void setPassenger(Integer passenger)
        {
            if(passenger == 4)
            {
                this.passegenger = passenger;
            }
            else
            {
                System.out.println("Necesitas asignar 4 pasajeros");
            }
        }
        /**
        * @return the id
        */
        public Integer getId() 
        {
            return id;
        }
        /**
        * @param id the id to set
        */
        public void setId(Integer id) 
        {
            this.id = id;
        }
        /**
         * @return the license
        */
        public String getLicense() 
        {
            return license;
        }

        /**
        * @param license the license to set
        */
        public void setLicense(String license) 
        {
            this.license = license;
        }

        /**
        * @return the driver
        */
        public Account getDriver()  
        {
            return driver;
        }

        /**
        * @param driver the driver to set
        */
        public void setDriver(Account driver) 
        {
            this.driver = driver;
        }
    
}