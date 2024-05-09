public class array {
    public static void main(String[] args) {

        // array is used to store multiple values. 

        String[] chocolate = { "twix","galaxy","hersheys"};
        
        for( int i = 0; i<chocolate.length; i++) {

            System.out.println(chocolate[i]); 
        } 
        chocolate[1] = "toffee";
        System.out.println(chocolate[1]);
    }
}
