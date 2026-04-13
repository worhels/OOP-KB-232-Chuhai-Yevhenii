public abstract class Figure implements Printable {
    protected String name;
    protected String color;

    public Figure(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // Абстрактні методи — кожна фігура реалізує сама
    public abstract double area();
    public abstract double perimeter();

    public String getName()  { return name; }
    public String getColor() { return color; }
}
