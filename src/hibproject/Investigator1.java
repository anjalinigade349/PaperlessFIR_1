package hibproject;


public class Investigator1 {
    private String inv1ID;
    private String inv1Pwd;
    private int assignedFIR;

    public Investigator1() {
    }

    public Investigator1(String inv1ID, String inv1Pwd) {
        this.inv1ID = inv1ID;
        this.inv1Pwd = inv1Pwd;
    }

    public int getAssignedFIR() {
        return assignedFIR;
    }

    public void setAssignedFIR(int assignedFIR) {
        this.assignedFIR = assignedFIR;
    }

    public String getInv1ID() {
        return inv1ID;
    }

    public void setInv1ID(String inv1ID) {
        this.inv1ID = inv1ID;
    }

    public String getInv1Pwd() {
        return inv1Pwd;
    }

    public void setInv1Pwd(String inv1Pwd) {
        this.inv1Pwd = inv1Pwd;
    }
    
}
