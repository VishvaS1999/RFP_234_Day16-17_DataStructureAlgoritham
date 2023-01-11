package datastructure;

import java.util.Arrays;

public class MergeSort
{
    public static void sortingAnArrayUsingMergeSort(int arr[], int start, int mid, int end){
        int left = mid - start + 1;
        int right = end - mid;
        int arrayLeft[] = new int [left];
        int arrayRight[] = new int[right];
        for(int i = 0; i< left; ++i)
            arrayLeft[i] = arr[start + i];
        for(int j = 0; j< right; ++j)
            arrayRight[j] = arr[mid + 1+ j];
        int i = 0, j = 0;
        int k = start;
        while(i< left && j< right)
        {
            if(arrayLeft[i] <= arrayRight[j])
            {
                arr[k] = arrayLeft[i];
                i++;
            }
            else
            {
                arr[k] = arrayRight[j];
                j++;
            }
            k++;
        }
        while(i< left)
        {
            arr[k] = arrayLeft[i];
            i++;
            k++;
        }
        while(j< right)
        {
            arr[k] = arrayRight[j];
            j++;
            k++;
        }
    }
    public static void sortingArray(int arr[], int start, int end)
    {
        if(start < end)
        {
            int mid = (start +end)/2;
            sortingArray(arr, start, mid);
            sortingArray(arr , mid+1, end);
            sortingAnArrayUsingMergeSort(arr, start, mid, end);
        }
    }
    public static void main(String args[])
    {
        int arr[] = {23,32,54,11,102,223,1,54};
        System.out.println("Before Sorting Element :\n" +Arrays.toString(arr));
        System.out.println();
        MergeSort mergeSort = new MergeSort();
        sortingArray(arr, 0, arr.length-1);
        System.out.println("Sorted array using Merge Sort :");
        for(int i =0; i<arr.length;i++)
        {

        }
        System.out.print(Arrays.toString(arr)+" ");
    }
}
