# Function to generate a dictionary with (i, i*i) for i from 1 to n
def generate_square_dict(n):
    square_dict = {i: i*i for i in range(1, n + 1)}
    return square_dict

# Input from the user
n = int(input("Enter an integer number n: "))

# Generate the dictionary and print it
square_dictionary = generate_square_dict(n)
print("Generated dictionary:", square_dictionary)
