public class Tuple<X, Y> {
    private X x;
    private Y y;

    public Tuple(X x, Y y) {
        this.x = x;
        this.y = y;
    }

    public Tuple() {
    }

    public X getX() {
        return x;
    }

    public Y getY() {
        return y;
    }

    public void showType() {
        System.out.println("Type of X is: " + x.getClass().getName() + " and Value: " + x);
        System.out.println("Type of Y is: " + y.getClass().getName() + " and Value: " + y);
    }

    @Override
    public String toString() {
        return "Tuple{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        Tuple<String, String> tuple = new Tuple<>("Hello", "World");
        tuple.showType();

        System.out.println();

        Tuple<String, Integer> person = new Tuple<>("Rahim", 45);
        person.showType();

        System.out.println();

        Tuple<String, Tuple<Integer, Integer>> tupleTuple = new Tuple<>("Tuple", new Tuple<>(10, 20));
        tupleTuple.showType();
    }
}
