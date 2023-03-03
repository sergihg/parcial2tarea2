package oop.parcial2.shapes;

public abstract class Shape {
    private String name;
    protected double area;
    protected double perimeter;
    public Shape(String name){
        this.name=name;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract int getSidesCount();
    public String getName(){
        return name;
    }
}
