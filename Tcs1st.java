import java.util.Scanner;
public class MyClass{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int Number  = sc.nextInt();
    int op = tableSum(Number);
  }

  public static int tableSum(int num){
    int sum = 0;
    for(int i = 0; i<=10; i++){
      int asn = num * i;
      sum += ans;
    }
    return sum;
  }
}
