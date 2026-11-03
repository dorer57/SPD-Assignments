public class AreaCalculator implements ShapeVisitor {
    private double totalArea = 0;

    public void visitCircle(Circle circle) {
        totalArea += Math.PI * circle.getRadius() * circle.getRadius();
    }

    public void visitSquare(Square square) {
        totalArea += square.getSide() * square.getSide();
    }

    public void visitTriangle(Triangle triangle) {
        totalArea += triangle.getBase() * triangle.getHeight() / 2;
    }

    public double getTotalArea() {
        return totalArea;
    }
}