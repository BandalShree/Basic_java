import java.util.*;
public class Printpattern2{
	public static void PrintPattern(int num){
		for(int i=0,count=1;i<num;i++,count=1){
			for(int j=0;j<=num*2;j++){
				if(j>=num-i && j<=num-1) {
					System.out.print(count+" ");
					count++;
				}
				else if(j>=num-i && count!=0){
					System.out.print(count+" ");
					count--;
				}	
				else System.out.print("  ");
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
