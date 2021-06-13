package tk.chaber.triangles_properties.Geometry;

public class Section {
    private Point   A,
                    B;
    //private Straight straight;

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

    public Point getA() {
        return A;
    }

    public Point getB() {
        return B;
    }
}
