package tk.chaber.triangles_properties.Geometry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AngleTests{
    @Test
    public void getDegreesFrom93() {
        Angle angle = new Angle(93);
        assertEquals(93, angle.getDegrees(), 0.00001);
    }
    @Test
    public void getRadiansFrom0() {
        Angle angle = new Angle(0);
        assertEquals(0, angle.getRadians(), 0.00001);
    }

    @Test
    public void getRadiansFrom180() {
        Angle angle = new Angle(180);
        assertEquals(Math.PI, angle.getRadians(), 0.00001);
    }

    @Test
    public void getRadiansFrom360() {
        Angle angle = new Angle(360);
        assertEquals(Math.PI * 2, angle.getRadians(), 0.00001);
    }

    @Test
    public void getRadiansFromMinus180() {
        Angle angle = new Angle(-180);
        assertEquals(-Math.PI, angle.getRadians(), 0.00001);
    }
}