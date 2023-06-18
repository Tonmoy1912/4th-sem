'''
10. Write a code which yields all terms of the geometric progression a, aq, aq2
 , aq
3
 , ....
When the progression produces a term that is greater than 100,000, the generator stops (with 
a return statement). Compute total time and time within the loop.
'''

import time

def geoProgession(a,r):
    term =a
    yield a
    term*=r
    while term<=100000:
        yield term
        term*=r
    

a=input("Enter the value of a: ")
r=input("Enter the value of r: ")
it=geoProgession(int(a),int(r))

start_time=time.time()
for i in it:
    print(i)

end_time=time.time()
total_time=end_time-start_time
print("Total time in second ",total_time)
