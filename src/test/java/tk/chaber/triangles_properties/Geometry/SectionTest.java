package tk.chaber.triangles_properties.Geometry;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SectionTest{
    static Section section;
    @BeforeAll
    public static void init(){
        section = new Section(new Point(0, 0), new Angle(60), 25);
    }

    @Test
    public void XFromAngle() {
        assertEquals(12.5, section.getB().getX(), 0.00001);
    }

    @Test
    public void YFromAngle() {
        assertEquals(12.5 * Math.sqrt(3), section.getB().getY(), 0.00001);
    }

    @Test
    public void getLength() {
        assertEquals(25, section.calcLength(), 0.00001);
    }
}