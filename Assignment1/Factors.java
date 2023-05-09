import java.util.*;
public class Factors{
	public static void main(String []args){
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("N = ");
		num = sc.nextInt();
		System.out.print("Factors = 1 ");
		for(int i=2;i<=num/2;i++)
			if(num%i==0)
				System.out.print(i+" ");
		System.out.println(num);		
	}
}
