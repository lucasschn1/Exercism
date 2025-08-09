class NeedForSpeed {
    int speed;
    int batteryDrain;
    int carDistance = 0;
    int carBattery = 100;   
    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return carBattery < batteryDrain;
    }

    public int distanceDriven() {
        return carDistance;
    }

    public void drive() {
        if (!batteryDrained()) {            
            carDistance += speed;
            carBattery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

}

class RaceTrack {
    int distance;
    RaceTrack(int distance) {
       this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        int maxDrivers = 100/car.batteryDrain;  
        int maxDistance = maxDrivers * car.speed;
        return maxDistance >= this.distance;
    }
}
