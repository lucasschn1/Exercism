import java.util.HashMap;

class ResistorColorDuo {
    private static final HashMap<String, Integer> resistor = new HashMap<>();
    static {
        resistor.put("black", 0); resistor.put("brown", 1); resistor.put("red", 2);
        resistor.put("orange", 3); resistor.put("yellow", 4); resistor.put("green", 5);
        resistor.put("blue", 6); resistor.put("violet", 7); resistor.put("grey",8);
        resistor.put("white", 9);
    }
    int value(String[] colors) {
        int result = 0;
        for(int i = 0; i < 2; i++){
            String cor = colors[i];
            Integer numero = resistor.get(cor.toLowerCase());
            if (numero == null) {
                throw new IllegalArgumentException("Cor inválida" + cor);
            }
            result = result * 10 + numero;
        }
        return result;
    }
}
