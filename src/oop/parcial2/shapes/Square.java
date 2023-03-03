package oop.parcial2.shapes;

public class Square extends Shape{
    private double side;
    public Square(){
        super("Cuadrado");
    }

    public Square(double side) {
        this();
        this.side = side;
    }
    public double getArea(){
        return side*side;
    }
    public double getPerimeter(){
        return 4*side;
    }
    public int getSidesCount(){
        return 4;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
}
