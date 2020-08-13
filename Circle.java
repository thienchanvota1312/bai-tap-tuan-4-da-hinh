package Tuan4_2;

public class Circle extends Shape{
   
    private double radius = 1.0;

    public Circle(){}

    public Circle(double radius){
        this.radius =  radius;
    }

    public Circle(String color, boolean filed, double radius) {
        super(color, filed);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double getArea () {
        double radius = this.radius;
        return  3.14*pow(radius,2);
    }

    @Override
    public double getParameter() {
        return 0;
    }
    public static void main(String[] args) {
	Circle c = new Circle("orange", false, 12);
        String s = c.toString();
        double a = c.getParameter();
        double b = c.getArea();
        System.out.println(s);
        System.out.println(a);
        System.out.println(b);
	}
}
