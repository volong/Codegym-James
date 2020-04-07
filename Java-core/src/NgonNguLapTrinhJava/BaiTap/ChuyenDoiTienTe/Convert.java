package NgonNguLapTrinhJava.BaiTap.ChuyenDoiTienTe;

import java.util.Scanner;

public class Convert {
        public static void main(String[] args) {
            double rate = 23000;
            double USD;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter USD : ");
            USD = sc.nextDouble();
            double VND = USD * 23000;
            System.out.print("VND is : " + VND);
        }
    }
