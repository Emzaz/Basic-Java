public class TestStats {
    public static void main(String[] args) {
        Integer[] arr = {10, 20, 30, 40, 50};
        Double[] doubles = {5.0, 10.0, 20.0, 30.0, 22.5, 22.5};

        Stats<Integer> integerStats = new Stats<>(arr);
        Stats<Double> doubleStats = new Stats<>(doubles);

        Double avg = integerStats.average();
        Double avg2 = doubleStats.average();

        System.out.println(avg);
        System.out.println(avg2);
    }
}
