package circl;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nabee
 */
public class Circlnew {

    private double radius;
    private String color;

    public Circlnew(double radius, String color) {
        this.color = color;
        this.radius = radius;

    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        if (radius > 10) {
            return;
        }
        this.radius = radius;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
