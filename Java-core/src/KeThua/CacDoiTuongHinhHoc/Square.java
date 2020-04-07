package KeThua.CacDoiTuongHinhHoc;

import LopDoiTuong.Rectangle.Rectangle;

public class Square extends Rectangle {
    public Square(){
    }

    public Square(double size){
        super(size, size);
    }

    public Square(double side, String color, boolean filled) {
        super(side, color, filled);
    }
  public double getSide() {
        return getSide();
  }
  public void setSide(double side) {
        setWidth(side);
        setLength(side);
  }


  public void setWidth(double width) {
        setSide(width);
   }

    public void setLength(double length) {
        setSide(length);
   }
   @Override
    public String toString(){
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
   }
}
