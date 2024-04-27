//Suppose array is [5,4,3,2,1]
//Selection Sort
import java.util.*;
import java.util.Arrays;
public class Selection{
  public static void main(String[] args){
    int[] array = {5,4,3,2,1};
    int op = selectElement(array);
    System.out.print(Arrays.toString(op));
  }
  public static int selectElement(int arr){
    for(int i = 0; i<n-2; i++){
      int mini = i;
      for(int j = 0; j<n-1; j++){
        if(arr[j]<arr[mini]){
         //mini = j;
          int temp = arr[mini];
          arr[mini] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }
}
