import java.util.*;
public class FirstDigit{
	public static void main(String []args){
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Number = ");
		num = sc.nextInt();
		while(num/10!=0) num/=10;
		System.out.println(num);
	}
}
