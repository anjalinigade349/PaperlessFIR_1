package hibproject;

public class Status {
    private int FIRNo;
    private String FIRStatus;

    public Status(int FIRNo, String FIRStatus) {
        this.FIRNo = FIRNo;
        this.FIRStatus = FIRStatus;
    }

    public String getFIRStatus() {
        return FIRStatus;
    }

    public void setFIRStatus(String FIRStatus) {
        this.FIRStatus = FIRStatus;
    }

    public int getFIRNo() {
        return FIRNo;
    }

    public void setFIRNo(int FIRNo) {
        this.FIRNo = FIRNo;
    }
}
