public class RasterRenderer implements Renderer {

    public void drawCircle(double radius) {
        System.out.println("Drawing a circle as pixels, radius = " + radius);
    }

    public void drawSquare(double side) {
        System.out.println("Drawing a square as pixels, side = " + side);
    }

    public void drawTriangle(double angle) {
        System.out.println("Drawing a triangle as pixels, angle = " + angle);
    }
}