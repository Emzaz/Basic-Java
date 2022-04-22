public class tryCatch {
    public static void main(String[] args) {
        int a = 10;
        int c = 0;
        int result = 0;

        try {
            result = a/c;
            System.out.println("Result = " +result);
        } catch (ArithmeticException e) {
            System.out.println("Exception occurred: "+e);
        }
    }
}
