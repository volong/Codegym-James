package LopDoiTuong.StopWatch;

import java.util.Scanner;

public class Stopwatch{
    public Stopwatch() {
    }

    public long getStart(){
        return System.currentTimeMillis();
    }

    public long getStop(){
        return System.currentTimeMillis();
    }


    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        long start = stopwatch.getStart();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter anything to stop program! ");
        String something = sc.next();

        long stop  = stopwatch.getStop();

        long time = (stop - start) / 1000;
        System.out.println("The program takes " + time + " seconds");
    }
}


