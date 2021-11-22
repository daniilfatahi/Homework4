import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task41 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,4,2,6,2,8);

        System.out.println("Not sorted arr:" + list);
        Collections.swap(list, 1,6);
        System.out.println("After swap:" + list);




    }
}