package hibproject;

public class FIR {
    private int FIRNo;
    private String FIRName;
    private String FIRAddress;
    private String AadharNo;
    private String ContactNo;
    private String FIRTime;
    private String FIRStatment;
    private String FIRAssignInvestigator;
    private String FIRStatus;
    
    public FIR() {
   
    }

    public FIR(int FIRNo, String FIRName, String FIRAddress, String AadharNo, String ContactNo, String FIRTime, String FIRStatment) {
        this.FIRNo = FIRNo;
        this.FIRName = FIRName;
        this.FIRAddress = FIRAddress;
        this.AadharNo = AadharNo;
        this.ContactNo = ContactNo;
        this.FIRTime = FIRTime;
        this.FIRStatment = FIRStatment;
    }


    public String getFIRStatment() {
        return FIRStatment;
    }

    public void setFIRStatment(String FIRStatment) {
        this.FIRStatment = FIRStatment;
    }

    public int getFIRNo() {
        return FIRNo;
    }

    public void setFIRNo(int FIRNo) {
        this.FIRNo = FIRNo;
    }

    public String getFIRName() {
        return FIRName;
    }

    public void setFIRName(String FIRName) {
        this.FIRName = FIRName;
    }

    public String getFIRAddress() {
        return FIRAddress;
    }

    public void setFIRAddress(String FIRAddress) {
        this.FIRAddress = FIRAddress;
    }

    public String getAadharNo() {
        return AadharNo;
    }

    public void setAadharNo(String AadharNo) {
        this.AadharNo = AadharNo;
    }
    
    public String getContactNo() {
        return ContactNo;
    }

    public void setContactNo(String ContactNo) {
        this.ContactNo = ContactNo;
    }

    public String getFIRTime() {
        return FIRTime;
    }

    public void setFIRTime(String FIRTime) {
        this.FIRTime = FIRTime;
    }
    public String getFIRAssignInvestigator() {
        return FIRAssignInvestigator;
    }

    public void setFIRAssignInvestigator(String FIRAssignInvestigator) {
        this.FIRAssignInvestigator = FIRAssignInvestigator;
    }
    public String getFIRStatus() {
        return FIRStatus;
    }

    public void setFIRStatus(String FIRStatus) {
        this.FIRStatus = FIRStatus;
    }
}
