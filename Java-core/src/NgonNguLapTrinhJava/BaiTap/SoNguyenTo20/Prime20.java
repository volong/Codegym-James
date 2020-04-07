package NgonNguLapTrinhJava.BaiTap.SoNguyenTo20;

public class Prime20 {
    public static void main(String[] args) {
        int dem;
        int num = 2;
        for ( dem = 0; dem < 20; num++) {
            boolean check = true;
            int i = 2;
            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
                i++;

            }
            if (check) {
                System.out.println(num);
                dem++;
            }
        }
    }
}
