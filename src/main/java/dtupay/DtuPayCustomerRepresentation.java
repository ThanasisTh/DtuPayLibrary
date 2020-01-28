package dtupay;

import java.util.List;

public class DtuPayCustomerRepresentation
{
    private String firstName;
    private String lastName;
    private String cprNumber;
    private String accountId;
    private List<String> customerTokens;

    public DtuPayCustomerRepresentation()
    {

    }

    public DtuPayCustomerRepresentation(String firstName, String lastName, String cprNumber, String accountId)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cprNumber = cprNumber;
        this.accountId = accountId;
    }

    public DtuPayCustomerRepresentation(String firstName, String lastName, String cprNumber)
    {
        this(firstName, lastName, cprNumber, null);
    }

    public DtuPayCustomerRepresentation(String firstName, String lastName)
    {
        this(firstName, lastName, null, null);
    }

    public DtuPayCustomerRepresentation(String firstName)
    {
        this(firstName, null, null, null);
    }

    public String getFirstName() { return firstName; }

    public String getLastName()
    {
        return lastName;
    }

    public String getCprNumber()
    {
        return cprNumber;
    }

    public String getAccountId()
    {
        return accountId;
    }

    public List<String> getCustomerTokens()
    {
        return customerTokens;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setCprNumber(String cprNumber)
    {
        this.cprNumber = cprNumber;
    }

    public void setCustomerTokens(List<String> customerTokens)
    {
        this.customerTokens = customerTokens;
    }

    public void setAccountId(String accountId) { this.accountId = accountId;}
}
