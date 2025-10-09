public class EliudsEggs {
    public int eggCount(int number) {
        StringBuilder response = new StringBuilder();

        while (number > 0) {
            int resto = number % 2;
            number /= 2;
            response.append(resto);
        }

        char[] eggs = response.toString().toCharArray();
        int eggCountInArray = 0;

        for (char i : eggs) {
            if (i == '1') {
                eggCountInArray += 1;
            }
        }
    return eggCountInArray;
    }
}
