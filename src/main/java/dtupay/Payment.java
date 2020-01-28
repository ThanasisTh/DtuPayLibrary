package dtupay;

import java.math.BigDecimal;
import java.util.Date;

public class Payment
{
    private DtuPayMerchantRepresentation merchant;
    private DtuPayCustomerRepresentation customer;
    private BigDecimal amount;
    private String token;
    private Date date;

    public Payment(DtuPayMerchantRepresentation merchant, BigDecimal amount, String token, Date date)
    {
        this.merchant = merchant;
        this.amount = amount;
        this.token = token;
        this.date = date;
    }

    public Payment(DtuPayCustomerRepresentation customer, DtuPayMerchantRepresentation merchant, BigDecimal amount, String token, Date date)
    {
        this.customer = customer;
        this.amount = amount;
        this.token = token;
        this.date = date;
        this.merchant = merchant;
    }

    public String getToken()
    {
        return token;
    }

    public void setToken(String token)
    {
        this.token = token;
    }

    public DtuPayMerchantRepresentation getMerchant()
    {
        return merchant;
    }

    public void setMerchant(DtuPayMerchantRepresentation merchant)
    {
        this.merchant = merchant;
    }

    public DtuPayCustomerRepresentation getCustomer()
    {
        return customer;
    }

    public void setCustomer(DtuPayCustomerRepresentation customer)
    {
        this.customer = customer;
    }

    public BigDecimal getAmount()
    {
        return amount;
    }

    public void setAmount(BigDecimal amount)
    {
        this.amount = amount;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }
}
