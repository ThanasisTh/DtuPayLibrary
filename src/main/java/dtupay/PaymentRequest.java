package dtupay;

public class PaymentRequest
{
    private int amount;
    private String merchantUuid;
    private String description;
    private String customerCpr;
    private String token;

    public PaymentRequest(){

    }

    public PaymentRequest(int amount, String merchantUuid, String description, String customerCpr, String token)
    {
        this.amount = amount;
        this.merchantUuid = merchantUuid;
        this.description = description;
        this.customerCpr = customerCpr;
        this.token = token;
    }

    public String getCustomerCpr()
    {
        return customerCpr;
    }

    public int getAmount()
    {
        return amount;
    }

    public String getMerchantUuid()
    {
        return merchantUuid;
    }

    public String getDescription()
    {
        return description;
    }

    public String getToken() { return token; }

    public void setAmount(int amount)
    {
        this.amount = amount;
    }

    public void setMerchantUuid(String merchantUuid)
    {
        this.merchantUuid = merchantUuid;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setCustomerCpr(String customerCpr)
    {
        this.customerCpr = customerCpr;
    }

    public void setToken(String token)
    {
        this.token = token;
    }
}
