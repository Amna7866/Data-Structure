import java.util.HashMap;

public class hashmap {
    // hashmaps are like array-list but with key,value pairs. (needs import)
    //it stores objects, needs encapsulation, eg. (name,mail)
    public static void main(String[] args) {
        HashMap <String,String> countries = new HashMap<String,String>(); 

        countries.put("USA","Washington Dc");
        countries.put("Pakistan","Islamabad");
        countries.put("Canada","Ottawa");
        countries.put("Saudi Arabia","Riyadh");
        
        //countries.remove("USA");
        System.out.println(countries); 
        //System.out.println(countries.remove("Pakistan")); 

        //countries.clear();
        //System.out.println(countries);
        //System.out.println(countries.size());
        //countries.replace("USA","New York");
        //System.out.println(countries); 
        System.out.println(countries.containsKey("England")); // to check if that key is present.
        
        for(String i : countries.keySet()) {
            System.out.print(i + "\t" + "= ");
            System.out.println(countries.get(i)); 
        }








    }


}
