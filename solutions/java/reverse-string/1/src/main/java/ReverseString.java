class ReverseString {
    String reverse(String inputString) {
        StringBuilder reverse = new StringBuilder();
        char[] reverseString = inputString.toCharArray();
        int indice = reverseString.length - 1;
        while (indice >= 0) {
            reverse.append(reverseString[indice]);
            indice -= 1;
        }
        return reverse.toString();
    }
}
