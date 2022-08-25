package hw5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hw5two {
    public static void main(String args[]){
        Map<String,String> capitalMap = new HashMap<String,String>();
        capitalMap.put("USA","Washington");
        capitalMap.put("Japan","Tokyo");
        capitalMap.put("Thailand","Bangkok");
        capitalMap.put("UK","London");
        capitalMap.put("Australia","Canberra");
        capitalMap.put("Denmark","Copenhagen");
        capitalMap.put("Egypt","Cairo");
        capitalMap.put("Vietnam","Hanoi");
        capitalMap.put("Italy","Rome");
        capitalMap.put("Brazil","Brazilia");
        for(String key: capitalMap.keySet()){
            System.out.println(key+":"+capitalMap.get(key));
        }
    }
}
