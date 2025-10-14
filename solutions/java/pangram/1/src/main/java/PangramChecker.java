public class PangramChecker {

    public boolean isPangram(String input) {
        if (input.isEmpty()) {
            return false;
        }

        long letterCount = input.toLowerCase()
                .chars()
                .filter(c -> c >= 'a' && c <= 'z')
                .distinct()
                .count();

        return letterCount == 26;

    }

}
