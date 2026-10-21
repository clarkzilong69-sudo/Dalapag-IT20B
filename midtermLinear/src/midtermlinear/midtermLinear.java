
package midtermlinear;

public class midtermLinear {

    public static int search(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 4, 6, 7};

        int result = search(arr, 7);
            

        if (result >= 0) {
            System.out.println(arr[result] + " is  found at Index: " + result );

        } else {
            System.out.println("Element not Found");
        }
    }

}