package tk.chaber.triangles_properties.Geometry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTests {
    @Test
    public void assertTwoSidesHaveEqualPoint(){
        Triangle triangle = new Triangle(new Section(new Point(0,0), new Point(10, 0)), new Angle(45), new Angle(135));

        assertEquals(triangle.getA().getB(),triangle.getB().getB());
    }
    @Test
    public void fromSectionAnd2EqualAngles45(){
        Triangle triangle = new Triangle(new Section(new Point(0,0), new Point(10, 0)), new Angle(45), new Angle(135));
        //I mean second angle measures 45 degrees, but Straight class uses Angle as absolute one instead relative.

        assertEquals(5,triangle.getB().getB().getX(), 0.00001);
        assertEquals(5,triangle.getB().getB().getY(), 0.00001);
    }
    @Test
    public void fromSectionAnd2EqualAngles60(){
        Triangle triangle = new Triangle(new Section(new Point(0,0), new Point(10, 0)), new Angle(60), new Angle(120));

        assertEquals(5,triangle.getB().getB().getX(), 0.00001);
        assertEquals(5 * Math.sqrt(3),triangle.getB().getB().getY(), 0.00001);
    }
}