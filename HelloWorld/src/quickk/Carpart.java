package quickk;

import java.util.Scanner;
public class Carpart { 
	protected int speed;
	protected String car = "Car";
	Carpart(int s, String c){
		car = c;
		speed = s;
	}
	private int u;
	
	  public int getU() {
		return u;
	}

	public void setU(int u) {
		this.u = u;
	}

	public void run(){
		 System.out.println("This is a good engine");
	
	  }
	public void TireSize(){
		System.out.println("How's the wear on your tires? Choose 1-3..1 Best, 3 Worst");
		Scanner keyboard = new Scanner(System.in);
		u = keyboard.nextInt();
		switch(u){
		case 1: 
			if(u == 1);
			System.out.println("You're tires are great!");
			break;
		case 2: if(u == 2);
		System.out.println("You might want to get those checked soon.");
		    break;
	
		default: 
			System.out.println("We can fix this today!");
	
		}
		
	}
	public void Engine(){
		System.out.println("Is your car on? Choose 0 for off or 1 for on.");
		Scanner keyboard = new Scanner(System.in);
		u = keyboard.nextInt();
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
	    s = 150;
		System.out.println("Who's faster, Yours or mine? Enter your Toyota top speed.");
		Scanner keyboard = new Scanner(System.in);
		top = keyboard.nextInt();
		if(top >= s)
			System.out.println("Your car is faster, You must have a great car, Your Top Speed =" +top);
		else			
			System.out.println("Better Luck next time! This my Top Speed =" + s);

	
	}
	public void CarType(String c){
		String g = "Truck";
	    c = "Sedan";
	    String top;
		System.out.println("Enter whether your Toyota is a sedan, or a van.");
		Scanner keyboard = new Scanner(System.in);
		top = keyboard.nextLine();
		switch(top){
		default: if(top.equals(c));
		System.out.println("A "+c+" is perfect to fit all your friends");
		break;
		case "1": if(top.equals(g));
		System.out.println("A "+g+" is perfect for everyone!");
		break;
		
}
	}
}
	
	


