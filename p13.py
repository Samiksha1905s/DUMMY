import math

# Base class for Shape
class Shape:
    def area(self):
        raise NotImplementedError("Subclass must implement abstract method")

    def perimeter(self):
        raise NotImplementedError("Subclass must implement abstract method")

# Subclass for Circle
class Circle(Shape):
    def __init__(self, radius):
        self.radius = radius

    def area(self):
        return math.pi * self.radius ** 2

    def perimeter(self):
        return 2 * math.pi * self.radius

# Subclass for Triangle
class Triangle(Shape):
    def __init__(self, side1, side2, side3):
        self.side1 = side1
        self.side2 = side2
        self.side3 = side3

    def area(self):
        # Using Heron's formula to calculate the area
        s = (self.side1 + self.side2 + self.side3) / 2  # Semi-perimeter
        return math.sqrt(s * (s - self.side1) * (s - self.side2) * (s - self.side3))

    def perimeter(self):
        return self.side1 + self.side2 + self.side3

# Subclass for Square
class Square(Shape):
    def __init__(self, side):
        self.side = side

    def area(self):
        return self.side ** 2

    def perimeter(self):
        return 4 * self.side

# Main program to test the classes
if __name__ == "__main__":
    # Create instances of each shape with appropriate parameters
    circle = Circle(5)
    triangle = Triangle(3, 4, 5)
    square = Square(4)

    # Print the area and perimeter of each shape
    print("Circle: Area = {:.2f}, Perimeter = {:.2f}".format(circle.area(), circle.perimeter()))
    print("Triangle: Area = {:.2f}, Perimeter = {:.2f}".format(triangle.area(), triangle.perimeter()))
    print("Square: Area = {:.2f}, Perimeter = {:.2f}".format(square.area(), square.perimeter()))
