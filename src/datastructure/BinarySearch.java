package datastructure;

import java.util.Arrays;

public class BinarySearch
{
    static int binarySearch(String[] arr, String search)
    {
        int l = 0, r = arr.length - 1;

        while (l <= r) {

            int m = (l + r)/2;
            int res = search.compareTo(arr[m]);

            if (res == 0)
                return m;
            if (res > 0)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }


    public static void main(String[] args) {

        String[] arr = { "Vishva", "Shyam", "Shivani", "Avadh" };
        String search = "Shyam";

        int result = binarySearch(arr, search);

        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at " + "index " + result);
    }
}
