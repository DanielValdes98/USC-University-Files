# Función para leer un archivo
def leerCodigoArchivo(filename):
    file = open(filename, "r")
    codigo = []
    while True:
        char = file.read(1)
        if not char:
            break
        codigo.append(char)
    return codigo

codigo = leerCodigoArchivo("Pilas/codigo.txt")
# print(codigo)

pila = [] # Pila vacía
pilaIncompleta = []
caracteresApertura = ['{', '[', '(']
caracteresCierre = ['}', ']', ')']

# Función para apilar elementos
def apilar(p, c):
    p.append(c)

# Función para desapilar elementos
def desapilar(p):
    try:
        return p.pop()
    except IndexError:
        raise ValueError("La pila está vacía")

# Verifica si la pila está vacía 
def pilaVacia(p):
    if p == []:
        return print("\n Pila vacía, ejecución perfecta")
    return print(f"\n Error en {p}. Elementos por cerrar: {len(p)}")

""" Cambia los caracteres de cierre por su correspondiente caracter de apertura.
    Así se puede verificar si el caracter de cierre siguiente es igual al último
    caracter de la pila, si es así, se elimina de la pila ese último caracter
"""
def cambioCaracteres(c):
    if c == ')': c = '('
    if c == ']': c = '['
    if c == '}': c = '{'
    return c

for caracter in codigo:
    if caracter in caracteresApertura:
        apilar(pila, caracter) # Apilar
    elif caracter in caracteresCierre and len(pila) > 0:
        new = cambioCaracteres(caracter)
        top = pila[-1]
        print(pila, "Pila (Actual)")
        print(new, "new : Caracter de cierre transformado")
        print(top, "top : Tope de pila")

        if top == new:
            desapilar(pila)     
        else:
            apilar(pila, new) 

        print(pila, "Pila (Después del pop)")

    elif caracter in caracteresCierre:
        new = cambioCaracteres(caracter)
        apilar(pila, new)
        
pilaVacia(pila) # Llamado a la función que verifica si la pila está vacía o si tien algun error  





