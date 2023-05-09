import java.util.*;
public class Fibonacci{
	public static void main(String []args){
		int num;
		System.out.print("Enter the number :");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for(int i=0,j=1;num!=0;num--,j=2*j+i-(i=j)) System.out.print(i+" ");
	}
}
