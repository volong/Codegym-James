package  KeThua.Circle;

class Circle2 {
    private double radius;
    private String color;
    public Circle2(){
    }

    public Circle2(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double area(){
        return radius * radius * Math.PI;
    }

    @Override
    public String toString(){
        return "The circle: radius is " + radius
                + ". Color is " + color
                + ". Area is "  + area();
    }
}

public class Circle1{
    public static void main(String[]args){
        Circle2 circle = new Circle2(2, "red");
    System.out.println(circle.toString());
        }
}

class Cylinder extends Circle2 {
    private double height;
    public Cylinder(){
    }
    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double Volume(){
        return getRadius() * getRadius() * Math.PI * height;
    }
    @Override
    public String toString(){
        return "The Circle.Cylinder : "
                + "radius is " + getRadius()
                + " height is " + getHeight()
                + " color is " + getColor()
                + " volume is " + Volume();
    }
}


class Cylinder1{
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(4, 3, "blue");
        System.out.println(cylinder);
    }
}