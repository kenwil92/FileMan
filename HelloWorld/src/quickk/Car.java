package quickk;

import java.util.Scanner;
public class Car { 
	protected int speed;
	protected String car = "Car";
	protected String feul = "Feul";
	Car(int s, String c, String f){
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
		System.out.println("Who's faster, Yours or mine? Enter your Car top speed.");
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
		System.out.println("Enter whether your Car is a sedan, or a truck.");
		Scanner keyboard = new Scanner(System.in);
		top = keyboard.nextLine();
		switch(top){
		default: if(top.equals(c));
		System.out.println("A "+c+" is perfect to fit all your friends");
		break;
		case "truck": if(top.equals(g));
		System.out.println("A "+g+" is perfect for everyone!");
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
			
			top = keyboard.nextLine();
			switch(top){
			default: if(top.equals(f));
			System.out.println("A "+f+" is what the average car takes");
			break;
			case "Plus": if(top.equals(p));
			System.out.println("A "+p+" can get you really far with less gasing up!");
			break;
			case "Premium": if(top.equals(pp));
			System.out.println("A "+pp+" this for the big rig truck even an 18-wheeler!");
			break;
		
		
	}
	}
}
	
	


