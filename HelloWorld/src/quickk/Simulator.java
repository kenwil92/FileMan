/**
 * 
 */
package quickk;

import java.util.Scanner;

/**
 * @author K.Wilson.2010
 *
 */
public class Simulator {

	public static void main(String[] args) {
		int u;
		 Toyota k = new Toyota(160, "Truck", "Plus");
		 Car j = new Car(154, "Sedan", "Unleaded");
		 Chevy w = new Chevy(144, "Convertiable", "Premium");
		System.out.println("In order, Is your car a Toyota, a Chevy or another car? Choose 1, 2 ,or 3");
		Scanner keyboard = new Scanner(System.in);
		u = keyboard.nextInt();
		switch(u){
		case 1: if(u == 1);
		      k.run();
		      k.Engine();
		      k.CarType("x");
		      k.TireSize();
		      k.TopSpeed(7);
		      k.FeulType("i");
		    break;
		case 2: if(u == 2);
	      w.run();
	      w.Engine();
	      w.CarType("y");
	      w.TireSize();
	      w.TopSpeed(6);
	      w.FeulType("j");
	    break;
		default:	
                j.run();
                j.Engine();
                j.CarType("c");
                j.TireSize();
                j.TopSpeed(50);
                j.FeulType("i");
                break;
   
		} 
		
    
	}

}
