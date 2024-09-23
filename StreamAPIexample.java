import java.util.Arrays;
import java.util.List;

public class StreamAPIexample{
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(23,50,10,78,13,46,66,82,34,50);
        int sum_of_even = lst.stream().filter(n->n%2==0).mapToInt(Integer::intValue).sum();
        System.out.println("Sum of even numbers ="+sum_of_even);
    }
}