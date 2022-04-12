public class BubbleSort {

    public static void main(String args[]) {
        int arr[] = {64, 34, 25, 69, 22, 420, 90, 29, 3, 78, 8};
        System.out.println("Sorted Array:");
        printArray(bubbleSort(arr));
    }


    static int[] bubbleSort(int arr[]) {
        int n = arr.length;
        //repeats the process with all numbers
        for (int j = 0; j < n - 1 ; j++) {
            //moves each individual number up
            for (int i = 0; i < n - 1; i++)
                if (arr[i] > arr[i + 1]) {
                    //stores bigger number in temp and moves lower number down a slot
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
        }
        //returns sorted numbers
        return arr;
    }
//prints any array
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
