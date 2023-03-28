package org.example;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {

        Scanner bananaCat = new Scanner(System.in);
        System.out.println("Enter a radius. ");
        double radius = bananaCat.nextDouble();
        double circle = Area.getArea(radius);
        System.out.println("The area of a circle with a radius of " + radius + " is: " + circle);
    }
}