'''
8. Create a list of all the numbers up to N=50 which are multiples of five using anonymous 
function
'''

def createListOfFiveMultiple():
    arr=list()
    for i in range(1,51):
        if(i%5==0):
            arr.append(i)
    return arr


arr=createListOfFiveMultiple()
print(arr)