package Tuan4_2;

public class Square extends Rectangle {
    private boolean filled;
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSize() {
        return width;
    }

    public void setSide(double side) {
        this.width = side;
    }
    
    public void setWidth(double side) {
        this.width = side;
    }

    public void setLength(double side) {
        this.length = side;
    }
    
    public String toString() {
        return "Square[side=" + width + ", color=" + color + ", filled=" + filled + "]";
        
    }
    
    public static void main(String[] args) {
	      Square sq = new Circle(4, "pink", false);
        String s = sq.toString();
        double a = sq.getParameter();
        double b = sq.getArea();
        System.out.println(s);
        System.out.println(a);
        System.out.println(b);
	}
}
