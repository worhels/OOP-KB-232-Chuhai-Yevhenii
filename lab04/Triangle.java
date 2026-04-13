public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c) {
        super("Трикутник", color);
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Некоректний трикутник");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Некоректний трикутник");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        // Формула Герона
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public void printInfo() {
        System.out.println("Фігура:    " + name);
        System.out.println("Колір:     " + color);
        System.out.println("Сторони:   a=" + a + ", b=" + b + ", c=" + c);
        System.out.printf ("Площа:     %.2f%n", area());
        System.out.printf ("Периметр:  %.2f%n", perimeter());
        System.out.println("----------------------------");
    }
}
