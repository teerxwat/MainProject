package LAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lab2 {
	static int calPrime(int userInput) {
		boolean cal1 = false;
		boolean cal2 = false;
		boolean cal3 = false;
		int i 	= 0 ;
		for( i = 2 ; i<=userInput ;i++ ) {
			cal1 	= i%2 == 0 || i%3 == 0 || i%5 == 0 || i%7 == 0 || i%11 == 0 ;
			cal2 	= i!=2 && i!=3 && i!=5 && i!=7 && i!=11 ;
			if( cal1 && cal2 ) {
				System.out.print( i + "= Not Prime : Divide by " );
				int z = i ;
				int x = 2 ;
				for( x=2; x<z ; x++ ) {
					if( (z%x)==0 ) {
							System.out.print( x );
							if( x != z/2 ) {
	                            System.out.print( ", " );
	                        }
					}
				}
				System.out.print( "\n" );
			} else {
				System.out.println("" + i + "= Prime Number" );
			}
		}
		return userInput;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int userInput = 0 ;
		System.out.print( "Please enter your value : " );
		try {
			userInput = Integer.parseInt( br.readLine() );  // Read user input
			//System.out.println( "User Input = " + userInput );  // Output user input
		} catch ( NumberFormatException nfe) {
			System.err.println( "Invalid Format!" );
		}
		System.out.println( "-----------------------");
		calPrime(userInput);
	}

}
