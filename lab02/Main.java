public class Main {
    public static void main(String[] args) {
        Segment s1 = new Segment(new Point(0, 0), new Point(4, 4));
        Segment s2 = new Segment(new Point(0, 4), new Point(4, 0));

        System.out.println("Довжина: " + s1.length());
        System.out.println("Середина: " + s1.middle());
        System.out.println("Точка перетину: " + s1.intersection(s2));
    }
}