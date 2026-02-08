class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar>{

    private int travelUnits = 0;
    public int numberOfVictories = 0;

    public void drive() {
        travelUnits += 10;
    }

    public int getDistanceTravelled() {
        return travelUnits;
    }

    public int getNumberOfVictories() {
        return this.numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar o) {
        if (this.numberOfVictories > o.numberOfVictories)
            return -1;
        else if (this.numberOfVictories < o.numberOfVictories){
            return 1;
        }
        return 0;
    }
}
