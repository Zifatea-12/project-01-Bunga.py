import turtle

# Setup the turtle
t = turtle.Turtle()
t.speed(10)
turtle.bgcolor("white")

# Function to draw a petal
def draw_petal():
    t.color("red")
    t.begin_fill()
    t.circle(100, 60)  # Draw a semicircle with a 100-unit radius
    t.left(120)
    t.circle(100, 60)
    t.left(120)
    t.end_fill()

# Draw flower with 6 petals
for _ in range(6):
    draw_petal()
    t.right(60)

# Draw the stem
t.color("green")
t.right(90)
t.forward(250)

# Draw a leaf
t.right(45)
t.begin_fill()
t.circle(50, 90)
t.left(90)
t.circle(50, 90)
t.end_fill()

# Hide the turtle and display the window
t.hideturtle()
turtle.done()
