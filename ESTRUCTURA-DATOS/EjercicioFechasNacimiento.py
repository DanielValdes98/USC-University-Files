from datetime import date
from collections import Counter
from collections import defaultdict

print("\n" + "EJERCICIO EN CLASE (fechas de nacimiento)" + "\n")

ingresar = True
# Arrays para almacenar los nombres y las fechas de nacimiento de los estudiantes agregados
arrayNombres, arrayFechas = [], []
contador = 0 # Para contar el numero de estudiantes totales agregados
while ingresar:
    nuevoEstudiante = input("\n" + "Desea agregar un nuevo estudiante (s/n): ")
    if(nuevoEstudiante == 's'):
        nombre = input("Digite el nombre: ")
        programa = input("Digite programa: ")
        annioNacimiento = int(input("Digite el año de nacimiento (Ejemplo: 2023): "))
        mesNacimiento = int(input("Digite el mes de nacimiento (poner numero del mes. Ejemplo: 10 (oct)): "))
        diaNacimiento = int(input("Digite el día de nacimiento (poner numero del día. Ejemplo: 31): "))

        fecha = date(annioNacimiento, mesNacimiento, diaNacimiento)
        strDate = fecha.strftime('%d-%m-%Y')

        arrayNombres.append(nombre)
        arrayFechas.append(strDate)

        contador += 1

    elif(nuevoEstudiante == 'n'):
        print("Cantidad de estudiantes agregados: ", contador, "\n")
        ingresar = False
        break
    else:
        print("Ese comando no existe" + "\n")


# *****************         DATOS DE PRUEBA (PARA EVITAR DILIGENCIAR LOS CAMPOS VARIAS VECES)       *****************
# arrayNombres = ['Daniel', 'Jennifer', 'Pedro','Juena', 'Miguel', 'Diana','Juliana']
# arrayFechas = ['10-10-1998', '19-06-1999', '10-10-1998', '19-06-1999', '19-06-1992','19-06-1999', '11-01-2000']
# *******************************************************************************************************************

# Counter:  colección donde los elementos se almacenan como claves y sus recuentos son los valores (clave:valor)
contadorPorElemento = Counter(arrayFechas) #Counter({'DD1-MM1-YYYY1': #ocurrencias, 'DD2-MM2-YYYY2': #ocurrencias})

# Defaultdict: Proporciona un valor predeterminado para la clave que no existe. Devuelve un objeto similar a un dict
indicesPorElemento = defaultdict(list)
indices = []

# Enumerate(): agrega un contador a un iterable y lo devuelve en forma de objeto de enumeración
# elemento -> Fecha
#indice -> Posicion de la fecha en arrayFechas
for indice, elemento in enumerate(arrayFechas): # (iteracion fecha)
    if contadorPorElemento[elemento] > 1: # (#ocurrencias por cada fecha)
        indices.append(indice)  
        indicesPorElemento[elemento].append(indice) # {'DD1-MM1-YYYY1': [posicion1, posicion2], 'DD2-MM2-YYYY2': [posicion1,...,posicionN]})

# clave -> Fecha
# valor -> Posiciones
for clave, valor in indicesPorElemento.items():
    print('Estudiantes con la fecha de nacimiento del año %s: ' %clave)
    for v in valor:
        print(arrayNombres[v])
    print('\n')




