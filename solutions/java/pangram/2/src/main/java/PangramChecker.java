public class PangramChecker {

    public boolean isPangram(String input) {

        return input != null && !input.isEmpty() && input.toLowerCase()
                .chars()
                .filter(c -> c >= 'a' && c <= 'z')
                .distinct()
                .count() == 26;

    }

}
