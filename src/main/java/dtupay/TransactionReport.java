package dtupay;


public class TransactionReport {

    public TransactionReport(){
        this.numberOfPayments = 0;
        this.longReport = "This is a transaction report:";
    }

    private int numberOfPayments;
    private String longReport;

    public int getNumberOfPayments() {
        return numberOfPayments;
    }

    public void setNumberOfPayments(int numberOfPayments) {
        this.numberOfPayments = numberOfPayments;
    }

    public String getLongReport() {
        return longReport;
    }

    public void setLongReport(String longReport) {
        this.longReport = longReport;
    }

    public void addToReport(String payment){
        longReport = longReport + "\n" + payment;
        numberOfPayments += 1;
    }
}
