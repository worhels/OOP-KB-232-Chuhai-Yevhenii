public class Main {
    public static void main(String[] args) {

        // Масив типу Figure — демонстрація поліморфізму
        Figure[] figures = {
            new Circle("Червоний", 5),
            new Rectangle("Синій", 4, 7),
            new Triangle("Зелений", 3, 4, 5)
        };

        System.out.println("============================");
        System.out.println("   ГЕОМЕТРИЧНІ ФІГУРИ");
        System.out.println("============================");

        for (Figure f : figures) {
            f.printInfo(); // виклик через інтерфейс Printable
        }

        // Окремо — пошук фігури з найбільшою площею
        Figure largest = figures[0];
        for (Figure f : figures) {
            if (f.area() > largest.area()) {
                largest = f;
            }
        }

        System.out.println("Найбільша площа: " + largest.getName());
        System.out.printf("Площа: %.2f%n", largest.area());
    }
}
