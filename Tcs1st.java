import java.util.Scanner;
public class Tcs1st{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int Number  = sc.nextInt();
    int op = tableSum(Number);
    System.out.println(op);
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
