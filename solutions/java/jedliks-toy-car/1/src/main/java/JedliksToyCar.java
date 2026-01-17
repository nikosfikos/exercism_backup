public class JedliksToyCar {
    private int meters = 0;
    private int battery = 100;
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return  "Driven " +meters+ " meters";
    }

    public String batteryDisplay() {
        if(battery < 1){
            return "Battery empty";
        }
        return "Battery at "+battery+ "%";
    }

    public void drive() {
        if(battery<1){
            batteryDisplay();
        } else{
        meters += 20;
        battery-=1;
        }
    }
}
