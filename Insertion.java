import java.util.*;
import java.util.Arrays;
public class Insertion{
  public static void main(String[]args){
    int[] arr = {56,3,53,34,6,4}; //{5,3,4,2,1};
    for(int i = 0; i < arr.length-1; i++){
      for(int j = i+1; j>0; j--){
        if(arr[j]<arr[j-1]){
          int temp = arr[j];
          arr[j] = arr[j-1];
          arr[j-1] = temp;
        }
      }
    }
    System.out.print(Arrays.toString(arr));
  }
}
