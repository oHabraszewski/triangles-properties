package tk.chaber.triangles_properties.Geometry;

public class Section {
    private Point   A,
                    B;

    public Section(Point pointA, Point pointB){
        this.A = pointA;
        this.B = pointB;
    }

    public Section(Point pointA, Angle angle, double length){
        double  cosine = Math.cos(angle.getRadians()),
                sine = Math.sin(angle.getRadians());

        double  deltaX = cosine * length,
                deltaY = sine * length;

        double  x2 = pointA.getX() + deltaX,
                y2 = pointA.getY() + deltaY;

        Point pointB = new Point(x2, y2);

        this.A = pointA;
        this.B = pointB;
    }

    public Section(int x1, int y1, int x2, int y2){
        Point pointA = new Point(x1, y1);
        Point pointB = new Point(x2, y2);
        this.A = pointA;
        this.B = pointB;
    }

    public Point getA() {
        return A;
    }

    public void setA(Point a) {
        A = a;
    }

    public Point getB() {
        return B;
    }

    public void setB(Point b) {
        B = b;
    }
}
