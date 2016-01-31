package game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; // I use scanner because it's command line.

public class Login {
	public void run() throws FileNotFoundException {
	    
	    Scanner keyboard = new Scanner (System.in);
	    String inpUser = keyboard.nextLine();
	    String inpPass = keyboard.nextLine(); // gets input from user
	    
	    Scanner scan = new Scanner (new File("/Users/Joao/Documents/DAS/Interfaces2/DasGame/src/login.txt"));
	    String user = scan.nextLine();
	    String pass = scan.nextLine(); // looks at selected file in scan
	    
	    if (inpUser.equals(user) && inpPass.equals(pass)) {
	        System.out.print("your login message");
	    } else {
	        System.out.print("your error message");
	    }
	}
} 