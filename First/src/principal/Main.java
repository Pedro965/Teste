/**
 * 
 */
package principal;

import java.util.Scanner;

/**
 * @author Pedro
 *
 */
public class Main {
	public static void main(String[] args) {
		
		System.out.println("Hello World! Como se chama? ");
		
		Scanner in = new Scanner(System.in);
		
		String nome = in.nextLine();
		
		System.out.printf("Meu primeiro programa java %s.", nome);
		
		
	}

}
