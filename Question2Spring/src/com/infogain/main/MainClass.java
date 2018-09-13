package com.infogain.main;

import java.util.Scanner;

import com.infogain.beans.Product;
import com.infogain.dao.DAOOperation;

public class MainClass {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your choice ?");
	System.out.println("1:add product ");
	System.out.println("2:sale products");
	System.out.println("3:exit ");
	
	int ch=Integer.parseInt(sc.nextLine());
	DAOOperation dao=new DAOOperation();
	switch(ch){
	case 1: 
		
	System.out.println(" enter product id");
	int pid=Integer.parseInt(sc.nextLine());
	System.out.println(" enter product name");
	String pName=sc.nextLine(); 
	System.out.println(" enter product cost");
	int pcost=Integer.parseInt(sc.nextLine());
	System.out.println(" enter product quantity");
	int quantity=Integer.parseInt(sc.nextLine());
		dao.addProducts(pid,pName,pcost,quantity);
		break;
	case 2:
		System.out.println(" enter product id");
		int id=Integer.parseInt(sc.nextLine());
		dao.searchProduct(id);
	 break;
	case 3:
		System.out.println(" enter product id");
		int pid1=Integer.parseInt(sc.nextLine());
		System.out.println(" enter product quantity");
		int uSold=Integer.parseInt(sc.nextLine());
		dao.updateProduct(pid1, uSold);
		 break;
  default :
	    System.out.println("enter the correct choice!!!!!!!!!");
		
	
	
	}
	
	
	
}
}//end class
