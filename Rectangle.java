package Tuan4_2;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getParameter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width= " + width +", length= " + length + "}";            
    }
    
    public static void main(String[] args) {
	      Rectangle r = new Circle(25, 12);
        String s = r.toString();
        double a = r.getParameter();
        double b = r.getArea();
        System.out.println(s);
        System.out.println(a);
        System.out.println(b);
	}
}
