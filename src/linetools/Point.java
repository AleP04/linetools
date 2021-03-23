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
public class Point {

    private final int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    //

    public double distance(Point b) {
        return Math.sqrt(Math.pow(this.x - b.x, 2) + Math.pow(this.y - b.y, 2));
    }

    @Override
    public String toString() {
        return "Point: " + "(x=" + x + "; y=" + y+")";
    }

    public Point midpoint(Point b) {
        double xM = (double)(this.x + b.x) / 2;
        double yM = (double)(this.y + b.y) / 2;
        int xF= (int)Math.floor(xM);
        int yF= (int)Math.floor(yM);
        Point result = new Point(xF, yF);
        return result;
    }


}
