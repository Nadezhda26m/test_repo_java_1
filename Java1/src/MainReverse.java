import java.util.Collections;
import java.util.LinkedList;

public class MainReverse {
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>();
        for (int i = 0; i < 15; i++) {
            myList.add(i + 1);
        }
        System.out.println(myList);
        // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]

        // Вариант 1
        Collections.reverse(myList);
        System.out.println(myList);
        // [15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
    }
}
