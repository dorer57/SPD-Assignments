public interface Shape {
    void accept(ShapeVisitor visitor);
}

// Все фигуры обязаны уметь принять посетителя