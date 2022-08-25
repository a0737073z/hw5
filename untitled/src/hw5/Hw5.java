package hw5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hw5 {

    public static void main(String args[]) {
        List<Map<String, String>> animalList = new ArrayList<Map<String, String>>();
        animalList.add(Map.of("name", "shark", "habitat", "ocean"));
        animalList.add(Map.of("name", "bear", "habitat", "land"));
        animalList.add(Map.of("name", "moose", "habitat", "land"));
        animalList.add(Map.of("name", "frog", "habitat", "swamp"));
        animalList.add(Map.of("name", "jelly fish", "habitat", "ocean"));
        animalList.add(Map.of("name", "heron", "habitat", "swamp"));
        animalList.add(Map.of("name", "whale", "habitat", "ocean"));
        System.out.println(animalList);
        Map<String, List<String>> animalMealList = new HashMap<String, List<String>>();
        for (Map<String, String> item : animalList) {
            String a = item.get("habitat");
            if (!animalMealList.containsKey(a)) {
                animalMealList.put(a, new ArrayList<>() {{
                    add(item.get("name"));
                }});
            }else{
                    animalMealList.get(a).add(item.get("name"));
                }
            }
            System.out.println();
            animalMealList.forEach((key, value) -> {
                System.out.println(key + ":" + String.join(",", value));
            });
//            for(String key: animalMealList.keySet()){
//                System.out.println(key+":"+animalMealList.get(key));
//            }
        }
    }
