package Recursion;

public class Recurse {

    public int fact (int n) {
        if (n == 1) return 1;
        else return n * fact(n - 1);
    }

    // Write a recursive definition of xy (x raised to the power of y), where x and y are integers
    // and y > 0.
    public int power (int x, int y) {
        if (y == 0) return 1;
        else return x * power(x, y-1);
    }

    // Write a recursive definition of i * j (integer multiplication), where i > 0. Define the
    // multiplication process in terms of integer addition.

    public int multi(int i, int j) {
        if (i == 0 ) return 0;
        else  return j + multi(i - 1, j);
    }

    // Write a recursive definition of the Fibonacci numbers. The Fibonacci numbers are a
    // sequence of integers, each of which is the sum of the previous two numbers. The first two
    // numbers in the sequence are defined to be 0 and 1. For example fibo(9) should print out
    // the 9th term of the Fibonacci sequence.

    public int fibonacci (int f) {
        if (f == 0) return 0;
        if (f == 1) return 1;
        else return fibonacci(f - 1) + fibonacci(f - 2);
    }

    // Write a recursive method to reverse a string.

    public String reverse (String s) {
        if (s.length() == 1) return s;
        else {
            return s.substring( s.length() - 1) + reverse(s.substring(0, s.length()-1));
        }
    }

    public static void main(String[] args) {
        Recurse r = new Recurse();
        System.out.println(r.fact(10));
        System.out.println(r.power(8,8));
        System.out.println(r.multi(8,8));
        System.out.println(r.fibonacci(9));
        System.out.println(r.reverse("hello world"));
    }

}
