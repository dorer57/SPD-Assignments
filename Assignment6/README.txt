# Assignment 6 - Visitor Pattern (Shape Visitor)

Java project that uses the **Visitor** pattern. A list of shapes is visited by two visitors, and each visitor adds one operation without changing the shape classes.

## Roles

 Role                   Class 
 Element interface - Shape
 Concrete Elements - Circle, Square, Triangle
 Visitor interface - ShapeVisitor 
 Concrete Visitors  AreaCalculator, Export 
 Object Structure - List<Shape> in Main 
 Client - Main 

## How it works

"Main" goes over the list and calls "shape.accept(visitor)" on each shape. Each shape calls the matching method on the visitor and passes itself, for example `visitor.visitCircle(this)`. This is **double dispatch**: the code that runs depends on both the shape and the visitor, with no `instanceof` checks.

- "AreaCalculator" adds up the area of all shapes.
- "Export" writes every shape as XML text.

To add a new operation, create a new class that implements "ShapeVisitor". The shape classes do not change

## Run

```
Run the Main.java
```

Output:

```
Total area: 31.57
<circle><radius>2.0</radius></circle>
<square><side>3.0</side></square>
<triangle><base>4.0</base><height>5.0</height></triangle>
```