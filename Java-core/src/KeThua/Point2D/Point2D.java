package  KeThua.Point2D;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D(){
    }

    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString(){
        return "Point.Point 2D: X is " + getX() + " and Y is " + getY();
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D(5,3);
        System.out.println(point2D);
    }
}

  class Point3D extends Point2D{
    private float z;
    public Point3D(){
    }
    public Point3D(float z, float x, float y) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    @Override
    public String toString(){
        return "Point.Point 3D: X is " + getX() + ", Y is " + getY() + " and Z is " + z;
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D(2, 4, 7);
        System.out.println(point3D);
    }
}

