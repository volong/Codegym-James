package MangVaPhuongThuc.BaiTap.TinhTongDuongCheoMang2Chieu;

import java.util.Scanner;

public class SumOfDiagonalLines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of lines: ");
        int line = scanner.nextInt();
        System.out.println("Enter number of columns: ");
        int column = scanner.nextInt();

        int A[][] = new int[line][column];

        System.out.println("Enter elements for ử: ");
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(A[i][j]);
            }
        }


            int sum = 0;
            for (int i = 0; i < line; i++) {
                for (int j = 0; j < column; j++) {
                    if (i == j) {
                        sum += A[i][j];
                    }
                }
            }
            System.out.println("Sum of diagonal l ine: " + sum);
        }
    }
