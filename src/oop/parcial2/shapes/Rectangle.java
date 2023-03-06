package oop.parcial2.shapes;

public class Rectangle extends Shape{
    private double base;
    private double height;
    public Rectangle(){
        super("Rectangulo");
    }
    public String toString() {
        return "█";
    }
    public Rectangle(double base, double height){
        this();
        this.base = base;
        this.height = height;
    }
    public double getArea(){
        return base*height;
    }
    public double getPerimeter(){
        return base*2 + height*2;
    }
    public int getSidesCount(){
        return 4;
    }
    public double getBase() {
        return base;
    }
    public double getHeight() {
        return height;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public void setHeight(double height) {
        this.height = height;
    }
}
