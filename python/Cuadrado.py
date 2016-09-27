lista = [1,2,3,4,5,6,7,8,9,10]

def factorial (n):
    if n < len(lista):
        print (lista[n])**2
        factorial (n+1)
    
    
factorial(0)
