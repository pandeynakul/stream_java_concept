package Thread;

 /* practiced By:  Ankul Deshpande 
    03-07-2026
  */

import java.util.Scanner;

public class FizzBuzzMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please Enter the number");
        int n = sc.nextInt();
        FizzBuzz fizzBuzz = new FizzBuzz(n);

        //thread A
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    fizzBuzz.fizz(new Runnable() {
                        @Override
                        public void run() {
                            System.out.print("fizz" + " ");
                        }
                    });
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        //thread B
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    fizzBuzz.buzz(() -> System.out.print("buzz " + " "));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread threadC = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    fizzBuzz.fizzbuzz(new Runnable() {
                        @Override
                        public void run() {
                            System.out.print("fizzbuzz" + " ");
                        }
                    });
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread threadD = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    fizzBuzz.number((x) -> System.out.print(x + " "));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        //start the thread
        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();
        // Wait for all threads to finish

        try {

            threadA.join();
            threadB.join();
            threadC.join();
            threadD.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
