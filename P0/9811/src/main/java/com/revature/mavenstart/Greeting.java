package com.revature.mavenstart;


import java.util.InputMismatchException;
import java.util.Scanner;

import com.revature.UIwelcome.WelcomeUI;

public class Greeting {

	public static void main(String[] args) {
		
		String Greet= "Greetings, customer. Welcome to Fysh Rewards Game Center.";
		String BeenHereBefore = "Please Select from the following options:" + "\n"+ " If you have an account Type the number '1'."
				+ " "+ "\n"+ "Otherwise if you would like to set up an account with us please type the number '2'.";
				
		System.out.println(Greet);
		
		System.out.println(BeenHereBefore);
		
		Scanner scanner = new Scanner(System.in);
		boolean isUserDone = true;
		
		while (isUserDone) {
			int userSelection =WelcomeUI.handleUserSelection(scanner);

			switch (userSelection) {
			case 1:
				System.out.println("Great Please Enter your User Name");
				//Case1 additional options to be Created.
				try {
					userSelection = scanner.nextInt();
			//Username database match code in class Username
					
					boolean validUser = true;
				
				if(validUser = true) {
					System.out.println("Please enter your Password");
					
				}
				else validUser = false;
				
				}
				catch(InputMismatchException e) {
					System.out.println("Sorry, that username could not be found.");
				}
				
				break;
			case 2:
				System.out.println("Ok, Lets Get you signed up. Choose your username");
				//Case2 options to be Created
				try {
					userSelection = scanner.nextInt();
				}catch(InputMismatchException e) {
					System.out.println("Sorry, that username is taken.");
				break;
			
			}
		}
		scanner.close();
		}
		
		
		
	}

	private static void FindUser() {
		// TODO Auto-generated method stub
		
	}
	}

