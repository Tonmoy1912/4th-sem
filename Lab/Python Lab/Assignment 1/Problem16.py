'''
16. Create a dictionary that maps stock names to prices, which will keep insertion 
order.Find minimum price, maximum price and sort items according to their prices in first 
dictionary. Create another second stock dictionary. Find items that are only in first dictionary 
and find items whose prices do not match. Remove duplicate items from first dictionary. 
Sort both dictionaries for incrementing prices. Group items in first dictionary by price in 
multiple of 500. Find an item with price=800 from both dictionaries.
'''

from collections import OrderedDict

# Create the first stock dictionary with insertion order
stock_dict_1 = OrderedDict()
stock_dict_1['AAPL'] = 150
stock_dict_1['GOOG'] = 2500
stock_dict_1['TSLA'] = 700
stock_dict_1['AMZN'] = 3500
stock_dict_1['MSFT'] = 300

# Find the minimum and maximum prices in the first dictionary
min_price = min(stock_dict_1.values())
max_price = max(stock_dict_1.values())
print("Minimum price:", min_price)  # Output: 150
print("Maximum price:", max_price)  # Output: 3500

# Sort the items in the first dictionary based on their prices
sorted_dict_1 = OrderedDict(sorted(stock_dict_1.items(), key=lambda x: x[1]))
print("Sorted items based on prices:")
for stock, price in sorted_dict_1.items():
    print(stock, "-", price)

# Create the second stock dictionary
stock_dict_2 = {'AAPL': 150, 'TSLA': 800, 'GOOG': 2500, 'AMZN': 3500}

# Find items that are only in the first dictionary
only_in_dict_1 = set(stock_dict_1.keys()) - set(stock_dict_2.keys())
print("Items only in the first dictionary:", only_in_dict_1)  # Output: {'MSFT'}

# Find items whose prices do not match in both dictionaries
price_mismatch = [(stock, stock_dict_1[stock], stock_dict_2[stock]) for stock in stock_dict_1 if stock_dict_1[stock] != stock_dict_2.get(stock)]
print("Items with price mismatch:", price_mismatch)  # Output: [('TSLA', 700, 800)]

# Remove duplicate items from the first dictionary
unique_dict_1 = OrderedDict.fromkeys(stock_dict_1)
print("Unique items in the first dictionary:", list(unique_dict_1.keys()))  # Output: ['AAPL', 'GOOG', 'TSLA', 'AMZN', 'MSFT']

# Sort both dictionaries by incrementing prices
sorted_dict_1 = OrderedDict(sorted(stock_dict_1.items(), key=lambda x: x[1]))
sorted_dict_2 = OrderedDict(sorted(stock_dict_2.items(), key=lambda x: x[1]))

# Group items in the first dictionary by price in multiples of 500
grouped_dict_1 = {}
for stock, price in sorted_dict_1.items():
    group = (price // 500) * 500
    if group not in grouped_dict_1:
        grouped_dict_1[group] = []
    grouped_dict_1[group].append(stock)
print("Grouped items in the first dictionary:")
for group, items in grouped_dict_1.items():
    print(group, "-", items)

# Find an item with price = 800 in both dictionaries
item_price_800_dict_1 = [stock for stock, price in sorted_dict_1.items() if price == 800]
item_price_800_dict_2 = [stock for stock, price in sorted_dict_2.items() if price == 800]
print("Item with price 800 in the first dictionary:", item_price_800_dict_1)  # Output: ['TSLA']
print("Item with price 800 in the second dictionary:", item_price_800_dict_2)  # Output: ['TSLA']
