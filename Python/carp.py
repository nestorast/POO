from accountp import Accountp ## from nombre del archivo import nombre de la clase   
class Carp: ##nombre de la clase
    id = int     ##variable tipo entero
    license = str  ##variable tipo caracter
    driver = Accountp ("","") ##se esta creando una variable de driver que recibe datos de account
    ## driver = str 
    passenger = int

    def __init__(self, license, driver):
        self.license = license
        self.driver = driver