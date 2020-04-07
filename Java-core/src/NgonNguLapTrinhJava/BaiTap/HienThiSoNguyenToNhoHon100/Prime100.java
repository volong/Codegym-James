package NgonNguLapTrinhJava.BaiTap.HienThiSoNguyenToNhoHon100;

import java.util.Scanner;

public class Prime100 {
    public static void main(String[] args) {
        for (int a = 2; a < 100; a++) {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(a)) {
                if (a % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(a);
        }
    }
    }

