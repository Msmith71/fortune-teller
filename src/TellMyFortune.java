import java.util.Scanner;

public class TellMyFortune {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				
		System.out.println("Greetings, welcome to the fortune teller.");
		System.out.println("I will tell you your fortune, but first I need your first name.");
		String fName =  input.nextLine();
		if (fName.equalsIgnoreCase("quit")) {
			System.exit(0);
		}
		
		System.out.println("And now your last name.");
		String lName = input.nextLine();
		if (lName.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		
		System.out.println("How old are you?");
		int age =  input.nextInt();

		
		System.out.println("In which month were you born, please enter the month number");
		int birthMonth = input.nextInt();
		
		
		System.out.println("What is your favorite ROYGBIV color? If you dont know what 'ROYGBIV' is type 'help'.");
		String favColor = input.next();
		while (favColor.equalsIgnoreCase("help")) {
			System.out.println("ROYGBIV stands for Red Orange Yellow Green Blue Indigo Violet.");
			System.out.println("What is your faveorite ROYBIV color?");
			favColor = input.next();
		}
			
		
		System.out.println("How many siblings do you have?");
		int siblings = input.nextInt();
		input.close();
		
		System.out.print(fName + " " + lName);
		//Age
		if (age % 2 == 0) {
			System.out.print(" will retire in 17 years with");
		} else {
			System.out.print(" will retire in 12 years with");
		}
		
		//Birth Month response
		if (birthMonth <= 4 && birthMonth>= 1) {
			System.out.print(" $3.50 in the bank,");
	} else if (birthMonth >= 5 && birthMonth <= 8 ) {
		System.out.print(" a small loan of a million dollars in the bank,");
	} else if (birthMonth >= 9 && birthMonth <= 12) {
		System.out.print(" $156,656,537 in the bank,");
	} else {
		System.out.print(" $0.00 in the bank,");
	}
		
		//Siblings
		if (siblings <0) {
			System.out.print("a vacation home in the Fukushima Power Plant in Japan,");
		} else if (siblings == 0) {
			System.out.print("a vacation home in Austin, Texas,");
		} else if (siblings == 1) {
			System.out.print("a vacation home in Orlando, Florida,");
		} else if (siblings == 2) {
			System.out.print("a vacation home in Munic, Germany,");
		} else if (siblings == 3) {
			System.out.print("a vacation home in Narnia,");
		} else if (siblings > 3) {
			System.out.print("a vacation home in London, England,");
		}
		
		//Colors
			if (favColor.equalsIgnoreCase("red")) {
				System.out.print(" and travel on a flying Pegasus.");
			} else if (favColor.equalsIgnoreCase("orange")) {
				System.out.print(" and travel in a Toyota Prius.");
			} else if (favColor.equalsIgnoreCase("yellow")) {
				System.out.print(" and travel on a hover board.");
			} else if (favColor.equalsIgnoreCase("green")) {
				System.out.print(" and travel in a TF-X terrafugia flying car.");
			} else if (favColor.equalsIgnoreCase("blue")) {
				System.out.print(" and travel in a Bullet Train.");
			} else if (favColor.equalsIgnoreCase("indigo")) {
				System.out.print(" and travel in a Mercedes Benz.");
			} else if (favColor.equalsIgnoreCase("violet")) {
				System.out.print(" and travel on a Great White Shark.");
			}
				
	}

}
