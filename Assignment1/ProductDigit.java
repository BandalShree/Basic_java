import java.util.*;
public class ProductDigit{
	public static void main(String []args){
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Number = ");
		num = sc.nextInt();
		if(num<0) num = -num;
		for(int sum=1;;num/=10) {
			sum*=num%10;
			if(num/10==0){	
				System.out.println("Product of digits ="+sum);
				break;
			}
		}
	}
}
