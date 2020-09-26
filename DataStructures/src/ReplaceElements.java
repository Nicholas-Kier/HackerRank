import java.util.*;

public class ReplaceElements {
    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102, "Rahul");
        System.out.println("Initial list of elements: ");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("Updated list of elements: ");
        map.replace(102, "Gaurav");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("Updated list of elements: ");
        map.replace(101, "Vijay", "Ravi");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("Updated list of elements: ");
        map.replaceAll((k,v) -> "Ajay");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
