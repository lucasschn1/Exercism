class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints (Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter{

    public String toString() {
        return "Fighter is a Warrior";
    }

    public boolean isVulnerable() {
        return false;
    }

    public int getDamagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6;
    }
}

class Wizard extends Fighter{
    boolean spell = false;

    public String toString() {
        return "Fighter is a Wizard";
    }

    public void prepareSpell() {
        spell = true;
    }

    public boolean isVulnerable() {
        return !spell;
    }

    public int getDamagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 12 : 3;
    }
}
