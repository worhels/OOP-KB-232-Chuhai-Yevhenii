public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super("Прямокутник", color);
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Сторони мають бути > 0");
        }
        this.width  = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public void printInfo() {
        System.out.println("Фігура:    " + name);
        System.out.println("Колір:     " + color);
        System.out.println("Ширина:    " + width);
        System.out.println("Висота:    " + height);
        System.out.printf ("Площа:     %.2f%n", area());
        System.out.printf ("Периметр:  %.2f%n", perimeter());
        System.out.println("----------------------------");
    }
}
