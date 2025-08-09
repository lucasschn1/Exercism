
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        return this.birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
       this.birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        boolean noBirds;
        for (int bird : this.birdsPerDay) {
            if (bird == 0) {
                return true;
            }
        }return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        // percorre o array até o número de dias mas menor que ele prórprio
        for (int i = 0; i < numberOfDays &&  i < this.birdsPerDay.length; i++) {
            sum += birdsPerDay[i]; // Soma cada valor [indice]
        }
        return sum;
    }

    public int getBusyDays() {
        // numeros de passaros que ultrapassam 5
        int sum = 0;
        for (int bird : this.birdsPerDay) {
            if (bird >= 5) {
               sum += 1;
            }   
        }
        return sum;
    }
}
