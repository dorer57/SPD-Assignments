public class Export implements ShapeVisitor {
    private final StringBuilder result = new StringBuilder();

    public void visitCircle(Circle circle) {
        result.append("<circle><radius>" + circle.getRadius() + "</radius></circle>\n");
    }

    public void visitSquare(Square square) {
        result.append("<square><side>" + square.getSide() + "</side></square>\n");
    }

    public void visitTriangle(Triangle triangle) {
        result.append("<triangle><base>" + triangle.getBase() + "</base><height>" + triangle.getHeight() + "</height></triangle>\n");
    }

    public String getResult() {
        return result.toString();
    }
}