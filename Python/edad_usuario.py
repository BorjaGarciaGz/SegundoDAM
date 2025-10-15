from datetime import date

print ("Hola Python")

print ("¿Como te llamas?")
nombre = input()

edad = int(input("¿Que edad tienes?"))

print (f"Me llamo {nombre} y tengo {edad} años" )

anio = date.today().year - edad

print (f"Naciste el año {anio}")

