package tk.chaber.triangles_properties.Geometry;

public class Angle {
    private double radians;

    public Angle(int degrees){
        this.radians = degrees * Math.PI/180;
    }

    public Angle(double radians){
        this.radians = radians;
    }

    public double getRadians() {
        return radians;
    }
}
