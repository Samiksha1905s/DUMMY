# Input tuples from the user
data = []
print("Enter tuples (name, age, height) separated by commas. Type 'done' to finish.")

while True:
    line = input("Enter a tuple: ")
    if line.lower() == "done":
        break
    name, age, height = line.split(",")
    data.append((name.strip(), int(age.strip()), int(height.strip())))

# Sort the tuples by name, then age, then height
data.sort(key=lambda x: (x[0], x[1], x[2]))

# Print the sorted list
print("\nSorted Tuples:")
print(data)
