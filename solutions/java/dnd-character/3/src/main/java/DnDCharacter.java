import java.util.*;

class DnDCharacter {
    Random random = new Random();

    private int strength = ability(rollDice());
    private int dexterity = ability(rollDice());
    private int constitution = ability(rollDice());
    private int intelligence = ability(rollDice());
    private int wisdom = ability(rollDice());
    private int charisma = ability(rollDice());

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
       return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return 10 + modifier(constitution);
    }
}
