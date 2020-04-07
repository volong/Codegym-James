package LopDoiTuong.Rectangle;

import java.util.Scanner;

public class Rectangle {
    double width, length;

    public Rectangle(double side, String color, boolean filled) {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return (width + length) * 2;
    }

    public String display() {
        return "Rectangle.Rectangle (width : " + width + " height :" + length + ").";
    }

}


    class result {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap width : ");
            double width = sc.nextDouble();
            System.out.println("nhap length:  ");
            double length = sc.nextDouble();
            Rectangle retangle = new Rectangle(width, length);
            System.out.println(retangle.display());
            System.out.println("Area is: " + retangle.getArea());
            System.out.println("Perimeter is: " + retangle.getPerimeter());

    }
}

