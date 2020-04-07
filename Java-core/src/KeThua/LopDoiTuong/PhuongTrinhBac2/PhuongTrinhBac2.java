package LopDoiTuong.PhuongTrinhBac2;

import java.util.Scanner;

public class PhuongTrinhBac2 {
    private double a;
    private double b;
    private double c;

    public PhuongTrinhBac2() {

    }
    public PhuongTrinhBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
     public double getDelta() {
        return b*b - 4*a*c;
     }

     public double getRoot1() {
         if (getDelta() >= 0) {
             return (-b + Math.pow(b * b - 4 * a * c, 0.5)) / (2 * a);
         } else {
             return 0;
         }
     }

     public double getRoot2() {
        if (getDelta() >= 0 ) {
            return (-b - Math.pow(b * b - 4 * a * c, 0.5)) / (2 * a);
        } else {
            return 0;
        }
     }

    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        a = sc.nextDouble();
        System.out.println("Nhập b: ");
        b = sc.nextDouble();
        System.out.println("Nhập c: ");
        c = sc.nextDouble();

        PhuongTrinhBac2 result = new PhuongTrinhBac2(a, b, c);
        System.out.println("Delta là: " + result.getDelta());

        System.out.print("Nghiệm của phương trình : ");
        if (result.getDelta() > 0) {
            System.out.println("nghiệm 1 là " + result.getRoot1() + " nghiệm 2 là " + result.getRoot2());
        }
        if (result.getDelta() == 0) {
            System.out.println("Phương trình có duy nhất một nghiệm là: " + result.getRoot1());
        }
        if (result.getDelta() < 0) {
            System.out.println("Phương trình vô nghiệm.");
        }

    }

}