class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    int unitsDrive = 0;
    int distanceT = 0;
    int numOfVictories = 0;

    public void drive() {
        unitsDrive += 20;
        distanceT += unitsDrive;
    }

    public int getDistanceTravelled() {
       return distanceT;
    }

    public int getNumberOfVictories() {
        return this.numOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numOfVictories = numberOfVictories;
    }

    public int compareTo(ProductionRemoteControlCar otherCar) {
        return Integer.compare(otherCar.getNumberOfVictories(), this.numOfVictories);
    }
}
