import java.util.Scanner;

public class SmartCalculatorBasic {

    private Scanner scan = new Scanner(System.in);
    private String input = "";

    private void calculate()
    {
        Scanner sc = new Scanner(input);
        if (sc.hasNextInt()) {
            int value0 = sc.nextInt();
            if (sc.hasNextInt()) {
                int value1 = sc.nextInt();
                System.out.println(value0 + value1);
            }
            else {
                System.out.println(value0);
            }
        }
    }

    private void run()
    {
        while(!input.equals("/exit")) {
            input = scan.nextLine();
            if (input.isEmpty()) {
                continue;
            }
            calculate();
        }
        System.out.println("Bye!");
    }

    public static void main(String[] args)
    {
        SmartCalculatorBasic calc = new SmartCalculatorBasic();
        calc.run();
    }
}