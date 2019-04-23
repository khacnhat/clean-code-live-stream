package com.codegym.cleancode.demo3;

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(10, 20);
        System.out.println("Volume: " + getCylinderVolume(cylinder));
    }

    public static float getCylinderVolume(Cylinder cylinder) {
        float baseArea =  (float)Math.PI * cylinder.getRadius() *  cylinder.getRadius();
        float perimeter = (float)Math.PI * 2 * cylinder.getRadius();
        float volume = perimeter * cylinder.getHeight() + baseArea * 2;
        return volume;
    }
}
