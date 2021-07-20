package com.revature.assesment;

import java.util.Scanner;

public class CalculateEggs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int gross=temp/144;
		temp=temp-(144*gross);
		int dozen=temp/12;
		temp=temp-(12*dozen);
		
		System.out.println("Your no of eggs is "+gross+" gross, "
				+dozen+"dozen,and "+temp);
		

	}

}
