public class Fibonacci {


    public static void main(String args[])
    {

        int numTemp = 10;

        long start1 = System.nanoTime();
        Fibonacci(numTemp);
        long end1 = System.nanoTime();
        System.out.println("Elapsed Time in nano seconds Fibonacci Recursive: "+ (end1-start1));

        System.out.println("");

        long start2 = System.nanoTime();
        for(int i=0; i<numTemp; i++){
            int fibonacciNumber = FibonacciRecursivo(i);
            System.out.print(" " + fibonacciNumber);
        }
        long end2 = System.nanoTime();

        System.out.println("Elapsed Time in nano seconds Fibonacci Iterative: "+ (end2-start2));


    }

    static void Fibonacci(int numero)
    {
        int first_num = 0, second_num = 1;

        int counter = 0;

        while (counter < numero) {

            System.out.print(first_num + " ");

            int num3 = second_num + first_num;
            first_num = second_num;
            second_num = num3;
            counter = counter + 1;
        }
    }

    static int FibonacciRecursivo(int numero){
        if(numero > 1){
            return FibonacciRecursivo(numero-1) + FibonacciRecursivo(numero-2);
        }else{
            if(numero == 1 ) return 1;
            else return 0;
        }
    }
}
