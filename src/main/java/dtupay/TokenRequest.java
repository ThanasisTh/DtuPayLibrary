package dtupay;

public class TokenRequest
{
    private String cprNumber;
    private int requestedTokens;

    public TokenRequest()
    {
    }

    public TokenRequest(String cprNumber, int requestedTokens)
    {
        this.cprNumber = cprNumber;
        this.requestedTokens = requestedTokens;
    }

    public void setCprNumber(String cprNumber)
    {
        this.cprNumber = cprNumber;
    }

    public void setRequestedTokens(int requestedTokens)
    {
        this.requestedTokens = requestedTokens;
    }

    public String getCprNumber()
    {
        return cprNumber;
    }

    public int getRequestedTokens()
    {
        return requestedTokens;
    }
}
