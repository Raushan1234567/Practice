package com.ui;
import java.time.LocalDate;
import java.util.*;

import com.dao.*;
import com.dto.*;

import jaaftercom.excep.Norecordfoun;
import jaaftercom.excep.Somethingwent;
public class Main {

	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		
		int c;
		
		do {
			
	System.out.println("1. Add");
	System.out.println("2. Update");
	System.out.println("3. Delte");
	System.out.println("4. print");
	System.out.println("5. Search");
	System.out.println("0. Exit");

	c=sc.nextInt();
	
	switch(c) {
	case 1:
		Addui(sc);
		break;
	case 2:
		Updateui(sc);
		break;
	case 3:
		Deleteui(sc);
		break;
	case 4:
		Printui(sc);
		break;
	case 5:
	Printinrangeui(sc);
		break;
	case 0:
		System.out.println("thanks");
		break;
	default :
		System.out.println("Invalisd selection");
		break;
	}
		}while(c!=0);
		sc.close();
		

	}

 static void Printinrangeui(Scanner sc) {
	 System.out.println("Enter dob1");
		LocalDate dob=LocalDate.parse(sc.next());
		 System.out.println("Enter dob2");
			LocalDate dob1=LocalDate.parse(sc.next());
		
		Interface a1 = new Imple();
		
		try {
			Author2 b=a1.Prinbyrange(dob,dob1);
			System.out.println(b);
		} catch (Somethingwent e) {
		
			System.out.println("No record found");
		}
			
		
	}

private static void Printui(Scanner sc)  {
	System.out.println("Enter id");
	String id=sc.next();
	
	Interface a1 = new Imple();
	
	
	try {
		Author2 b=a1.Printy(id);
		System.out.println(b);
	} catch (Somethingwent|Norecordfoun e) {
	
		System.out.println("No record found");
	}
		
	}

private static void Deleteui(Scanner sc) {
	System.out.println("Enter id");
	String id=sc.next();
	
	Interface a1 = new Imple();
	
	
	
	try {
		a1.Delete(id);
	} catch (Somethingwent e) {
	
		System.out.println("Some thing went rong ");
	}
		
	}

static void Updateui(Scanner sc) {
		System.out.println("Enter id");
		String id=sc.next();
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter dob");
		LocalDate dob=LocalDate.parse(sc.next());
		
		Author2 a=new Author2(id,name,dob);
		
		Interface a1 = new Imple();
		
		try {
			a1.Update(a);
		} catch (Somethingwent e) {
			// TODO Auto-generated catch block
			System.out.println("Some thing went rong ");
		}
		
		
	}

		
	

	static void Addui(Scanner sc) {
		
		System.out.println("Enter id");
		String id=sc.next();
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter dob");
		LocalDate dob=LocalDate.parse(sc.next());
		
		Author2 a=new Author2(id,name,dob);
		
		Interface a1 = new Imple();
		
		try {
			a1.add(a);
		} catch (Somethingwent e) {
			// TODO Auto-generated catch block
			System.out.println("Some thing went rong ");
		}
		
		
	}

}
