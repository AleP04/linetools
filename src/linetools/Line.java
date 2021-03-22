/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linetools;

/**
 *
 * @author alep
 */
public class Line {

    private final Point a, b;

    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public double slope() {
        double xA = a.getX();
        double yA = a.getY();
        xA = (double) xA;
        yA = (double) yA;
        double d = (yA - b.getY()) / (xA - b.getX());
        return d;
    }

    public double antiReciprocal() {
        return -(1 / this.slope());
    }

    public double intercept() {
        //return this.y - this.x * m;
        return a.getY() - a.getX() * this.slope();
    }

    public Point intersection(Line s){
        double xM = (double)((s.intercept()-this.intercept())/(this.slope()-s.slope()));
        double yM = (double)(this.slope()*xM+this.intercept());
//        double xM = (double)((q2 - q1) / (m1 - m2));
//        double yM = (double)(m1 * xM + q1);
        int xF = (int)Math.round(xM);
        int yF = (int)Math.round(yM);
        Point result = new Point(xF, yF);
        return result;
    }

}
