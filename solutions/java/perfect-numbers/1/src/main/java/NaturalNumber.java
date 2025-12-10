class NaturalNumber {
    int number;
    NaturalNumber(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        this.number = number;
    }

    Classification getClassification() {
        // saber os divisores positivos do número
        int numDivisor = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                numDivisor += i;
            }
        }

        if (numDivisor == number) {
            return Classification.PERFECT;
        }
        if (numDivisor > number) {
            return  Classification.ABUNDANT;
        }

        return Classification.DEFICIENT;
    }
}
