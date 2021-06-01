package tk.chaber.triangles_properties.Geometry;

import junit.framework.TestCase;
import org.junit.Test;

public class AngleTests extends TestCase {
    @Test
    public void testGetRadiansFrom0() {
        Angle angle = new Angle(0);
        assertEquals(0, angle.getRadians(), 0.00001);
    }

    @Test
    public void testGetRadiansFrom180() {
        Angle angle = new Angle(180);
        assertEquals(Math.PI, angle.getRadians(), 0.00001);
    }

    @Test
    public void testGetRadiansFrom360() {
        Angle angle = new Angle(360);
        assertEquals(Math.PI * 2, angle.getRadians(), 0.00001);
    }

    @Test
    public void testGetRadiansFromMinus180() {
        Angle angle = new Angle(-180);
        assertEquals(-Math.PI, angle.getRadians(), 0.00001);
    }
}