package tk.chaber.triangles_properties.Geometry;

public class Angle {
    private double radians;
    private double degrees;

    public Angle(double degrees){
        this.degrees = degrees;
        this.radians = degrees * Math.PI/180;
    }

    public double getRadians() {
        return radians;
    }

    public double getDegrees() {
        return degrees;
    }
}
