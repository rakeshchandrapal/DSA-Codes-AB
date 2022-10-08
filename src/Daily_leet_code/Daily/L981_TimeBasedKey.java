package Daily_leet_code.Daily;

import java.util.*;
import java.util.Map;

public class L981_TimeBasedKey {
    public static void main(String[] args) {

    }


}
class TimeMap {
    HashMap<String, HashMap<Integer, String>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) {
            map.put(key, new HashMap<>());
        }
        map.get(key).put(timestamp, value);
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) return "";
        while (timestamp > 0) {
            if (map.get(key).containsKey(timestamp)) return map.get(key).get(timestamp);
            timestamp--;
        }
        return "";
    }
}