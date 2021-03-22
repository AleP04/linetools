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

    @Override
    public String toString() {
        String equation;
        if (this.intercept() > 0) {
            equation = "y=" + this.slope() + "x+" + this.intercept();
        }
        else{
            equation = "y=" + this.slope() + "x" + this.intercept();
        }
        return equation;
    }

    public double intercept() {
        return a.getY() - a.getX() * this.slope();
    }

    public Point intersection(Line s) {
        double xM = (double) ((s.intercept() - this.intercept()) / (this.slope() - s.slope()));
        double yM = (double) (this.slope() * xM + this.intercept());
        int xF = (int) Math.round(xM);
        int yF = (int) Math.round(yM);
        Point result = new Point(xF, yF);
        return result;
    }

}
