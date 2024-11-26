package Park_Stakeholders;

public class Keeper {
    private String name;
    private int PhoneNum;
    private int GPSid;

    public Keeper(String name) {
        this.name = name;
    }

    public void setPhoneNum(int phoneNum) {
        PhoneNum = phoneNum;
    }

    public void setGPSid(int gpsid) {
        GPSid = gpsid;
    }

    public int getPhoneNum() {
        return PhoneNum;
    }

    public int getGPSid() {
        return GPSid;
    }

}
