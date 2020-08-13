package Tuan4_2;


public abstract class Shape {
    
    protected String color;
    protected boolean filed;
    public abstract double getArea();
    public abstract double getParameter();

    public Shape(String color, boolean filed) {
        this.color = color;
        this.filed = filed;
    }

    public Shape() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFiled() {
        return filed;
    }

    public void setFiled(boolean filed) {
        this.filed = filed;
    }

    public String toString() {
        return "Shape{" +
                "color=" + color +
                ", filed=" + filed +
                '}';
    }
    public static void main(String[] args) {
	Shape sh = new Shape("black", false);
        String s = sh.toString();
        double a = sh.getParameter();
        double b = sh.getArea();
        System.out.println(s);
        System.out.println(a);
        System.out.println(b);
	}
}
