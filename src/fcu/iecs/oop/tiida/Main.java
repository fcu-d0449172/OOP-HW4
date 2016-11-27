package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int number;
		int loop;
		NissanTiida nt=new NissanTiida();
		System.out.println("Please enter a number");
		number=new Scanner(System.in).nextInt();
		for(loop=1;loop<=number;loop++)
		{
			System.out.printf("%d\n",loop);
			nt.NissanTiida(loop);
			System.out.printf("\n");
		}
		
	}
	

}