public class JedliksToyCar {
    int meters = 0;
    int battery = 100;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + (this.meters) + " meters";
    }

    public String batteryDisplay() {
        if (this.battery > 0) {
            return "Battery at " + this.battery + "%";
        }
        return "Battery empty";
    }

    public void drive() {
       if (this.battery > 0)
           this.meters += 20;
            this.battery -= 1;
    }
}    
