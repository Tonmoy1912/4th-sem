'''
19. Use profile/cprofile to check pythogorian triples code in python. Think about time 
complexity of the code.
'''



def generate_pythagorean_triples(n):
    triples = []
    for a in range(1, n+1):
        for b in range(a, n+1):
            c = (a**2 + b**2) ** 0.5
            if c.is_integer():
                triples.append((a, b, int(c)))
    return triples

# Profile the code
arr=generate_pythagorean_triples(20)
print("The pythogorian triples for n=20 are:")
print(arr)
