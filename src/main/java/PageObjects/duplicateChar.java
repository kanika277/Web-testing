package PageObjects;

public class duplicateChar {
    public static void main (String args[])
    {
      String arr = "kanikayvwzgy";
//      int aa = 0;
        char[] arr1 = arr.toCharArray();

        System.out.println("Duplicate character are: ");
        for(int i=0; i<arr.length(); i++) {
            for (int j = i+1; j < arr.length(); j++) {
                if (arr1[i] == arr1[j]) {
                    System.out.println(arr1[j]);
//                    aa++;
                    break;
                }
            }
        }


    }
}
