import math

def calculate_values(d_values):
    C = 50
    H = 30
    results = []

    for D in d_values:
        Q = math.sqrt((2 * C * D) / H)
        results.append(int(Q))  # Convert to integer for whole number output

    print(",".join(map(str, results)))

# Main program
input_values = input("Enter D values separated by commas: ")
d_values = [int(x) for x in input_values.split(",")]

calculate_values(d_values)
