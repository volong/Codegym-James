package MangVaPhuongThuc.BaiTap.ThemPhantuVaoMang;

import java.util.Scanner;

public class AddToArr {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        System.out.println("Value : ");
        int value = sc.nextInt();
        System.out.println("Index is : ");
        int index = sc.nextInt();
        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
        System.out.println("Array after added implement: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
