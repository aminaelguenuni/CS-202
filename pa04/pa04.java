
import java.util.*;

public class pa04 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Please enter a mathematical expression: ");
        String input=keyboard.nextLine();

        Stack<Character> s=new Stack<Character>();
        Stack<Integer> position = new Stack<>();

        for (int index = 0; index <input.length(); index++) {
            char c=input.charAt(index);
            if (c=='('|| c=='{'|| c=='[') {
                s.push(c);
                position.push(index);
                System.out.println(s);
            }
            if (c==')'|| c=='}'|| c==']') {
                char top = s.pop();
                position.pop();
                System.out.println(s); 

                if ((c == ')' && top != '(') || 
                    (c == '}' && top != '{') || 
                    (c == ']' && top != '[')) {
                    System.out.println("The input expression is not balanced. The first mismatch is found at position " + index + "!");
                    return;
                }

            }              
        }
        if (s.isEmpty()) {
            System.out.println("The input expression is balanced!");
            
        }

    }
    
}