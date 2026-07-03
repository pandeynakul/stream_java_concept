package Thread;

/* author:  Ankul Deshpande  */

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

public class FizzBuzz {
    int n;

    public FizzBuzz(int n) {
        this.n = n;
    }
    //semaphore fizz


    //printFizzBuzz that prints the word "fizzbuzz" to the console, and
    //printNumber that prints a given integer to the console.
    //=======================
    //You are given an instance of the
    // class FizzBuzz that has four functions: fizz, buzz, fizzbuzz and number.
    //======================

    // Semaphores for thread coordination
    //printFizz that prints the word "fizz" to the console
    Semaphore semaNumber = new Semaphore(1);
    Semaphore sameFizz = new Semaphore(0);
    Semaphore sameFizzbuzz = new Semaphore(0);
    Semaphore sameBuzz = new Semaphore(0);

    public void fizz(Runnable printFizz) throws InterruptedException {

        //"fizz" if i is divisible by 3 and not 5,
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                //acquire
                sameFizz.acquire();
                //run
                printFizz.run();
                //relese
                semaNumber.release();
            }

        }
    }

    //==============================
    //printBuzz that prints the word "buzz" to the console,
    //Thread B: calls buzz() that should output the word "buzz"
    //"buzz" if i is divisible by 5 and not 3, or
    public void buzz(Runnable printBuzz) throws InterruptedException {

        //"fizz" if i is divisible by 3 and not 5,
        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0 && i % 5 == 0) {
                //acquire
                sameBuzz.acquire();
                //run
                printBuzz.run();
                //relese
                semaNumber.release();
            }

        }
    }

    //==============================
    public void fizzbuzz(Runnable printFizzbuzz) throws InterruptedException {

        //"fizz" if i is divisible by 3 and not 5,
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                //acquire
                sameFizzbuzz.acquire();
                //run
                printFizzbuzz.run();
                //relese
                semaNumber.release();
            }

        }
    }
    //==============================

    //void number(printNumber) Calls printnumber to output the numbers.
    // printNumber.accept(x) outputs "x", where x is an integer.
    //Thread D: calls number() that should only output the integers.
    public void number(IntConsumer printNumber) throws InterruptedException {
        //i if i is not divisible by 3 or 5.
        for (int i = 1; i <= n; i++) {
            semaNumber.acquire();
            if (i % 3 == 0 && i % 5 == 0) {
                //fizzbuzz
                sameFizzbuzz.release();

            } else if (i % 3 == 0 && i % 5 != 0) {
                //fizz
                sameFizz.release();
            } else if (i % 3 != 0 && i % 5 == 0) {
                //buzz
                sameBuzz.release();

            } else {
                printNumber.accept(i);
                semaNumber.release();
            }
        }

    }
}
