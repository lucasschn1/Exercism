class SqueakyClean {
    static String clean(String identifier) {
    char[] arrayOfChar = identifier.toCharArray();
        StringBuilder cleaned = new StringBuilder();
        boolean capitalizeNext = false;

        for (char c : arrayOfChar) {
            switch (c) {
                case ' ':
                    cleaned.append("_");
                    break;
                case '-':
                    capitalizeNext = true;
                    break;
                case '4':
                    cleaned.append("a");
                    break;
                case '3':
                    cleaned.append("e");
                    break;
                case '0':
                    cleaned.append("o");
                    break;
                case '1':
                    cleaned.append("l");
                    break;
                case '7':
                    cleaned.append("t");
                    break;
                default:
                    if (Character.isLetter(c) || Character.isDigit(c)) {
                        if (capitalizeNext) {
                            cleaned.append(Character.toUpperCase(c));
                            capitalizeNext = false;
                        } else {
                            cleaned.append(c);
                        }
                    }
                    break;
            }
        }
        return cleaned.toString();
    }   
       
}

