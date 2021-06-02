package tk.chaber.triangles_properties.Geometry;

public class Straight {
    private double  slope,
                    intercept;

    public Straight(double m, double b){
        this.slope = m;
        this.intercept = b;
    }

    public Straight(Point pointOnStraight, Angle angle){
        double  x = pointOnStraight.getX(),
                y = pointOnStraight.getY();

        double  m = Math.tan(angle.getRadians()),
                b = y - (x * m);
        this.slope = m;
        this.intercept = b;
    }

    public double f(double x){
        return slope * x + intercept;
    }

    public Point findIntersection(Straight straight2){
        double  m1 = this.getSlope(),
                m2 = straight2.getSlope();

        double  b1 = this.getIntercept(),
                b2 = straight2.getIntercept();

        double  x = (b2 - b1)/(m1 - m2),
                y = this.f(x);

        return new Point(x,y);
    }

    public double getSlope() {
        return slope;
    }

    public double getIntercept() {
        return intercept;
    }
}
