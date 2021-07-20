package com.revature.assesment;

import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int income=0;
		String gender=null;
		Scanner sc=new Scanner(System.in);
		
		gender=sc.nextLine();
		income=sc.nextInt();
		int year=sc.nextInt();
		if(gender.equals("female") && (year>=2020 && year<=2021)){
			if(income>=0 && income<=190000) {
			System.out.println("No Tax");
			}
			else if(income>=190001 && income<=500000) {
			System.out.println("10% Tax");
			}
			else if(income>=500001 && income<=800000) {
				System.out.println("20% Tax");
			}
			else
			{
				System.out.println("30 %Tax");
			}
		}
		else if(gender.equals("general"))
		{
			
				if(income>=0 && income<180000) {
				System.out.println("No Tax");
				}
				else if(income>=1800001 && income<=500000) {
				System.out.println("10% Tax");
				}
				else if(income>=500001 && income<=800000) {
					System.out.println("20 %Tax");
				}
				else
				{
					System.out.println("30 %Tax");
				}
			
		}
		else
		{
			System.out.println("Inavlid gender");
		}
	}
}
