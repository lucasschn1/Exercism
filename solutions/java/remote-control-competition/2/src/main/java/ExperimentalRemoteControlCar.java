public class ExperimentalRemoteControlCar implements RemoteControlCar {
    int unitsDrive = 0;
    int distanceT = 0;

    public void drive() {
        unitsDrive += 20;
        distanceT += unitsDrive;
    }

    public int getDistanceTravelled() {
        return distanceT;
    }
}
