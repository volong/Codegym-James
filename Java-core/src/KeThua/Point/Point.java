package  KeThua.Point;

public class Point {
        private float x = 0.0f;
        private float y = 0.0f;

        public Point(){
        }

        public Point(float x, float y){
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
            return "Point.Point: X is " + getX() + " and Y is " + getY();
        }

        public static void main(String[] args) {
            Point point = new Point(5,3);
            System.out.println(point);
        }
    }

    class MovablePoint extends Point {
    private float speedX = 0.0f;
    private float speedY = 0.0f;
        public MovablePoint() {
        }
        public MovablePoint(float x, float y, float speedX, float speedY){
            super(x, y);
            this.speedX = speedX;
            this.speedY = speedY;
        }

        public float getSpeedX() {
            return speedX;
        }

        public void setSpeedX(float speedX) {
            this.speedX = speedX;
        }

        public float getSpeedY() {
            return speedY;
        }

        public void setSpeedY(float speedY) {
            this.speedY = speedY;
        }
        }
