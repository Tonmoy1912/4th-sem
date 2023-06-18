'''
Write first seven Fibinacci numbers using generator next function/ yield in python. Trace and memorize the function. Also check whether a user given number is FIbinacci or not. 
'''

#-------------usint loop------------
# arr =list(range(0,7))

# arr[0]=0
# arr[1]=1
# for i in range(2,7):
#     arr[i]=arr[i-1]+arr[i-2]

# print("The first 7 fibonacci numbers are:")
# print(arr)

#-----------------using generator-----------------
def fibo(n):
    a=0
    b=1
    yield a
    yield b
    count=0
    while(count<n):
        a,b=b,a+b
        yield b


nextFibo=fibo(7)
print("First 7 fibonacci numbers are:")
for i in range(7):
    print(next(nextFibo),end=" ")

