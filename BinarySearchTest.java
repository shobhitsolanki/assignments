import java.util.Arrays;
class BinarySearch {
    public static boolean contains(int[] a, int b) {
        if (a.length == 0) {
            return false;
        }
        int low = 0;
        int high = a.length-1;

        while(low <= high ) {
            int middle = (low+high) /2;
            if (b> a[middle] ){
                low = middle +1;
            } else if (b< a[middle]){
                high = middle -1;
            } else { // The element has been found
                return true;
            }
        }
        return false;
    }
}

public class BinarySearchTest {

    public static void main(String args[]) {
        int[]a = {1, 2, 3, 4, 5, 7, 17,  19 };

       System.out.println(Arrays.toString(a));
        System.out.println("is number 4 present ? " + BinarySearch.contains(a, 4));
        System.out.println("is number 10 present ? " + BinarySearch.contains(a, 10));
    }

}