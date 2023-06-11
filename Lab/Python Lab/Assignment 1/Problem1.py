'''
Write a prime generator program using only primes and using python loops.
'''

import math

def isPrime(n):
    if(n<=1):
        return False
    l=math.sqrt(n)
    l=int(l)
    for i in range(2,l+1,1):
        if(n%i==0):
            return False
    return True


def getPrime(a,b):
    # count=0
    i=a
    while(i<=b):
        if(isPrime(i)):
            print(i,end=" ")
            # count+=1
        i+=1

a=int(input("Enter the  lower limit: "))
b=int(input("Enter the  upper limit: "))

getPrime(a,b)

