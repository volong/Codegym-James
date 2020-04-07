package MangVaPhuongThuc.BaiTap.XoaPhanTuKhoiMang;

import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {

        int size, i, c;
        Scanner scanner = new Scanner(System.in);

            System.out.println("Enter size of array: ");
            size = scanner.nextInt();

        int Arr[] = new int[size];

        System.out.println("Enter elements of array: ");
        for (i = 0; i < size; i++) {
            System.out.print("Element= " + i + ": ");
            Arr[i] = scanner.nextInt();
        }

        System.out.println("Enter element that you want to delete : ");
        int k = scanner.nextInt();

        for (c = i = 0; i < size; i++) {
            if (Arr[i] != k) {
                Arr[c] = Arr[i];
                c++;

            }
        }

        size = c;
        System.out.println("Array after deleted is : ");
        for (i = 0; i < size; i++) {
            System.out.print(Arr[i] + " ");
        }
    }
}
