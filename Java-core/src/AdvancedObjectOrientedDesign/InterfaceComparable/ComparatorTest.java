package AdvancedObjectOrientedDesign.InterfaceComparable;

import java.util.Arrays;

public class ComparatorTest{
  public static void main(String[] args) {
      ComparableCircle[] comparableCircles = new ComparableCircle[3];
      comparableCircles[0] = new ComparableCircle(3.6);
      comparableCircles[1] = new ComparableCircle(37, "blue", true);
      comparableCircles[2] = new ComparableCircle(3.5, "red", false);

      System.out.println("Pre-sorted: ");
      for (ComparableCircle comparableCircle : comparableCircles) {
          System.out.println(comparableCircle);
      }

      Arrays.sort(comparableCircles);
      System.out.println("After-sorted: ");
      for (ComparableCircle comparableCircle : comparableCircles) {
          System.out.println(comparableCircle);
      }
  }
}
