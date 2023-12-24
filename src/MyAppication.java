import java.util.ArrayList;

public class MyAppication {
    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<>();
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 1);
        Point p3 = new Point(2, 0);
        Point p4 = new Point(3, 2);
        Point p5 = new Point(4, 1);
        Point p6 = new Point(5, 3);
        Point p7 = new Point(6, 2);
        Point p8 = new Point(7, 4);
        Point p9 = new Point(8, 3);
        Point p10 = new Point(9, 5);
        points.add(p1);
        points.add(p2);
        points.add(p3);
        points.add(p4);
        points.add(p5);
        points.add(p6);
        points.add(p7);
        points.add(p8);
        points.add(p9);
        points.add(p10);
        Shape shape = new Shape(points);
        for (Point p : points) {
            System.out.println(p.toString());
        }
        System.out.println("perimeter: " + shape.perimeter());
        System.out.println("longest: " + shape.longestSide());
        System.out.println("average: " + shape.averageSide());

    }
}