'''
11.Search for palindrome and unique words in a text using class method and string 
method.
'''

class TextAnalyzer:
    @classmethod
    def find_palindromes(cls,text):
        words = text.split()
        palindromes = []
        for word in words:
            if word == word[::-1]:
                palindromes.append(word)
        return palindromes
    @classmethod
    def find_unique_words(cls,text):
        words = text.split()
        unique_words = set(words)
        return unique_words

# Test the class methods
text = "level radar apple banana radar"


# Find palindromes
palindromes = TextAnalyzer.find_palindromes(text)
print("Palindromes:", palindromes)

# Find unique words
unique_words = TextAnalyzer.find_unique_words(text)
print("Unique Words:", unique_words)
