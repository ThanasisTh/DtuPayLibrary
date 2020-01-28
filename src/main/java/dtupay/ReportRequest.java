package dtupay;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ReportRequest {

    public ReportRequest(){

    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    String startDate;

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    String endDate;
    String userId; // Can be both merchant and customer



    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ReportRequest(String startDate, String endDate, String userId){
        this.startDate = startDate;
        this.endDate = endDate;
        this.userId = userId;
    }

}
