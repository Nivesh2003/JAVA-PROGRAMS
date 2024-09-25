import java.util.ArrayList;
import java.util.Arrays;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Original list "+list);
        list.add(6);
        System.out.println("After adding 6 "+list);
        list.add(2,10);
        System.out.println("After adding 10 "+list);
        list.remove(3);
        System.out.println("After removing index 3 "+list);
    }
}
