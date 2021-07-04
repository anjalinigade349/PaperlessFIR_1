package hibproject;


public class Investigator3 {
    private String inv3ID;
    private String inv3Pwd;
    private int assignedFIR;

    public Investigator3() {
    }

    public Investigator3(String inv3ID, String inv3Pwd) {
        this.inv3ID = inv3ID;
        this.inv3Pwd = inv3Pwd;
    }

    public int getAssignedFIR() {
        return assignedFIR;
    }

    public void setAssignedFIR(int assignedFIR) {
        this.assignedFIR = assignedFIR;
    }

    public String getInv3ID() {
        return inv3ID;
    }

    public void setInv3ID(String inv3ID) {
        this.inv3ID = inv3ID;
    }

    public String getInv3Pwd() {
        return inv3Pwd;
    }

    public void setInv3Pwd(String inv3Pwd) {
        this.inv3Pwd = inv3Pwd;
    }
    
}
