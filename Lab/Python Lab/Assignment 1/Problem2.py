'''
Write a discount coupon code using dictionary in Python with different rate coupons for each day of the week.
'''
coupons={
    "MON":0.15,
    "TUE":0.05,
    "WED":0.10,
    "THU":0.25,
    "FRI":0.30,
    "SAT":0.20,
    "SUN":0.25
}

def showDiscount(amount,couponCode):
    if couponCode in coupons:
        rate=coupons[couponCode]
        discount=rate*amount
        newPrice=amount-discount
        print("Price after applying discount coupon: "+str(newPrice))
    else:
        print("The discount code doesn't exist")

amount=float(input("Enter the amount : "))
couponCode=input("Enter the coupon code : ")
showDiscount(amount,couponCode)