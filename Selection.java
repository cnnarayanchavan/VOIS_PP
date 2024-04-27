//Suppose array is [5,4,3,2,1]
//Selection Sort
//import java.util.Arrays;
//import java.util.*;
public class Selection{
  public static void main(String[] args){
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Define size of array : ");
    // int number = sc.nextInt();
    // int[] array = new int[number];
    // for (int i = 0; i < array.length; i++) {
    //   array[i]=sc.nextInt();
    // }
    // for (int i = 0; i < array.length; i++) {5
    //   System.out.print(array[i] + " ");
    // }
    int[] array = {5,4,3,2,1};
    sortElement(array);
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
 }

 public static void sortElement(int arr[]){
  for (int i = 0; i < arr.length-1; i++) {
    int min = i;
    
    for (int j = 0; j < arr.length-1; j++) {
      if(arr[j] < arr[min]){
        min=j;
      }
      int temp = arr[min];
      arr[min] = arr[i];
      arr[i] = temp;
    }
  }
 }
}
