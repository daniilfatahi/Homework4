import com.sun.xml.internal.fastinfoset.util.ValueArray;

public class Task3 {
    public static void main(String[] args) {

        int [] arr = {12, 2, 3, 4, 2, 7, 8, 8, 3};

        int min = arr[0];

        for(int i = 0; i < arr.length;i++){

            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println(min);
    }
}
