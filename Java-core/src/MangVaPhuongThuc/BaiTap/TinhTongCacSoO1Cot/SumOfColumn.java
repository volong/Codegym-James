package MangVaPhuongThuc.BaiTap.TinhTongCacSoO1Cot;

import java.util.Scanner;

public class SumOfColumn {
    public static void main(String[] args) {
        int dong, cot;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of line:");
        dong = sc.nextInt();
        System.out.println("Enter number of column: ");
        cot = sc.nextInt();
        int arr[][] = new int[dong][cot];


        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print("Enter element of index: [" + i + ", " + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array: ");
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }


        System.out.println("Enter column that you want to sum : ");
        int c = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < dong; i++) {
            sum = sum + arr[i][c];
        }
        System.out.println("Sum of column: " + sum);

    }
}
