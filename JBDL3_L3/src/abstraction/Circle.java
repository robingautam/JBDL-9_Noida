package abstraction;

public class Circle extends Shape{
    @Override
    public double area() {
        int r = 2;
        return Math.PI*r*r;
    }
}
