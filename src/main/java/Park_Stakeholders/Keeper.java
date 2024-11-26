package Park_Stakeholders;

public class Keeper {
    private String name;
    private String PhoneNum;
    private int GPSid;

    public Keeper(String name) {
        this.name = name;
    }

    public void setPhoneNum(String phoneNum) {
        PhoneNum = phoneNum;
    }

    public void setGPSid(int gpsid) {
        GPSid = gpsid;
    }

    public String getPhoneNum() {
        return PhoneNum;
    }

    public int getGPSid() {
        return GPSid;
    }

}
