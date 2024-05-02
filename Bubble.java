import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {56,34,12,46};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp; 
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

//very simple if first element is less then second then just SWAP pal!!!!

//Taking about the time complexity : similar too selection sort here algo running for n, n-1, n-2.....  similar to n natural numbers 

//So the worst == o(n^2)

//And the Best == o(n)  works only if the array is in ascending order means it is already sorted no need to further  check after one check
