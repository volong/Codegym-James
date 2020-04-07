package MangVaPhuongThuc.ThucHanh.SuDungLopArrayIndexOutOfBoundsException;

import java.util.Random;
import java.util.Scanner;

class ArrayExample {

    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Array: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

        public static void main(String[] args) {
            ArrayExample arrExample = new ArrayExample();
            Integer[] arr = arrExample.createRandom();

            Scanner scaner = new Scanner(System.in);
            System.out.println("\n Enter index : ");
            int x = scaner.nextInt();
            try {
                System.out.println("Implement of index 5" + x + " is " + arr[x]);
            } catch (IndexOutOfBoundsException e) {
                System.err.println("Index Out Of Bounds Exception!");
            }
        }
}
