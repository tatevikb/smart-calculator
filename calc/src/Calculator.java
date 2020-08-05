import java.util.Scanner;

public class Calculator
{
    private int first;
    private int second;

    /**
     * Prints the sum of two integers.
     */
    private void add()
    {
        System.out.println(first + second);
    }

    /**
     * Get values from command line.
     */
    private void getValue()
    {
        Scanner scan = new Scanner(System.in);
        first = scan.nextInt();
        second = scan.nextInt();
    }

    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        calc.getValue();
        calc.add();
    }
}
