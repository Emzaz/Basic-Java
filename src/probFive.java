public class probFive {
    public static void main(String[] args) throws Exception{
        try {
            methodA();
            //doNotCallMe();
            methodC();
        } catch (XyzException ex) {
            System.out.println(ex);

        } catch (Exception e) {
            System.out.println(e);
            throw e;
        } finally {
            System.out.println("Inside Finally block");
        }
        System.out.println("End of the main method");
    }

    public static void methodA() {
        System.out.println("Inside method A");
    }

    public static void methodC() throws XyzException {
        System.out.println("Inside method C");
        throw new XyzException("Method C");
    }

    public static void doNotCallMe() throws XyzException {
        System.out.println("inside dnc");
        throw new XyzException("You can't call this method!");
    }
}
