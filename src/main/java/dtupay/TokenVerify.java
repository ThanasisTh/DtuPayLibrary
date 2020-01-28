package dtupay;

public class TokenVerify
{
    private String token;
    private String cprNumber;

    public TokenVerify()
    {
    }

    public TokenVerify(String cprNumber, String token)
    {
        this.cprNumber = cprNumber;
        this.token = token;
    }

    public String getToken()
    {
        return token;
    }

    public void setToken(String token)
    {
        this.token = token;
    }

    public String getCprNumber()
    {
        return cprNumber;
    }

    public void setCprNumber(String cprNumber)
    {
        this.cprNumber = cprNumber;
    }
}
