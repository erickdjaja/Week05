public class Square extends Shape {
    private double side;

    public Square() {}
    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    public double getSide() { return side; }

    @Override
    public double getArea() { return side * side; }

    @Override
    public double getPerimeter() { return 4 * side; }
}
