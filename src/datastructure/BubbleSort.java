package datastructure;

import java.util.Arrays;

public class BubbleSort
{
    void bubbleSort(int arr[])
    {
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
        {

        }
            System.out.print(Arrays.toString(arr) + " ");
            System.out.println();
    }

    public static void main(String[] args)
    {
        BubbleSort ob = new BubbleSort();
        int arr[] = {34, 18, 19, 22, 10, 19 };
        System.out.println("Before Bubble Sort Array" );
        ob.bubbleSort(arr);
        System.out.println("After Bubble Sorted array");
        ob.printArray(arr);
    }
}
