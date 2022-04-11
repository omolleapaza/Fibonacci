public class Fibonacci {


    public static void main(String args[])
    {
        // Llamar a la función
        Fibonacci(20);
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
}
