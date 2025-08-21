class CollatzCalculator {

    int computeStepCount(int start) {
        int step = 0;
            while (start != 1) {
                if (start <= 0) {
                    throw new IllegalArgumentException("Only positive integers are allowed");
                }
                start = (start % 2 == 0) ? start / 2 : (start * 3) + 1;
                step++;
            }
        return step;
    }
}