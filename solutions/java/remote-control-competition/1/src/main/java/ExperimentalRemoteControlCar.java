public class ExperimentalRemoteControlCar implements RemoteControlCar {

    private int travelUnits = 0;

    public void drive() {
        travelUnits += 20;
    }

    public int getDistanceTravelled() {
        return travelUnits;
    }
}
