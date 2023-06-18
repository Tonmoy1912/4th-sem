'''
15. Make a list of the largest or smallest N items in a collection.
'''

import heapq

numbers = [9, 4, 2, 7, 5, 1, 8, 3, 6]

# Get the three largest numbers
largest = heapq.nlargest(3, numbers)
print("Largest numbers list:", largest)  # Output: [9, 8, 7]

# Get the two smallest numbers
smallest = heapq.nsmallest(2, numbers)
print("Smallest numbers list:", smallest)  # Output: [1, 2]
