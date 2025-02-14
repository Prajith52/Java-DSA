import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        //insertion
        map.put("Kohli",18);
        map.put("Dhoni",07);
        map.put("Sachin",10);
        //search
        System.out.println(map.get("Kohli"));
        System.out.println(map.get("Dhoni"));
        System.out.println(map.get("Sachin"));
        System.out.println(map.getOrDefault("Jadeja",8));
        
        //remove
        map.remove("Kohli");
        System.out.println(map.get("Kohli"));
        System.out.println(map.get("Dhoni"));
        System.out.println(map.get("Sachin"));
        System.out.println(map.getOrDefault("Jadeja",8));
        
        //traverse

            System.out.println(map.keySet());
            System.out.println(map.values());
            System.out.println(map.size());
    }
}
