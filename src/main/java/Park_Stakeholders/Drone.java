package Park_Stakeholders;

public class Drone {
    private String name;
    private int RF;
    private int GPSid;

    public Drone(String name) {
        this.name = name;
    }

    public void setRF(int RF) {
        this.RF = RF;
    }

    public void setGPSid(int gpsid) {
        GPSid = gpsid;
    }

    public int getRF() {
        return RF;
    }

    public int getGPSid() {
        return GPSid;
    }
}
