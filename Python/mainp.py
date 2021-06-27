from carp import Carp ## from nombre del archivo import nombre de la clase   
from accountp import Accountp

if __name__ == "__main__":
    print ("Hola mundo")
    
    car = Carp("A11032", Accountp ("Nestor Lagos", "docum103239" ) ) ## iguala o crea un espacio llamado car de la clase carp
    car.license = "A11032"
    car.driver = "Nestor Lagos"
    print(vars(car)) ## imprime lo que hay en car
    print(vars(car.driver)) ## imprime lo que hay en car

    car2 = Carp() ## iguala o crea un espacio llamado car de la clase carp
    car2.license = "B1935"
    car2.driver = "Daniel Lagos"
    print(vars(car2)) ## imprime lo que hay en car