import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
public class HashSets {
    public static void main(String[] args) {
        HashSet<String> hs =  new HashSet<>(Arrays.asList("apple", "banana", "cherry", "date", "fig"));
        Iterator<String> ite = hs.iterator();
        System.out.println(hs);
        hs.add("banana");
        System.out.println(hs.size());
        while (ite.hasNext()) {
            System.out.println(ite.next());
            
        }
    }
}
