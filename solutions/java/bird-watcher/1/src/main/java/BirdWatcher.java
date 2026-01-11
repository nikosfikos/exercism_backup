
class BirdWatcher {
    private final int[] birdsPerDay;
    private final int[] birdsLastWeek = {0, 2, 5, 3, 7, 8, 4};
    private int countForFirstDays =0;
    private int countBusyDays =0;
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsLastWeek;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int bird : birdsPerDay) {
            if (bird == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        if (numberOfDays > birdsPerDay.length ){
            numberOfDays = birdsPerDay.length;
        }
        for (int i=0; i < numberOfDays; i++){
            countForFirstDays += birdsPerDay[i];
        }
        return countForFirstDays;
    }

    public int getBusyDays() {
        for (int bird : birdsPerDay){
            if (bird >= 5){
                countBusyDays++;
            }
        }
        return countBusyDays;
    }
}
