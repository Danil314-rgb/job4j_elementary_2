package oop;

public class Triangle {

    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double semiPerimeter(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public boolean exists(double ab, double ac, double bc) {
        if (ab + ac > bc || ab + bc > ac || ac + bc > ab) {
            return true;
        }
        return false;
    }

    public double area() {
        double result = -1;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        if (this.exists(ab, ac, bc)) {
            double p = semiPerimeter(ab, ac, bc);
            result = Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
        }
        return result;
    }
}
