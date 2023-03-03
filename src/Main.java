import java.util.LinkedList;
import java.util.List;

import oop.parcial2.shapes.*;

public class Main {

    public static void main(String[] args) {
        List<Shape> shapes = new LinkedList<>();


        shapes.add(new Square(10)); // providing side
        shapes.add(new Rectangle(10, 20)); // providing base and height
        shapes.add(new Triangle(10, 20)); // providing base and height
        shapes.add(new Circle(10)); // providing radio


        for(Shape shape: shapes){
            System.out.println("Shape: " + shape.getName() + ": " + shape); //with shape print something related to the actual shape, for example ○ ▲ ■ █
            System.out.println("Real class name: " + shape.getClass().getName());
            System.out.println("Sides count: " + shape.getSidesCount());
            System.out.println("Perimeter: " + shape.getPerimeter());
            System.out.println("Area: " + shape.getArea());
            System.out.println("---------------------------------------");
        }

    }
}
