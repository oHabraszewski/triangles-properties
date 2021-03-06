package tk.chaber.triangles_properties.Geometry;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StraightTests{
    static Straight straight;

    @BeforeAll
    public static void init() {
        straight = new Straight(5, 10);
    }

    @Test
    public void testFFor0(){
        assertEquals(10, straight.f(0), 0.00001);
    }

    @Test
    public void testFForMinus10(){
        assertEquals(-40, straight.f(-10), 0.00001);
    }

    @Test
    public void testFFor10(){
        assertEquals(60, straight.f(10), 0.00001);
    }

    @Test
    public void testFindCrossPointForM10B0(){
        Straight straight2 = new Straight(10, 0);
        assertEquals(2.0, straight.findCrossPoint(straight2).getX(), 0.00001);
        assertEquals(20.0, straight.findCrossPoint(straight2).getY(), 0.00001);
    }

    @Test
    public void testFindCrossPointForMMinus20BMinus30(){
        Straight straight2 = new Straight(-20, -30);
        assertEquals(-1.6, straight.findCrossPoint(straight2).getX(), 0.00001);
        assertEquals(2.0, straight.findCrossPoint(straight2).getY(), 0.00001);
    }


    @Test
    public void testStraightFromAngle45AndPointX0Y10(){
        Straight straightFromAngle = new Straight(new Point(0,10), new Angle(45));
        assertEquals(1.0, straightFromAngle.getSlope(), 0.00001);
        assertEquals(10.0, straightFromAngle.getIntercept(), 0.00001);
    }

    @Test
    public void testStraightFromAngle80AndPointX10Y20(){
        Straight straightFromAngle = new Straight(new Point(10,20), new Angle(60));
        assertEquals(Math.sqrt(3), straightFromAngle.getSlope(), 0.00001);
        assertEquals(20 - 10 * Math.sqrt(3), straightFromAngle.getIntercept(), 0.00001);
    }

    @Test
    public void testStraightFromAngle135AndPointX10YMinus20(){
        Straight straightFromAngle = new Straight(new Point(10,-20), new Angle(135));
        assertEquals(-1, straightFromAngle.getSlope(), 0.00001);
        assertEquals(-10, straightFromAngle.getIntercept(), 0.00001);
    }


    @Test
    public void testStraightFromPointX10YMinus20AndPointX20Y20(){
        Straight straightFromAngle = new Straight(new Point(10,-20), new Point(20, 20));
        assertEquals(4, straightFromAngle.getSlope(), 0.00001);
        assertEquals(-60, straightFromAngle.getIntercept(), 0.00001);
    }

    @Test
    public void testStraightFromPointX0Y10AndPointX20Y20(){
        Straight straightFromAngle = new Straight(new Point(0,10), new Point(20, 20));
        assertEquals(0.5, straightFromAngle.getSlope(), 0.00001);
        assertEquals(10, straightFromAngle.getIntercept(), 0.00001);
    }
}