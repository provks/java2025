package Java.Hashmaps;

import java.util.HashMap;
import java.util.Set;

public class Hashamaps {
    public static void main(String[] args) {
        // CREATE HASHMAP WITH KEY AND VALUE AS STRINGS
        HashMap<String, String> stateAndCities = new HashMap<>();

        // METHODS/OPERATOINS

        // insert
        stateAndCities.put("Uttar Pradesh", "Kanpur");
        stateAndCities.put("Telangana", "Hyderabad");
        stateAndCities.put("Kerela", "Bengalore");
        stateAndCities.put("Maharashtra", "Pune");
        stateAndCities.put("Uttarakhand", "Dehradun");
        // stateAndCities.put("Maharashtra", "Mumbai");    // overrides the previous value for same key

        System.out.println(stateAndCities);

        // get value/ access the value
        String value = stateAndCities.get("Kerala");
        // System.out.println(value);
        // System.out.println(stateAndCities.get("Rajasthan"));
        // System.out.println(stateAndCities.get("Odisa"));
        // System.out.println(stateAndCities.get("Kerela"));

        // check if key exists: returns boolean
        // System.out.println("checking if Kerala key exists: " + stateAndCities.containsKey("Kerala"));
        // if (stateAndCities.containsKey("Kerela")) {
        //     System.out.println(stateAndCities.get("Kerela"));
        // }

        // remove key from hashmap
        System.out.println(stateAndCities.remove("Telangana"));
        System.out.println(stateAndCities.remove("Telangana"));
        System.out.println(stateAndCities);

        // check if value exists : return boolean
        System.out.println("Value check: " + stateAndCities.containsValue("Hyderabad"));

        // size: return int
        System.out.println(stateAndCities.size());

        // iterate over keys of hashmap: keySet
        Set<String> states = stateAndCities.keySet();
        System.out.println(states);
        // iterate over set
        // for (String state : states) {
        //     System.out.println(state);
        // }
        
        // for (String state : stateAndCities.keySet()) {
        //     System.out.println(state);
        // }

        // iterate over values of hashmap: valueSet
        stateAndCities.values();
        for (String city : stateAndCities.values()) {
            System.out.println(city);
        }

        // iterate over both, keys and values
        for (String state : stateAndCities.keySet()) {
            System.out.println("key: " + state + " -> " + stateAndCities.get(state));
        }
    }

}
