str="hi i am girl. i love to dance i sing i play and dance and sing"
print(str.count("sing"))

# Function to calculate word frequency
def word_frequency(sentence):
    words = sentence.split()  # Split the sentence into words
    frequency = {}  # Dictionary to store word counts

    for word in words:
        word = word.lower()  # Convert to lowercase for case-insensitive comparison
        frequency[word] = frequency.get(word, 0) + 1

    return frequency

# Main program
sentence = input("Enter a sentence: ")
freq = word_frequency(sentence)

# Print the frequency of each word
print("\nWord Frequency:")
for word, count in freq.items():
    print(f"{word}: {count}")
