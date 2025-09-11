import java.util.HashMap;
import java.util.Map;

class ResistorColor {
    private static final HashMap<String, Integer> resistor = new HashMap<>();

    static {
        resistor.put("black", 0);
        resistor.put("brown", 1);
        resistor.put("red",2);
        resistor.put("orange", 3);
        resistor.put("yellow", 4);
        resistor.put("green", 5);
        resistor.put("blue", 6);
        resistor.put("violet", 7);
        resistor.put("grey", 8);
        resistor.put("white", 9);
    }

    int colorCode(String color) {
        return resistor.get(color.toLowerCase());
    }

    String[] colors() {
        return resistor.entrySet()
                       .stream()
                       .sorted(Map.Entry.comparingByValue())
                       .map(Map.Entry::getKey)
                       .toArray(String[]::new);

    }
}
