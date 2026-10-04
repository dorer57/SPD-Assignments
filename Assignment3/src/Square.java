public class Square extends Shape {
    private double side;

    public Square(Renderer renderer, double side) {
        super(renderer);
        this.side = side;
    }

    public void draw() {
        renderer.drawSquare(side);
    }

    public void resize(double factor) {
        side = side * factor;
    }
}