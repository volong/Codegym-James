package MangVaPhuongThuc.BaiTap.TimPhanTuLonNhatTrongMang2Chieu;

import java.util.Scanner;

public class FindMax2 {
    public static void main(String[] args) {
        int dong, cot;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số dòng:");
        dong = sc.nextInt();
        System.out.println("Nhập số cột: ");
        cot = sc.nextInt();
        int arr[][] = new int[dong][cot];
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int i, j;
        int max = arr[0][0];
        for (i = 0; i < dong; i++) {
            for(j = 0; j < cot; j++) {
                if(max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        //System.out.println("Phần tử lớn nhất là: " + max + ". Ở vị trí: [" + i + "," + j + "]");
        System.out.println("Phần tử lớn nhất là: " + max);
    }
}

