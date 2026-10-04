public class Main {
    public static void main(String[] args) {
        Renderer vector = new VectorRenderer();
        Renderer raster = new RasterRenderer();

        Shape circle = new Circle(vector, 5);
        circle.draw();

        circle.setRenderer(raster);
        circle.draw();

        Shape square = new Square(raster, 10);
        square.draw();

        circle.resize(2);
        circle.draw();
    }
}