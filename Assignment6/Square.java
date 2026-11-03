public class Square implements Shape {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void accept(ShapeVisitor visitor) {
        visitor.visitSquare(this);
    }
}