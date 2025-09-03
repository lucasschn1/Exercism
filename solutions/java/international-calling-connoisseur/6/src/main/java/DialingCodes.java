import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DialingCodes {
    private HashMap<Integer, String> map = new HashMap<>();


    public Map<Integer, String> getCodes() {
       return Collections.unmodifiableMap(map);
    }

    public void setDialingCode(Integer code, String country) {
        map.put(code,country);
    }

    public String getCountry(Integer code) {
        return map.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        boolean alreadyExists = map.containsValue(country);

        if (!map.containsKey(code) && !alreadyExists) {
            map.put(code, country);
        }
    }

    public Integer findDialingCode(String country) {

        /*
          for (int code : map.keySet()) {
           if (map.get(code).equals(country)){
                return code;
           }
       }
       return null;
         */

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().equals(country)){
                return entry.getKey();
            }
        }
        return null; 
    }

    public void updateCountryDialingCode(Integer code, String country) {

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().equals(country)) {
                map.remove(entry.getKey()); // remove a entrada antiga
                map.put(code, country);     // adiciona com o novo código
                break;
            }
        }
    }
}
