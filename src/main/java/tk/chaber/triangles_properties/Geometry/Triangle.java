package tk.chaber.triangles_properties.Geometry;

public class Triangle {
    private Section a,
                    b,
                    c;
    private Vertex  A,
                    B,
                    C;

    public Triangle(Section c, Angle alpha, Angle beta){
        Point   A = c.getA(),
                B = c.getB();

        Straight    bStraight = new Straight(A, alpha),
                    aStraight = new Straight(B, beta);

        Point   C = bStraight.findIntersection(aStraight);

        Section b = new Section(A, C),
                a = new Section(B, C);


        this.a = a;
        this.b = b;
        this.c = c;
    }
}
