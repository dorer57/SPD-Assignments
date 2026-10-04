public class Circle extends Shape {
    private double radius;

    public Circle(Renderer renderer, double radius) {
        super(renderer);
        this.radius = radius;
    }

    public void draw() {
        renderer.drawCircle(radius);
    }

    public void resize(double factor) {
        radius = radius * factor;
    }
}