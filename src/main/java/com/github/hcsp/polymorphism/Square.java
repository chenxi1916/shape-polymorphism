package com.github.hcsp.polymorphism;

/**
 * @author wheelchen
 */
public class Square extends Shape{
    /**
     * 正方形的边长
     */
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return this.sideLength * this.sideLength;
    }
}
