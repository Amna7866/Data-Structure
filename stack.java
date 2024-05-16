import java.util.Stack;

public class stack {
    public static void main(String[] args) {

        // uses of stack 
        // " Backtracking Algorithms: Tracks states and explores solution paths efficiently.
        //History Management: Facilitates navigation through past actions in applications.
        // undo / redo features " 

        Stack<String> stack = new Stack<String>();

        stack.push("GTA");
        stack.push("COD");
        stack.push("Assasins Creed");   

        // stack.pop(); will remove the first most object from stack.the
        // stack.peep(); to check the first most item from stack
        //System.out.println(stack.peek()); 

        // stack.search(); to find item from stack.
        //System.out.println(stack.search("GTA")); 

        //String myfavgame = stack.pop();
        //System.out.println(myfavgame);

        for( int i = 0; i<1000; i++) {  // to add number of copies to stack.

            System.out.println(stack.push("skyrim")); 
        } 


        System.out.println(stack); 

    }
}
