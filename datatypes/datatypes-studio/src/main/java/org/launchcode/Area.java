package org.launchcode;
import java.util.Scanner;
import java.lang.Math;
public class Area {
    public static void main(String[] args) {
        double radius;
        double area;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a radius: ");

        radius = input.nextInt();
        input.close();

        area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
