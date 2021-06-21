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

    @Test
    public void TITOSForEquilateralTriangle(){
        Triangle triangle = new Triangle(new Section(new Point(0,0), new Point(10, 0)), new Angle(60), new Angle(120));

        assertEquals("Equilateral", triangle.getTitos());
    }

    @Test
    public void TITOSForIsoscelesTriangle(){
        Triangle triangle = new Triangle(new Section(new Point(0,0), new Point(10, 0)), new Angle(70), new Angle(110));

        assertEquals("Isosceles", triangle.getTitos());
    }

    @Test
    public void TITOSForScaleneTriangle(){
        Triangle triangle = new Triangle(new Section(new Point(0,0), new Point(10, 0)), new Angle(61), new Angle(123));

        assertEquals("Scalene", triangle.getTitos());
    }

    @Test
    public void TITOAForRectangularTriangle(){
        Triangle triangle = new Triangle(new Section(new Point(0,0), new Point(10, 0)), new Angle(90), new Angle(123));

        assertEquals("Rectangular", triangle.getTitoa());
    }

    @Test
    public void TITOAForObtuseTriangle(){
        Triangle triangle = new Triangle(new Section(new Point(0,0), new Point(10, 0)), new Angle(110), new Angle(150));

        assertEquals("Obtuse", triangle.getTitoa());
    }

    @Test
    public void TITOAForAcuteTriangle(){
        Triangle triangle = new Triangle(new Section(new Point(0,0), new Point(10, 0)), new Angle(70), new Angle(120));

        assertEquals("Acute", triangle.getTitoa());
    }

    @Test
    public void heightFromBase10InEquilateral(){
        Triangle triangle = new Triangle(new Section(new Point(0,0), new Point(10, 0)), new Angle(60), new Angle(120));
        assertEquals(Math.sqrt(3) * 5, triangle.getHeight(), 0.00001);
    }
}