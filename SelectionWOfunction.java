import java.util.Arrays;
public class SelectionWOfunction{
  public static void main(String[]args){
    int[] arr = {56,34,12,43};
    for(int i =0; i<=arr.length-1; i++){
      int mini = i;
      for(int j = i; j<=arr.length-1; j++){
        if(arr[j]<arr[mini]){
          mini = j;
        }
      }
      int temp = arr[mini];
        arr[mini] = arr[i];  
        arr[i] = temp;  
    }
    System.out.print(Arrays.toString(arr));
  }
}
