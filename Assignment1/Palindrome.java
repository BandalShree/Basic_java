import java.util.*;
public class Palindrome{
	public static void main(String []args){
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Number = ");
		num = sc.nextInt();
		for(int temp=num,rev=0;;num/=10) {
			rev=(rev+num%10)*10;
			if(num/10==0){	
			System.out.println((temp==rev/10)?"A Palindrome":"Not a Palindrome");
				break;
			}
		}
	}
}
