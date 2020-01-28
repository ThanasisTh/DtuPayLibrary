package dtupay;

public class DtuPayMerchantRepresentation
{
    private String name;
    private String uuid;
    private String accountId;

    public DtuPayMerchantRepresentation()
    {

    }

    public DtuPayMerchantRepresentation(String name, String uuid, String accountId)
    {
        this.name = name;
        this.uuid = uuid;
        this.accountId = accountId;
    }

    public DtuPayMerchantRepresentation(String name, String uuid)
    {
        this(name, uuid, null);
    }

    public DtuPayMerchantRepresentation(String name)
    {
        this(name, null, null);
    }

    public String getName()
    {
        return name;
    }

    public String getUuid()
    {
        return uuid;
    }

    public String getAccountId()
    {
        return accountId;
    }

    public void setAccountId(String accountId)
    {
        this.accountId = accountId;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setUuid(String uuid)
    {
        this.uuid = uuid;
    }
}
