import java.util.Scanner;
public class Tcs1st{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int Number  = sc.nextInt();s
    int op = tableSum(Number);
  }

  public static int tableSum(int num){
    int sum = 0;
    for(int i = 0; i<=10; i++){
      int ans = num * i;
      sum += ans;
    }
    return sum;
  }
}
