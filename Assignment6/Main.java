import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = List.of(new Circle(2), new Square(3), new Triangle(4, 5));

        AreaCalculator areaVisitor = new AreaCalculator();
        visitAll(shapes, areaVisitor);
        System.out.printf("Total area: %.2f%n", areaVisitor.getTotalArea());

        Export exportVisitor = new Export();
        visitAll(shapes, exportVisitor);
        System.out.println(exportVisitor.getResult());
    }

    private static void visitAll(List<Shape> shapes, ShapeVisitor visitor) {
        for (Shape shape : shapes) {
            shape.accept(visitor);
        }
    }
}