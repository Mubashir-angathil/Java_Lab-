/*
Author : Mubashir Angathil
Program: Write a multithread java program for display odd numbers and even numbers up to a limit.
         (Hint:implement thread using Runnable interface)
Date   : 20-02-2022 
Time   : 05:24 PM
*/

import java.util.Scanner;

public class OddAndEven {

    boolean odd;
    int count = 1;

    public void printOdd(int MAX) {
        synchronized (this) {
            while (count < MAX) {
                System.out.println("Checking odd loop");

                while (!odd) {
                    try {
                        System.out.println("Odd waiting : " + count);
                        wait();
                        System.out.println("Notified odd :" + count);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Odd Thread :" + count);
                count++;
                odd = false;
                notify();
            }
        }
    }

    public void printEven(int MAX) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        synchronized (this) {
            while (count < MAX) {
                System.out.println("Checking even loop");

                while (odd) {
                    try {
                        System.out.println("Even waiting: " + count);
                        wait();
                        System.out.println("Notified even:" + count);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Even thread :" + count);
                count++;
                odd = true;
                notify();

            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a limit between(1-20):");
        int MAX = sc.nextInt();
        OddAndEven oep = new OddAndEven();
        oep.odd = true;
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                oep.printEven(MAX);

            }
        });
        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                oep.printOdd(MAX);

            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

/*
 _______________________________________ 
       OUTPUT OF THE PROGRAM
 _______________________________________
  
  Enter a limit between(1-20):3
  Checking odd loop
  Odd Thread :1
  Checking odd loop
  Odd waiting : 2
  Checking even loop
  Even thread :2
  Notified odd :3
  Odd Thread :3
 _______________________________________ 
 */