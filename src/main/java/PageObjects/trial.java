package PageObjects;

public class trial {

    public static void main(String args[])
    {
        int arr[]= {1, 4, 3, 6, 8};
        sumArray(arr);

    }

    public static void sumArray(int[] arr)
    {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            System.out.println("sum of array:"+ sum);
        }




}
