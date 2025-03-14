package pa04;
import java.util.*;

public class pa04 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        String input=keyboard.nextLine();

        Stack<Character> s=new Stack<Character>();
        //process
        //read one char at a time from left to right 
        for (int index = 0; index <input.length(); index++) {
            char c=input.charAt(index);
            //if C is ''(' or { or []} then push c into s
            // if c is a closing symbol then pop stack, and check the popped value matches c/
            
            
        } 


        //output 
    }
    
}
