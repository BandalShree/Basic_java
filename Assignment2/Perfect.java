import java.util.*;
public class Perfect{
	public static void main(String []args){
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("N = ");
		num = sc.nextInt();
		for(int i=2,sum=1;i<=num/2;i++){
			if(num%i==0){
				sum+=i;
				if(i==num/2){
					System.out.println((num==sum)?"Perfect Number":"Not A Perfect Number");
					break;
				}
			}		
		}
	}
}
