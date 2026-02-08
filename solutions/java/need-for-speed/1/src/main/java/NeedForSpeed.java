class NeedForSpeed {
    static int MAX_BATTERY_CAPACITY = 100;
    public int speed;
    public int batteryDrain;
    public int distanceDriven = 0;
    public int battery = 100;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return this.battery < batteryDrain;
    }

    public int distanceDriven() {
        return this.distanceDriven;

    }

    public void drive() {
        if (batteryDrained()) {
            return;
        }
        this.distanceDriven += this.speed;
        this.battery -= this.batteryDrain;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        int batteryConsumption = car.battery / car.batteryDrain;
        int maxDistance = car.speed * batteryConsumption;
        return maxDistance >= this.distance;
    }
}
