public class SelectionWOfunction{
  public static void main(String[]args){
    int[] arr = {5,4,3,2,1};
    for(int i =0; i<arr.lentgh-1; i++){
      int mini = i;
      for(int j =0; j<arr.length-1; j++){
        if(arr[j]<arr[mini]){
          mini = j;
        }
        int temp = arr[mini];
        arr[mini] = arr[i];  
        arr[i] = temp;
      }
    }
    System.out.print(Arrays.toString(arr));
  }
}
