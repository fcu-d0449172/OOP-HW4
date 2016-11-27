package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		PasswordEncorder pw = new PasswordEncorder();
		int flag=1;
		
		
		Scanner input = new Scanner(System.in);
		while(flag==1){
			System.out.println("Please enter a password:");
			String password = input.nextLine();
			
			switch(password){
			case "exit" :
				flag = 0;
				break;
			default :
				password = pw.encode(password);
				System.out.println(password);
				break;
			}
		}
		input.close();
		
	}

}