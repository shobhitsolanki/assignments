import java.util.Arrays;
class SequentialSearch {
    public static boolean contains(int[] a, int b){
        for (int i : a) {
            if (i==b){
                return true;
            }
        }
        return false;
    }
}

public class SequentialSearchTest {

    public static void main(String args[]) {
        int[]a = {1, 2, 3, 4, 5, 7, 17,  19 };

       System.out.println(Arrays.toString(a));
        System.out.println("is number 4 present ? " + SequentialSearch.contains(a, 4));
        System.out.println("is number 10 present ? " + SequentialSearch.contains(a, 10));
    }

}