public class Fibonacci {


    // Driver Code
    public static void main(String args[])
    {
        // Llamar a la función
        Fibonacci(10);
    }

    static void Fibonacci(int numero)
    {
        int num1 = 0, num2 = 1;

        int counter = 0;

        while (counter < numero) {

            System.out.print(num1 + " ");

            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }
}
