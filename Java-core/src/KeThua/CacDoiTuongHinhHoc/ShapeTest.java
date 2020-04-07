package  KeThua.CacDoiTuongHinhHoc;

import org.w3c.dom.css.Rect;
import org.w3c.dom.ls.LSOutput;

public class ShapeTest{
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
 }

class CircleTest {
     public static void main(String[] args) {
         Circle circle = new Circle();
         System.out.println(circle);

         circle = new Circle(3.5);
         System.out.println(circle);

         circle = new Circle(3.5, "indigo", true);
         System.out.println(circle);
     }
 }

class RectangleTest {
     public static void main(String[] args) {
         Rectangle rectangle = new Rectangle();
         System.out.println(rectangle);

         rectangle = new Rectangle(5,3);
         System.out.println(rectangle);

         rectangle = new Rectangle(5, 3, "orange", true);
         System.out.println(rectangle);

     }
 }

class SquareTest {
     public static void main(String[] args) {
         Square square = new Square();
         System.out.println(square);

         square = new Square(5);
         System.out.println(square);

         square = new Square(5,"Apple", true);
         System.out.println(square);
     }
 }



