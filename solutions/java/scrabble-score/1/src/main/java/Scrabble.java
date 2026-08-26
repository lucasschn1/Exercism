import java.util.*;

class Scrabble {

    private final String word;
    Map<String,Integer> mapOfPoints = new HashMap<>();

    Scrabble(String word) {
        this.word = word;

        // one point
        mapOfPoints.put("A", 1);
        mapOfPoints.put("E", 1);
        mapOfPoints.put("I", 1);
        mapOfPoints.put("O", 1);
        mapOfPoints.put("U", 1);
        mapOfPoints.put("L", 1);
        mapOfPoints.put("N", 1);
        mapOfPoints.put("R", 1);
        mapOfPoints.put("S", 1);
        mapOfPoints.put("T", 1);

        // two points
        mapOfPoints.put("D", 2);
        mapOfPoints.put("G", 2);

        // three points
        mapOfPoints.put("B", 3);
        mapOfPoints.put("C", 3);
        mapOfPoints.put("M", 3);
        mapOfPoints.put("P", 3);

        // four points
        mapOfPoints.put("F", 4);
        mapOfPoints.put("H", 4);
        mapOfPoints.put("V", 4);
        mapOfPoints.put("W", 4);
        mapOfPoints.put("Y", 4);

        // five points
        mapOfPoints.put("K", 5);

        // eight points
        mapOfPoints.put("J", 8);
        mapOfPoints.put("X", 8);

        // ten points
        mapOfPoints.put("Q", 10);
        mapOfPoints.put("Z", 10);
    }

    int getScore() {
        int total = 0;

        for (char letter : word.toUpperCase().toCharArray()) {
            total += mapOfPoints.get(String.valueOf(letter));
        }

        return total;
    }

}
