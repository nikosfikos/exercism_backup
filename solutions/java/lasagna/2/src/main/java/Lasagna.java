public class Lasagna {
    private static final int EXPECTED_MINUTES_IN_OVEN = 40;
    private static final int PREPARATION_TIME_PER_LAYER = 2;
    public int expectedMinutesInOven(){
        return EXPECTED_MINUTES_IN_OVEN;
    }

    public int remainingMinutesInOven(int actualMinutes){
        return expectedMinutesInOven() - actualMinutes;
    }

    public int preparationTimeInMinutes(int amountLayers){
        return PREPARATION_TIME_PER_LAYER * amountLayers;
    }

    public int totalTimeInMinutes(int amountLayers, int ovenMinutes){
        return preparationTimeInMinutes(amountLayers) + ovenMinutes;
    }
}
