package NgonNguLapTrinhJava.BaiTap.HienThiCacLoaiHinh;

public class PrintFroms {
    public static void main(String[] args) {

        int line = 1;
        while (line <= 5) {
            for (int i = 1; i <= line; i++) {
                System.out.print("*");
            }
            System.out.println();
            line++;



        }
        System.out.println();
        rectangle();


        System.out.println();
        tritangle();
    }

    public static void rectangle() {

        int i = 1;
        while (i <= 5) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");

            }
            System.out.println();
            i++;
        }
    }

    public static void tritangle() {

        int number = 5;
        while (number >= 1){
            for (int i = 1; i  <= number; i++){
                System.out.print("*");
            }
            System.out.println();
            number--;
        }
    }
}
