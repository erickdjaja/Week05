public class RightTriangle extends Shape {
    private double base;   // alas
    private double height; // tinggi

    public RightTriangle() {}
    public RightTriangle(double base, double height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double getBase()   { return base; }
    public double getHeight() { return height; }

    private double hypotenuse() { return Math.hypot(base, height); }

    @Override
    public double getArea() { return 0.5 * base * height; }

    @Override
    public double getPerimeter() { return base + height + hypotenuse(); }
}
