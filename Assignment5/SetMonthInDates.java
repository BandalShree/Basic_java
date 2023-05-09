package com.java;
import java.util.Scanner;
public class SetMonthInDates {
	public static void main(String[] args) {
		int date,month;
		System.out.print("Enter the date : ");
		Scanner sc = new Scanner(System.in);
		date = sc.nextInt();
		System.out.print("Enter the month : ");	
		month = sc.nextInt();
		System.out.println((date&~(240)) | (month<<5));		
	}
}
