package quickk;

import java.util.Scanner;

public class Chevy extends Car {
	Chevy(int s, String c, String f)
	{

		super(s,c, f);
	}
	public void run(){
		 System.out.println("This is a Chevrolet engine");
	
	  }
	public void TireSize(){
		System.out.println("How's the wear on your Chevy tires? Choose 1-3..1 Best, 3 Worst");
		Scanner keyboard = new Scanner(System.in);
		int u = keyboard.nextInt();
		switch(u){
		case 1: 
			if(u == 1);
			System.out.println("These Chevrolet tires are great!");
			break;
		case 2: if(u == 2);
		System.out.println("You might want to get those checked by Chevrolet soon.");
		    break;
	
		default: 
			System.out.println("We can call Chevy to fix this today!");
		}
		}
	
	
	public void Engine(){
		System.out.println("Is your car on? Choose 0 for off or 1 for on.");
		Scanner keyboard = new Scanner(System.in);
		int u = keyboard.nextInt();
		switch(u)
		{
		case 1:
			if(u == 1)
			{System.out.println("Car is on!");
			break;}
		default : 
			{System.out.println("Car is off!");
		break;}
}
	}

public void TopSpeed(int s){
int top;
s = 160;
System.out.println("Who's faster, Yours or mine? Enter your Chevrolet car top speed.");
Scanner keyboard = new Scanner(System.in);
top = keyboard.nextInt();
if(top >= s)
	System.out.println("Your car is faster, You must have a Corvette Your Top Speed =" +top);
else			
	System.out.println("Better Luck next time! This is my Top Speed =" + s);


}
public void CarType(String c){
String g = "Silverado";
String p = "Colorado";
c = "Sedan";
String a = "Corvette";
String top;
System.out.println("Enter whether your Chevy is a Sedan, a Silverado, a Corvette, or Colorado.");
Scanner keyboard = new Scanner(System.in);
top = keyboard.nextLine();
switch(top){
default: if(top.equals(c));
System.out.println("A "+c+" is perfect for space");
break;
case "Silverado": if(top.equals(g));
System.out.println("A "+g+" is perfect for mobile consrtuction!");
break;
case "Corvette": if(top.equals(a));
System.out.println("A "+a+" is perfect fit for you and that special someone!");
break;
case "Colorado": if(top.equals(p));
System.out.println("A "+p+" is perfect to for off road trucking!");
break;
}
	
}
public void FeulType(String f){
	System.out.println("What type of feul you take? Enter Premium, Plus, or Unleaded ");
		Scanner keyboard = new Scanner(System.in);
		String top;
		f = "Unleaded";
		String p = "Plus";
		String pp = "Premium";
		String e = "it's a large gas tank";
		String i = "it's a medium gas tank";
		String o = "it's a small gas tank";
		top = keyboard.nextLine();
		switch(top){
		default: if(top.equals(f));
		System.out.printf("It's"+ f +"Nice" + o);
		break;
		case "Plus": if(top.equals(p));
		System.out.printf("It's"+ p +"Aewsome" + i);
		case "Premium": if(top.equals(pp));
		System.out.printf("It's"+ pp +"Cool" + e);
		break;

}
}
}
