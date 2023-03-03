package oop.parcial2.shapes;

public class Circle extends Shape{
    private double radio;
    public Circle(){
        super("Circulo");
    }
    public Circle(double radio){
        this();
        this.radio = radio;
    }
    public double getArea(){
        return Math.PI * radio * radio;
    }
    public double getPerimeter(){
        return 2*radio*Math.PI;
    }
    public int getSidesCount(){
        return 0;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio){
        this.radio = radio;
    }
}
