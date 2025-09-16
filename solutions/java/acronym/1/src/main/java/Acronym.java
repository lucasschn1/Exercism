class Acronym {
    private final String result;

    Acronym(String phrase) {
        StringBuilder sb = new StringBuilder();
        boolean espcoEmBranco = false;

        sb.append(phrase.toCharArray()[0]);

        for (char i : (phrase.toUpperCase()).toCharArray()) {
            if (i == ' ' || i == '-' || i == '_') {
                espcoEmBranco = true;
            } else if (espcoEmBranco) {
                sb.append(i);
                espcoEmBranco = false;
            }
        }
        result = sb.toString();
    }

    String get() {
        return result;
    }

}
