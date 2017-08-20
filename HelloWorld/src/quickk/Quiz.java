/**
 * 
 */
package quickk;

/**
 * @author K.Wilson.2010
 *
 */
public class Quiz {
	static Integer i = new Integer(0);
	public static void main(String[] args) {
		if (i == 0) System.out.print("=");
		if (i != 0) System.out.print("!");
		if (i > 0) System.out.print(">");
		if (i < 0) System.out.println("<");
	}

}
