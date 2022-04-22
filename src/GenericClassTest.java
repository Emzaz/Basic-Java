public class GenericClassTest {
    public static void main(String[] args) {
        Generic<Integer> integerGeneric = new Generic<>(88);

        integerGeneric.showType();
        int v = integerGeneric.getObj();
        System.out.println("Value: " +v);

        Generic<String> stringGeneric = new Generic<>("This is a generic test");
        stringGeneric.showType();
        String string = stringGeneric.getObj();
        System.out.println("Value: " +string);
    }
}
