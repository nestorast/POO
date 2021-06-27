class Accountp: ##nombre de la clase
    id = int     ##variable tipo entero
    name = str  ##variable tipo caracter
    document = str 
    email = str
    password = str

    def __init__(self, name, document): ##definiendo un metodo  que tiene la palabra magica init  y la palabra selft que es como el this de java 
        self.name = name ##le esta dando nombre a la variable de esta clase name con el self.name de una que viene de afuere llamada name
        self.document = document