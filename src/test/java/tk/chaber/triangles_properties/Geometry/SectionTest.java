package tk.chaber.triangles_properties.Geometry;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SectionTest extends TestCase {
    Section section;
    @Before
    public void setUp(){
        section = new Section(new Point(0, 0), new Angle(60), 25);
    }
    @Test
    public void testXFromAngle() {

        assertEquals(12.5, section.getB().getX(), 0.00001);
    }

    @Test
    public void testYFromAngle() {

        assertEquals(12.5 * Math.sqrt(3), section.getB().getY(), 0.00001);
    }
}