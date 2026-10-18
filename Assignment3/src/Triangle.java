public class Triangle extends Shape {
    private double angle;

    public Triangle(Renderer renderer, double angles) {
        super(renderer);
        this.angle = angles;
    }

    public void draw() {
        renderer.drawTriangle(angle);
    }

    public void resize(double factor) {
        angle = angle * factor;
    }
}