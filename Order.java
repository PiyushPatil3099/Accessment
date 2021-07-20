package com.revature.assesment;

import java.util.Scanner;

import com.revature.assesment.material.Accessories;
import com.revature.assesment.material.Laptops;

public class Order {
	
	public void placeOrder() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eanter what you wanna(Laptop/Accessories)=");
		String type=sc.next();
		if(type.equals("Laptop")) {
			System.out.println("Eanter the quantity)=");
			int quantity=sc.nextInt();
			if(Laptops.checkLowOrderLevelQuantityLaptops(quantity)) {
				generateInvoice();
			}
			else
			{
				requestForMaterial();
			}
		}
		if(type.equals("Accessories")) {
			System.out.println("Eanter the quantity)=");
			int quantity=sc.nextInt();
			if(Accessories.checkLowOrderLevelQuantityAccessories(quantity)) {
				generateInvoice();
			}
			else
			{
				requestForMaterial();
			}
		}
	}
	public void generateInvoice() {
		System.out.println("Invoice generated");
	}
	public void requestForMaterial() {
		System.out.println("Not sufficient stock requested to add stock");
	}
	public static void main(String[] args) {
		Laptops l1=new Laptops(101,"LenevoIdeaPad356",50000,'l');
		Laptops l2=new Laptops(102,"LenevoIdeaPad357",60000,'l');
		Laptops l3=new Laptops(103,"LenevoIdeaPad358",70000,'l');
		Laptops l4=new Laptops(104,"LenevoIdeaPad359",80000,'l');
		Laptops l5=new Laptops(105,"LenevoIdeaPad360",90000,'l');
		
		Accessories s1=new Accessories(201,"Mouse",1500,'a');
		Accessories s2=new Accessories(202,"Keyboard",1000,'a');
		Accessories s3=new Accessories(203,"Harddisk",16500,'a');
		Accessories s4=new Accessories(204,"Joystick",1700,'a');
		Accessories s5=new Accessories(205,"Router",11500,'a');
		Accessories s6=new Accessories(206,"Switch",1590,'a');
		Accessories s7=new Accessories(207,"TwistedCable",500,'a');
		Accessories s8=new Accessories(208,"Usbcode",1200,'a');
		Accessories s9=new Accessories(209,"pendrice",700,'a');
		Accessories s10=new Accessories(210,"donagal",800,'a');
			
		new Order().placeOrder();
	}

}
