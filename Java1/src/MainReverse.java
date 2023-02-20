import java.util.LinkedList;

public class MainReverse {
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>();
        for (int i = 0; i < 15; i++) {
            myList.add(i + 1);
        }
        System.out.println(myList);
        // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
    }
}
