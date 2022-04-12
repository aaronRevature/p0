package com.revature.UIwelcome;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WelcomeUI {
	
	public static int handleUserSelection(Scanner scanner) {
		int userSelection = 0;
	
	try {
		userSelection = scanner.nextInt();
	}catch(InputMismatchException e) {
		System.out.println("Sorry, that username is taken.");
	}
	scanner.nextLine(); // Leaving this here as there is a newline character in the stream
	return userSelection;
}
}
