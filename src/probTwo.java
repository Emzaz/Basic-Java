import java.util.Scanner;

public class probTwo {
    public static double divide(double a, double b) {
        return a/b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Please Enter an Integer: ");
            double a = input.nextDouble();
            System.out.print("Please Enter another Integer: ");
            double b = input.nextDouble();

            try {
                double div = divide(a, b);
                System.out.println("Division of "+a+" and "+b+" = " +div);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);



    }
}
