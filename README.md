<h1 align="center">Examen Parcial LPIII</h1>

<p align="center">
Fibonacci Tiempo de Ejecución
</p>

<p align="center">
<img src="/assets/screenshot.png"/>
</p>



## FIBONACCI ITERATIVE
<pre>
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
</pre>

## FIBONACCI RECURSIVE
<pre>
static int FibonacciRecursivo(int numero){
        if(numero > 1){
            return FibonacciRecursivo(numero-1) + FibonacciRecursivo(numero-2);
        }else{
            if(numero == 1 ) return 1;
            else return 0;
        }
    }
</pre>

Author: Oscar Molleapaza Flores
- Estudiante del IV Semestre de Ingeniería de Software


