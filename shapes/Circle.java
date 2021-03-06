/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author 00220682
 */
public class Circle extends Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
         return Math.PI * radius * radius;
    }

    
    @Override
    public double getPerimeter() {
        return Math.PI * radius * 2;
    }
    
    public double getCircumference(){
        return getPerimeter();
    }
    @Override
    public double getVolume() {
        return 0;
    }
}
