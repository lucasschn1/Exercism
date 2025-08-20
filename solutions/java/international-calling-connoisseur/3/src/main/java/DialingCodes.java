import java.util.HashMap;
import java.util.Map;

public class DialingCodes {
    HashMap<Integer, String> map = new HashMap<>();


    public Map<Integer, String> getCodes() {
       return map;
    }

    public void setDialingCode(Integer code, String country) {
        map.put(code,country);
    }

    public String getCountry(Integer code) {
        return map.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        boolean alreadyExists = false;

        for (String c : map.values()) {
            if (c.equals(country)) {
                alreadyExists = true;
                break;
            }
        }

        if (!map.containsKey(code) && !alreadyExists) {
            map.put(code, country);
        }
    }

    public Integer findDialingCode(String country) {
       for (int code : map.keySet()) {
           if (map.get(code).equals(country)){
                return code;
           }
       }
       return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        boolean alreadyExists = false;

        for (String c : map.values()) {
            if (c.equals(country)) {
                alreadyExists = true;
                break;
            }
        }

        if (!map.containsKey(country)) {
            map.put(code, country);
        }
    }
}
