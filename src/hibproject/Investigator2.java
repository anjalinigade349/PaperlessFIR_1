package hibproject;


public class Investigator2 {
    private String inv2ID;
    private String inv2Pwd;
    private int assignedFIR;

    public Investigator2() {
    }

    public Investigator2(String inv2ID, String inv2Pwd) {
        this.inv2ID = inv2ID;
        this.inv2Pwd = inv2Pwd;
    }

    public int getAssignedFIR() {
        return assignedFIR;
    }

    public void setAssignedFIR(int assignedFIR) {
        this.assignedFIR = assignedFIR;
    }

    public String getInv2ID() {
        return inv2ID;
    }

    public void setInv2ID(String inv2ID) {
        this.inv2ID = inv2ID;
    }

    public String getInv2Pwd() {
        return inv2Pwd;
    }

    public void setInv2Pwd(String inv2Pwd) {
        this.inv2Pwd = inv2Pwd;
    }
    
}
