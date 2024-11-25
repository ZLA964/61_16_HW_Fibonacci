package telran.fibonacci;

import telran.fibonacci.model.Fibonacci;

public class FibonacciAppl {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci(8);
        // print all numbers, and reduce sum
        // 1,1,2,3,5,8,13,21
        // sum = 54
        int sum = 0;
        for(Integer numeric : fibonacci){
            System.out.print(numeric+", ");
            sum += numeric;
        }
        System.out.println("\nSum= " + sum);
    }
}
