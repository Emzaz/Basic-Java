public class PrintExceptionInfo {
    public static void main(String[] args) {
        int a = 5;

        try {
            if(a < 10) {
                throw new Exception("Value is too small!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }
}
