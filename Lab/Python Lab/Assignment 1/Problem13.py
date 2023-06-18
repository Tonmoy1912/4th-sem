'''
13.Write an operator overloading for len which shows string length for any given string 
and return only length of repetitive words with the text if the text has some repetitive parts. 
Determine the most frequently occurring words using most_common.
'''

from collections import Counter

class TextAnalyzer:
    def __init__(self, text):
        self.text = text

    def __len__(self):
        return len(self.text)

    def repetitive_words_length(self):
        words = self.text.split()
        word_counts = Counter(words)
        repetitive_words = [word for word, count in word_counts.items() if count > 1]
        repetitive_words_length = sum(len(word) for word in repetitive_words)
        return repetitive_words_length

    def most_frequent_words(self, num_words):
        words = self.text.split()
        word_counts = Counter(words)
        most_common_words = word_counts.most_common(num_words)
        return most_common_words


# Test the class
text = "apple banana apple cat dog cat apple"
analyzer = TextAnalyzer(text)

# Overloaded len operator
length = len(analyzer)
print("Length of the text:", length)

# Length of repetitive words
repetitive_length = analyzer.repetitive_words_length()
print("Length of repetitive words:", repetitive_length)

# Most frequently occurring words
most_common_words = analyzer.most_frequent_words(1)
print("Most common words:", most_common_words)
