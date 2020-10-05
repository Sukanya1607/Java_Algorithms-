/** Implementation of Bubble sort in java */

class BubbleSort
{
    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
 
    void arrPrint(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 

    public static void main(String args[])
    {
        BubbleSort sort = new BubbleSort();
        int arr[] = {21, 34, 02, 4, 56, 46};
        sort.bubbleSort(arr);
        System.out.println("Array After Sorting is - ");
        sort.arrPrint(arr);
    }
}