package Park_Stakeholders;

public class Lion {
    private String name;
    private int Age;
    private int GPSid;

    public Lion(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setGPSid(int gpsid) {
        GPSid = gpsid;
    }

    public int getAge() {
        return Age;
    }

    public int getGPSid() {
        return GPSid;
    }
}
