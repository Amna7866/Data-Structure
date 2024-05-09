import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = "";

        // while loop keeps executing block of code as long as its condition remains true.

        while(name.isBlank()) {
            System.out.println("whats your name "); 
            name = scanner.nextLine();
            
            
        }
        

    }    
}
