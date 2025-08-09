class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder cleaned = new StringBuilder();
        boolean capitalizeNext = false;

        for (char c : identifier.toCharArray()) {
            switch (c) {
                case ' ' -> cleaned.append("_");
                case '-' -> capitalizeNext = true;
                case '4' -> cleaned.append("a");
                case '3' -> cleaned.append("e");
                case '0' -> cleaned.append("o");
                case '1' -> cleaned.append("l");
                case '7' -> cleaned.append("t");
                default -> {
                    if (Character.isLetter(c) || Character.isDigit(c)) {
                        cleaned.append(capitalizeNext ? Character.toUpperCase(c) : c);
                        capitalizeNext = false;
                    }
                }
            }
        }
        return cleaned.toString();
    }
}