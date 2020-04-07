package MangVaPhuongThuc.BaiTap.DemSoLanXuatHienTrongChuoi;

import java.util.Scanner;

public class CountElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char f;
        String chuoi = "Đếm số lần xuất hiện của ký tự trong chuỗi";
        int count = 0;
        System.out.println("Nhập kí tự cần tìm :");
        f = 't';

        for (int i = 0; i < chuoi.length(); i++) {
            if (f == chuoi.charAt(i)) {
                count = count + 1;
            }
        }
        System.out.println(chuoi.length());
        System.out.println("Tổng số kí tự : " + f + " có trong chuỗi là " + count);
    }
}
