package AdvancedObjectOrientedDesign.Resizeable;

import KeThua.CacDoiTuongHinhHoc.Circle;
import KeThua.CacDoiTuongHinhHoc.Square;
import LopDoiTuong.Rectangle.Rectangle;

import java.util.Random;
import java.util.Scanner;

interface Resizeable{
     String  resize();
}

class ReCircle extends Circle implements Resizeable{
    public ReCircle(double radius) {
        super(radius);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    public String toString(){
        return "Area of Circle before resize : " + getArea();
    }

    @Override
    public String resize(){
        Random rd = new Random();
        int i = rd.nextInt(100);
        double newArea = getArea() * i /100 + getArea();
        return "Area of Circle after resize is " + newArea + " with " + i +"%";
    }
}

 class ReRectangle extends Rectangle implements  Resizeable{
    public ReRectangle(){}

    public ReRectangle(double width, double length){
        super(width, length);
    }


     public void setWidth(double width) {

     }

     public void setLength(double length) {

     }

     @Override
    public double getArea() {
        return super.getArea();
    }

     @Override
     public String toString(){
         return "Area of Rectangle before resize : " + getArea();
     }

     @Override
     public String resize(){
         Random rd = new Random();
         int i = rd.nextInt(100);
         double newArea = getArea() * i /100 + getArea();
         return "Area of Rectangle after resize is " + newArea + " with " + i +"%";
     }
}

class ReSquare extends Square implements Resizeable{
    public ReSquare(){}

    public ReSquare(double side){
        super(side);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }
    @Override
    public String toString(){
        return "Area of Square before resize : "+ getArea();
    }

    @Override
    public String resize(){
        Random rd = new Random();
        int i = rd.nextInt(100);
        double newArea = getArea() * i /100 + getArea();
        return "Area of Square after resize is " + newArea + " with " + i +"%";
    }
}

public class ResizeableTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius for  Circle: ");
        double radius = sc.nextDouble();

        System.out.println("Enter width and length for Rectangle:  ");
        double width = sc.nextDouble();
        double length = sc.nextDouble();

        System.out.println("Enter side for Square: ");
        double side = sc.nextDouble();

        Resizeable[] resizeables = new Resizeable[3];
        resizeables[0] = new ReCircle(radius);
        resizeables[1] = new ReRectangle(width, length);
        resizeables[2] = new ReSquare(side);

        for (Resizeable resizeable : resizeables) {
            System.out.println(resizeable.toString());
        }

        for (Resizeable resizeable : resizeables){
            System.out.println(resizeable.resize());
        }

    }
}
