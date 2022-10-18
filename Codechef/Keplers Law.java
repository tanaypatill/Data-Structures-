import java.util.Scanner;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test > 0){
            
            double t1 = input.nextInt();
            double t2 = input.nextInt();
            double r1 = input.nextInt();
            double r2 = input.nextInt();
            
            double t = Math.pow(t1, 2) / Math.pow(r1, 3);
            double r = Math.pow(t2, 2) / Math.pow(r2, 3);
            
            if (t == r){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            test = test - 1;
        }
    }
}
