import java.util.*;
public class Printpattern1{
	public static void PrintPattern(int num){
		for(int i=0;i<num;i++){
			for(int j=0;j<=i;j++){
				if(i%2==0) System.out.print("* ");
				else System.out.print("# ");	
			}
			System.out.println();
		}
	}
	public static void main(String []args){
		int num;
		System.out.print("Enter the number of rows : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		PrintPattern(num);
	}
}
