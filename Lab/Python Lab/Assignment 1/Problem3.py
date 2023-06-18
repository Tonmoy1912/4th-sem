'''
3. Print first 10 odd and even numbers using iterators and compress. You can use duck typing
'''



#------------------using while loop----------------------
# print("First 10 odd number:")
# count=0
# i=1
# while(count<10):
#     print(i,end=' ')
#     count+=1
#     i+=2

# print()
# print("First 10 even number:")
# count=0
# i=2
# while(count<10):
#     print(i,end=' ')
#     count+=1
#     i+=2


#----------------using iterator and duck typing

class TopTenEvenOdd:
    def __init__(self):
        self.val=1
    
    def __iter__(self):
        return  self

    def __next__(self):
        num=self.val
        self.val+=1
        return num
    
def topEven(it,n):
    arr=list()
    count=0
    for i in it:#internally use next 
        if(i%2==0):
            arr.append(i)
            count+=1
        if(count>=n):
            break
    return arr

def topOdd(it,n):
    arr=list()
    count=0
    for i in it:#internally use next 
        if(i%2==1):
            arr.append(i)
            count+=1
        if(count>=n):
            break
    return arr


# var=TopTenEvenOdd()
# var=iter(var)
# print(next(var))

print("Top 10 even numbers")
print(topEven(TopTenEvenOdd(),10))
print("Top 10 odd numbers")
print(topOdd(TopTenEvenOdd(),10))