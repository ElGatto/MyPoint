public class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
        this(0, 0);
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint(MyPoint other) {
        this.x = other.getX();
        this.y = other.getY();
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(MyPoint another) {
        double dx = this.x - another.getX();
        double dy = this.y - another.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double distance(double x, double y) {
        double dx = this.x - x;
        double dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static boolean isPolygon(MyPoint[] points) {
        if (points.length < 3) {
            return false; // Not enough points to form a polygon.
        }

        MyPoint firstPoint = points[0];
        MyPoint lastPoint = points[points.length - 1];

        return firstPoint.distance(lastPoint) == 0;
    }
}