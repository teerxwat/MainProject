package LAP;

import java.util.Stack; 
import java.io.InputStreamReader; 
import java.io.BufferedReader; 
import java.io.IOException; 
import java.util.Scanner;

public class lab4 {

    static void SetStackSize( int userInput , Stack<String> bugket){
        bugket.setSize(userInput);
        System.out.println("Size of stack = " + bugket.size());
        bugket.setSize(userInput-1);

    }
    static void isEmpty ( Stack<String> bugket ) {
        System.out.println("isEmpty ");
        boolean chkempty = false ;
        chkempty = bugket.isEmpty() ;
        if (chkempty == false ) {
            System.out.println("---| Yes ");
        } else {
            System.out.println("---| No ");
        }
    }
    static void peekStack (Stack<String> bugket){
        System.out.println("Top");
        String element = (String) bugket.peek();
        if ( element == null ) {
        System.out.println("---| NULL"); 
        } else {
        System.out.println(element);
         }
    }
    static void pushStack (Stack<String> bugket){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Push : " );
        int number = bugket.size();
        String txt = sc.nextLine();

        bugket.push(txt);
    }
    static void showstack (Stack<String> bugket){
        System.out.println("ChackStack");
        System.out.println("---| Stack :" + bugket);
    }
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int userInput = 0 ; 
        System.out.print( "SetStackSize : " );
        try {
            userInput = Integer.parseInt( br.readLine() );  // Read user input
        } catch ( NumberFormatException nfe) {
            System.err.println( "Invalid Format!" );
        }
        System.out.println( "-----------------------");
        Stack<String> bugket= new Stack<>();
        SetStackSize(userInput, bugket);
        isEmpty(bugket);
        peekStack(bugket);
        pushStack(bugket); 
        showstack(bugket);
     }
}
