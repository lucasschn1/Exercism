import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HighScores {
List<Integer> highScores;
    public HighScores(List<Integer> highScores) {
        this.highScores = new ArrayList<>(highScores);
    }

    List<Integer> scores() {
        return this.highScores;
    }

    Integer latest() {
       return this.highScores.getLast();
    }

    Integer personalBest() {
        return Collections.max(this.highScores);
    }

    List<Integer> personalTopThree() {
        // usar cópia
        ArrayList<Integer> copy = new ArrayList<>(this.highScores);
        copy.sort(Collections.reverseOrder());
        ArrayList<Integer> sublist = new ArrayList<>();

        if (this.highScores.size() <= 3) {
            return copy;
        }
        for (int i = 0; i < 3; i++) {
            sublist.add(copy.get(i));
        }

        return sublist;
    }

}
