package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String userName;
		String userSurname;
		String userColor;
		String userDayofBirth;
		String userMonthofBirth;
		String userYearofBirth;
		int sumDateofBirth;
		
		System.out.print("Your Name: ");
		userName = in.nextLine();
//		System.out.println(userName);	
		System.out.print("Your Surname: ");
		userSurname = in.nextLine();
		System.out.print("Your Fav Colour: ");
		userColor = in.nextLine();
		System.out.print("Your day of birth as number: ");
		userDayofBirth = in.nextLine();
		System.out.print("Your month of birth as number: ");
		userMonthofBirth = in.nextLine();
		System.out.print("Your year of birth as number: ");
		userYearofBirth = in.nextLine();
		in.close();
		
		int dayOfBirth = Integer.valueOf(userDayofBirth);
		int monthOfBirth = Integer.valueOf(userMonthofBirth);
		int yearOfBirth = Integer.valueOf(userYearofBirth);
		sumDateofBirth = dayOfBirth + monthOfBirth + yearOfBirth;
		
		System.out.print("Your password is: "+userName+"-"+userSurname+"-"+userColor+"-"+sumDateofBirth);
		
	}

}
