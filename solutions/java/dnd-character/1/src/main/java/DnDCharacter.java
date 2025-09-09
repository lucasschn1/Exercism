import java.util.*;

class DnDCharacter {
    Random random = new Random();

    int ability(List<Integer> scores) {
        int menorNumero = Collections.min(scores);
        int soma = 0;

        for (int num : scores) {
            soma += num;
        }
        return soma - menorNumero;
    }

    List<Integer> rollDice() {
        List<Integer> dado = new ArrayList<>();
        for (int i = 0; i < 4; i++) {    // dado deve rolar 4 vezes
            dado.add(random.nextInt(6) + 1);
        }
        return dado;
    }

    int modifier(int input) {
        return (int) Math.floor((input - 10) / 2.0);
    }

    int getStrength() {
        List<Integer> scores = rollDice();
        return ability(scores);
    }

    int getDexterity() {
        List<Integer> scores = rollDice();
        return ability(scores);
    }

    int getConstitution() {
        List<Integer> scores = rollDice();
        return ability(scores);
    }

    int getIntelligence() {
        List<Integer> scores = rollDice();
        return ability(scores);
    }

    int getWisdom() {
        List<Integer> scores = rollDice();
        return ability(scores);
    }

    int getCharisma() {
        List<Integer> scores = rollDice();
        return ability(scores);
    }

    int getHitpoints() {
        return 10 + (modifier(getConstitution()));
    }
}
