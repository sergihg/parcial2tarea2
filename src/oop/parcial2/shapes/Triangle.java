package oop.parcial2.shapes;

public class Triangle extends Shape{
    private double base;
    private double height;
    public Triangle(){
        super("Triangulo");
    }
    public String toString() {
        return "▲";
    }
    public Triangle(double base, double height){
        this();
        this.base = base;
        this.height = height;
    }
    public double getArea(){
        return (base*height / 2);
    }
    public double getPerimeter(){
        return base+height+java.lang.Math.sqrt(java.lang.Math.pow(base,2)+java.lang.Math.pow(height,2));
    }
    public int getSidesCount(){
        return 3;
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
