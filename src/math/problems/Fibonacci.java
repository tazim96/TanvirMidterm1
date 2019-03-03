package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        int fibnum = 40;
        int[] fib = new int[fibnum];
        fib[0] = 0;
        fib[1] = 1;
        for(int i=2; i < fibnum; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
        System.out.println("First 40 fibonacci numbers are : ");
        for(int i=0; i< fibnum; i++){
            System.out.print(fib[i]+" ");
        }
        System.out.println();


    }
}
