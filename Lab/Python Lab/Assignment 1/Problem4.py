'''
5. Write first seven Fibinacci numbers using generator next function/ yield in python. Trace 
and memorize the function. Also check whether a user given number is Fibinacci or not.
'''

def validate_phone_number(phone_number):
    if(len(phone_number) == 10) :
        if(phone_number.isnumeric()):
            return True
        else:
            return False
    else :
        return False

phone_number = input("Enter a phone number : ")

if validate_phone_number(phone_number):
    print("Valid phone number")
else:
    print("Invalid phone number")