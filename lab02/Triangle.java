public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        return Math.abs(
                (a.getX() * (b.getY() - c.getY()) +
                        b.getX() * (c.getY() - a.getY()) +
                        c.getX() * (a.getY() - b.getY())) / 2.0
        );
    }

    public Point centroid() {
        double x = (a.getX() + b.getX() + c.getX()) / 3.0;
        double y = (a.getY() + b.getY() + c.getY()) / 3.0;
        return new Point(x, y);
    }
}