import java.util.Scanner;
import java.util.Random;
public class RandomInt {
//1.2.30 Uniform random numbers.
// Write a program that prints five uniform random numbers between 0 and 1,
// their average value,
// and their minimum and maximum values.
// Use Math.random(), Math.min(), and Math.max().
//1.2.34 Three-sort.
// Write a program that takes three integer command-line arguments and prints them in ascending order.
// Use Math.min() and Math.max().
        public static void main(String[] args){
            //Scanner scanner = new Scanner(System.in);
            //System.out.println("Enter 5 integers that you like: ");
            //String numbers = scanner.nextLine();
            int N  = Integer.parseInt(args[0]);
            int O  = Integer.parseInt(args[1]);
            int P  = Integer.parseInt(args[2]);
            int Q  = Integer.parseInt(args[3]);
            int R  = Integer.parseInt(args[4]);

            double r = Math.random();

            int a = (int)(r * N);
            int b = (int)(r * O);
            int c = (int)(r * P);
            int d = (int)(r * Q);
            int e = (int)(r * R);
            double max = Math.max(a, Math.max(b, Math.max(c, Math.max(d, e))));
            double min = Math.min(a,Math.min(b,Math.min(c,Math.min(d, e))));
            double avg = (a + b + c + d + e)/args.length;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            System.out.println(e);
            System.out.println( "The max value of five arguments is: " + max);
            System.out.println( "The min value of five arguments is: " + min);
            System.out.println("The average value of five arguments is: " + avg);



        }
    }


