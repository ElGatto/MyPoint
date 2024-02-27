public class MyPointTest {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10, 30.5);
        System.out.println("Distance between the two points is: " + p1.distance(p2));

        // Testing isPolygon method
        MyPoint[] points1 = {
                new MyPoint(1, 1),
                new MyPoint(2, 2),
                new MyPoint(1, 1)
        };
        MyPoint[] points2 = {
                new MyPoint(1, 1),
                new MyPoint(2, 2)
        };
        System.out.println("points1 forms a polygon: " + isPolygon(points1));
        System.out.println("points2 forms a polygon: " + isPolygon(points2));
    }

    public static boolean isPolygon(MyPoint[] points) {
        if (points == null || points.length < 3) {
            return false;  // A polygon should have at least 3 points
        }

        MyPoint firstPoint = points[0];
        MyPoint lastPoint = points[points.length - 1];

        return firstPoint.getX() == lastPoint.getX() && firstPoint.getY() == lastPoint.getY();
    }
}