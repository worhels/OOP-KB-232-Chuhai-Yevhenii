public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super("Коло", color);
        if (radius <= 0) {
            throw new IllegalArgumentException("Радіус має бути > 0");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void printInfo() {
        System.out.println("Фігура:    " + name);
        System.out.println("Колір:     " + color);
        System.out.println("Радіус:    " + radius);
        System.out.printf ("Площа:     %.2f%n", area());
        System.out.printf("Периметр:  %.2f%n", perimeter());
        System.out.println("----------------------------");
    }
}
