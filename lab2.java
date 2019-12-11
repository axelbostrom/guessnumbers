package lab2;
import java.util.Scanner;

public class lab2
{
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int MAX = 100;
		int MIN = 0;
		int nummerett;
		int nummertvå;
		int antalförsök = 1;
		boolean vinst = false;
		
		//Inmatning spelar 1
		
		System.out.println("Spelare 1: Ange ett nummer mellan 0-100.");
		nummerett = scan.nextInt();
		
		while(nummerett < MIN || nummerett > MAX) {
			System.out.println("Ogiltigt nummer, ange ett nummer mellan 0-100.");
			nummerett = scan.nextInt();
		}
		
		//Tömmer terminalen
		
		for(int i = 0; i < 30; i ++) {
				System.out.println("");
		}
		
		//Inmatning spelare 2
		
		System.out.println("Spelare 2: Försök att gissa ett nummer mellan 0-100!");
		nummertvå = scan.nextInt();
		
		while(nummertvå < MIN || nummertvå > MAX) {
			System.out.println("Ogiltigt nummer, ange ett nummer mellan 0-100.");
			nummertvå = scan.nextInt();
			}
		
		//Räknare
		
		while (vinst == false)
		{
			
			if (nummerett == nummertvå) {
				System.out.println("Rätt! Grattis din LINGare det tog bara " + antalförsök + " försök.");
				break;
			}
				
				else if (nummerett > nummertvå) {
					System.out.println("För lågt! Gissa igen.");
					
			}
				else if (nummerett < nummertvå) {
					System.out.println("För högt! Gissa igen.");
			}
			
			nummertvå = scan.nextInt(); //Inmatningsscanner om gissning är fel
			antalförsök++;	//Räknare för antal försök
		}
	}
}