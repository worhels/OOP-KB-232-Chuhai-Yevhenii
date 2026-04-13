public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(
                new Point(0, 0),
                new Point(6, 0),
                new Point(0, 6)
        );

        System.out.println("Площа: " + triangle.area());
        System.out.println("Центроїд: " + triangle.centroid());
    }
}