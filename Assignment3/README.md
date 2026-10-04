# Assignment 3

This project is a simple example of the Bridge design pattern in Java.

The idea: a shape (circle or square) is separated from the way it is drawn
(VectorRenderer, RasterRenderer). A shape just holds a Renderer and asks
it to draw - it doesn't matter which renderer it is, and the renderer can be
changed at any time.

## Files

-Renderer.java - interface with the drawing methods every renderer must have
- VectorRenderer.java, RasterRenderer.java - two different ways to "draw"
- Shape.java - base class for all shapes, holds a Renderer
- Circle.java, Square.java - actual shapes
- Main.java - runs everything and shows the renderer being switched at runtime

## How to run

Run the main.java

This will print how a circle and a square get drawn, and show the same
circle being drawn first with "VectorRenderer", then with "RasterRenderer",
without recreating the object.
