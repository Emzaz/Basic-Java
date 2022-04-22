import java.util.ArrayList;
import java.util.List;

public class WildCardArguments {

    public static void printList(List<? super String> list) {
        for(Object o : list) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        List<Object> objectList = new ArrayList<>();

        objectList.add(55);
        objectList.add("Hello");
        
        printList(objectList);
    }
}
