'''
12. Create a BankAccount class. Your class should support these methods: deposit, 
withdraw, get_balance, change_pin. Create one SavingsAccount class that behaves just like 
a BankAccount class, but also has an interest rate and a method that increases the balance by 
the appropriate amount of interest. Create another FeeSavingsAccount class that behaves 
just like a SavingsAccount, but also charges a fee every time you withdraw money. The fee 
should be set in the constructor and deducted before each withdrawal.
'''

class BankAccount:
    def __init__(self, initial_balance=0, pin=0000):
        self.balance = initial_balance
        self.pin = pin

    def deposit(self, amount):
        self.balance += amount

    def withdraw(self, amount):
        if self.balance >= amount:
            self.balance -= amount
        else:
            print("Insufficient balance.")

    def get_balance(self):
        return self.balance

    def change_pin(self, new_pin):
        self.pin = new_pin


class SavingsAccount(BankAccount):
    def __init__(self, initial_balance=0, pin=0000, interest_rate=0):
        super().__init__(initial_balance, pin)
        self.interest_rate = interest_rate

    def calculate_interest(self):
        interest = self.balance * self.interest_rate
        self.balance += interest


class FeeSavingsAccount(SavingsAccount):
    def __init__(self, initial_balance=0, pin=0000, interest_rate=0, withdrawal_fee=0):
        super().__init__(initial_balance, pin, interest_rate)
        self.withdrawal_fee = withdrawal_fee

    def withdraw(self, amount):
        total_withdrawal = amount + self.withdrawal_fee
        super().withdraw(total_withdrawal)


# Test the classes
# BankAccount
account = BankAccount(1000, 1234)
account.deposit(500)
account.withdraw(200)
print("Bank Account Balance:", account.get_balance()) 

# SavingsAccount
savings_account = SavingsAccount(2000, 5678, 0.05)
savings_account.calculate_interest()
print("Savings Account Balance:", savings_account.get_balance())  

# FeeSavingsAccount
fee_savings_account = FeeSavingsAccount(3000, 9876, 0.03, 50)
fee_savings_account.withdraw(500)
print("Fee Savings Account Balance:", fee_savings_account.get_balance())  
