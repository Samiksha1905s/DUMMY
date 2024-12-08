import math

# Function to find the roots of the quadratic equation
def find_quadratic_roots(a, b, c):
    # Calculate the discriminant
    discriminant = b**2 - 4*a*c
    
    # Check if discriminant is positive, zero, or negative
    if discriminant > 0:
        root1 = (-b + math.sqrt(discriminant)) / (2 * a)
        root2 = (-b - math.sqrt(discriminant)) / (2 * a)
        return f"Two real and distinct roots: {root1:.2f} and {root2:.2f}"
    elif discriminant == 0:
        root = -b / (2 * a)
        return f"One real root: {root:.2f}"
    else:
        real_part = -b / (2 * a)
        imaginary_part = math.sqrt(-discriminant) / (2 * a)
        return f"Two complex roots: {real_part:.2f} + {imaginary_part:.2f}i and {real_part:.2f} - {imaginary_part:.2f}i"

# Input coefficients from the user
a = float(input("Enter the coefficient a: "))
b = float(input("Enter the coefficient b: "))
c = float(input("Enter the coefficient c: "))

# Check if a is zero to avoid division by zero
if a == 0:
    print("This is not a quadratic equation.")
else:
    # Find and print the roots
    result = find_quadratic_roots(a, b, c)
    print(result)
