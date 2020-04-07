package  KeThua.CacDoiTuongHinhHoc;

import java.util.Scanner;

class Triangle extends Shape {
      private double side1 = 1.0;
      private double side2 = 1.0;
      private double side3 = 1.0;
    public Triangle(){}
    public Triangle(double side1, double side2, double side3, String color, boolean filled){
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

      public double getSide1() {
          return side1;
      }

      public void setSide1(double side1) {
          this.side1 = side1;
      }

      public double getSide2() {
          return side2;
      }

      public void setSide2(double side2) {
          this.side2 = side2;
      }

      public double getSide3() {
          return side3;
      }

      public void setSide3(double side3) {
          this.side3 = side3;
      }

      public double getPerimeters(){
        return side1 + side2 + side3;
      }

      public double getP(){
        return getPerimeters() / 2;
      }
    public double getArea(){
        return Math.sqrt(getP()*(getP()-side1)*(getP()-side2)*(getP()-side3));
    }

      @Override
      public String toString() {
        return "Triangle: has color " + getColor()
                + " with area is " + getArea()
                + " and perimeters is " + getPerimeters();
      }
  }

  class TriangleTest {
      public static void main(String[] args) {
          Triangle triangle = new Triangle();
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter side of triangle :");
          double side1 = triangle.getSide1();
                  side1 = sc.nextDouble();
          double side2 = triangle.getSide1();
                  side2 = sc.nextDouble();
          double side3 = triangle.getSide1();
                  side3 = sc.nextDouble();

          System.out.println("And color : ");
          String color = triangle.getColor();
                 color = sc.next();

                 triangle = new Triangle(side1, side2, side3, color, true);
          System.out.println(triangle);

      }
  }
