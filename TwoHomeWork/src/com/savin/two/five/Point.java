package com.savin.two.five;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Point(){}

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double translate(double x, double y){
        this.x += x;
        this.y += y;

        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }

    public void scale(double coeff){
        this.x *= coeff;
        this.y *= coeff;
    }


}
