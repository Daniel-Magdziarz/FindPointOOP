/*This is a simple case of Object Oriented Programing (OOP) where two points are created.
Two constructors are used. The distance method in Point.java can receive no points, points,
or an instance of a point.*/
//Author: Daniel Magdziarz

public class Main {

    public static void main(String[] args) {

        Point point1 = new Point(6, 5);
        Point point2 = new Point(3, 1);

        System.out.println("Point 1 distance from Point (0, 0) = " + point1.distance());

        System.out.println("Point 1 distance from Point 2 = " + point1.distance(point2));

        System.out.println("Point 1 distance from Point (2,2) = " + point1.distance(2, 2));

        Point point = new Point();
        System.out.println("Point (0, 0) distance from Point (0, 0) = " + point.distance());

    }
}
