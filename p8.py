# Function to count the number of words in a text file
def count_words_in_file(filename):
    try:
        with open(filename, 'r') as file:
            content = file.read()
            # Split the content by any whitespace and count the words
            words = content.split()
            return len(words)
    except FileNotFoundError:
        print("The file does not exist.")
        return None

# Input from the user for the filename
filename = input("Enter the name of the text file (with extension): ")

# Count the words and print the result
word_count = count_words_in_file(filename)
if word_count is not None:
    print(f"The number of words in the file '{filename}' is: {word_count}")
