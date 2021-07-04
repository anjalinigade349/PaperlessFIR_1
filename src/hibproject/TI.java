package hibproject;

public class TI {
    private String tiID;
    private String tiPwd;

    public TI() {
    }
    
    

    public TI(String tiID, String tiPwd) {
        this.tiID = tiID;
        this.tiPwd = tiPwd;
    }

    public String getTiID() {
        return tiID;
    }

    public void setTiID(String tiID) {
        this.tiID = tiID;
    }

    public String getTiPwd() {
        return tiPwd;
    }

    public void setTiPwd(String tiPwd) {
        this.tiPwd = tiPwd;
    }
}
