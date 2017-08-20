package quickk;

import java.util.Scanner;

public class Toyota extends Car {
Toyota(int s, String c, String f)
{

	super(s,c, f);
}
public void run()
{     System.out.println("This is a Toyota Engine!");
	}
public void TireSize(){
	System.out.println("Let's check your Toyota tires? Choose 1-3..1 Best, 3 Worst");
	Scanner keyboard = new Scanner(System.in);
	int u = keyboard.nextInt();
	switch(u){
	case 1: 
		if(u == 1);
		System.out.println("You're tires are great!");
		break;
	case 2: if(u == 2);
	System.out.println("You might want to call Toyota soon");
	    break;

	default: 
		System.out.println("You might want to call Toyota to fix this!");

	}
}
public void Engine(){
	System.out.println("Is your car on? Choose 0 for off, 1 for on, or 2 for Auxillary.");
	Scanner keyboard = new Scanner(System.in);
	int u = keyboard.nextInt();
	switch(u)
	{
	case 1:
		if(u == 1)
		{System.out.println("Car is on!");
		break;}
	case 2 :
		if(u == 2);
		System.out.println("Toyota in AuxMode");
		break;
	default : 
		{System.out.println("Car is off!");
	break;}
	}

		
	}
public void TopSpeed(int s){
	int top;
    s = 140;
	System.out.println("Who's faster, Yours or mine? Enter your Toyota top speed.");
	Scanner keyboard = new Scanner(System.in);
	top = keyboard.nextInt();
	if(top >= s)
		System.out.println("Your car is faster, You must have a Camry Your Top Speed =" +top);
	else			
		System.out.println("Better Luck next time! This my Top Speed =" +s);

	
}
public void CarType(String c){
	String g = "Van";
    c = "Sedan";
    String a = "Convertiable";
    String top;
	System.out.println("Enter whether your Toyota a sedan, a van or a convertible.");
	Scanner keyboard = new Scanner(System.in);
	top = keyboard.nextLine();
	switch(top){
	default: if(top.equals(c));
	System.out.println("A "+c+" is perfect to fit all your friends");
	break;
	case "van": if(top.equals(g));
	System.out.println("A "+g+" is perfect for all the kids!");
	break;
	case "convertible": if(top.equals(a));
	System.out.println("A "+a+" is perfect to drop the top with your friends!");
	break;
	}	
	}
public void FeulType(String f){
	System.out.println("What type of feul you take? Enter Plus or Unleaded ");
		Scanner keyboard = new Scanner(System.in);
		String top;
		f = "Unleaded";
		String p = "Plus";
		String i = "medium gas tank";
		String o = "small gas tank";
		top = keyboard.nextLine();
		switch(top){
		default: if(top.equals(f));
		System.out.println("It's"+f+"cool");
		break;
		case "Plus": if(top.equals(p));
		System.out.printf( p + "Aewsome"+ i);
		break;


}
}}


