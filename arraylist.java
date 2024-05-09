import java.util.ArrayList;

public class arraylist {
public static void main(String[] args) {
     // arraylist is a resizable array where elements can be added or removed
     //after compilation 
    ArrayList<String> food = new ArrayList<String>();
    food.add("pizza");
    food.add("Burger");
    food.add("biryani");

    food.set(2, "sushi");
    food.remove(1);
    //food.clear();


    for( int i = 0; i<food.size(); i++) {

        System.out.println(food.get(i));   
    }



    

}

}
