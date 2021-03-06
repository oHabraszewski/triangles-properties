package tk.chaber.triangles_properties.Geometry;

import tk.chaber.triangles_properties.util.Value;

public class Triangle {
    private Section a,
                    b,
                    c;
    private Angle   alpha,
                    beta,
                    gamma;
    private TITOA titoa;
    private TITOS titos;
    private double height;

    public Triangle(Section c, Angle alpha, Angle beta){
        Point   A = c.getA(),
                B = c.getB();

        Straight    bStraight = new Straight(A, alpha),
                    aStraight = new Straight(B, beta);

        Point   C = bStraight.findCrossPoint(aStraight);

        Section b = new Section(A, C),
                a = new Section(B, C);

        Angle gamma = new Angle(180 - (alpha.getDegrees() + (180-beta.getDegrees())));

        this.a = a;
        this.b = b;
        this.c = c;

        this.alpha = alpha;
        this.beta = beta;
        this.gamma = gamma;

        this.titos = checkTitos();
        this.titoa = checkTitoa();

        this.height = calcHeight();
    }
    private TITOS checkTitos(){
        if(Value.round(this.a.getLength()) == Value.round(this.b.getLength()) && Value.round(this.b.getLength()) == Value.round(this.c.getLength())){
            return TITOS.EQUILATERAL;
        }
        if(Value.round(this.a.getLength()) == Value.round(this.b.getLength()) ||
            Value.round(this.b.getLength()) == Value.round(this.c.getLength()) ||
            Value.round(this.a.getLength()) == Value.round(this.c.getLength())){
            return TITOS.ISOSCELES;
        }
        return TITOS.SCALENE;
    }

    private TITOA checkTitoa(){
        if(Value.round(this.alpha.getDegrees()) == 90 ||
            Value.round(180 - this.beta.getDegrees()) == 90 ||
            Value.round(this.gamma.getDegrees()) == 90){
            return TITOA.RECTANGULAR;
        }
        if(Value.round(this.alpha.getDegrees()) > 90 ||
            Value.round(180 - this.beta.getDegrees()) > 90 ||
            Value.round(this.gamma.getDegrees()) > 90){
            return TITOA.OBTUSE;
        }
        return TITOA.ACUTE;
    }

    private double calcHeight(){
        Section base = this.c;
        Point takenFrom = this.b.getB();
        Angle angleToBase = new Angle(90);

        Straight heightsStraight = new Straight(takenFrom, angleToBase);
        Straight basesStraight = new Straight(base.getA(), base.getB());

        Point heightPointOnBase = heightsStraight.findCrossPoint(basesStraight);

        Section height = new Section(takenFrom, heightPointOnBase);

        return height.getLength();
    }

    public Section getA() {
        return a;
    }

    public Section getB() {
        return b;
    }

    public Section getC() {
        return c;
    }

    public String getTitoa() {
        return titoa.toString().substring(0, 1) + titoa.toString().toLowerCase().substring(1);
    }

    public String getTitos() {
        return titos.toString().substring(0, 1) + titos.toString().toLowerCase().substring(1);
    }

    public double getHeight() {
        return height;
    }
}
