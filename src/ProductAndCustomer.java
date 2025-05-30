class Product
{
    private String itemNo;
    private String name;
    private double price;
    private short qty;

    public Product(String itemno)
    {
        itemNo=itemno;
    }
    public Product(String itemno,String name)
    {
        itemNo=itemno;
        this.name=name;
    }
    public Product(String itemno,String name,double price,short qty)
    {
        itemNo=itemno;
        this.name=name;
        setPrice(price);
        setQuantity(qty);
    }

    public String getItemNo(){return  itemNo;}
    public String getName(){return name;}
    public double getPrice(){return price;}
    public short getQuantity(){return qty;}

    public void setPrice(double price)
    {
        this.price=price;
    }
    public void setQuantity(short qty)
    {
        this.qty=qty;
    }

}





class Customer
{
    private String custId;
    private String name;
    private String address;
    private String phno;

    public Customer(String custId,String name)
    {
        this.custId=custId;
        this.address=name;
    }
    public Customer(String custId,String name,String address,String phno)
    {
        this.custId=custId;
        this.address=name;
        setAddress(address);
        setPhno(phno);
    }

    public String getCustId(){return custId;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public String getPhno(){return phno;}

    public void setAddress(String address)
    {
        this.address=address;
    }
    public void setPhno(String phno)
    {
        this.phno=phno;
    }

}




public class ProductAndCustomer
{
    public static void main(String args[])
    {
        Product p =new Product("A231", "Pencil");
        new Product("Integer");
        p.setPrice(45.6);
        p.setQuantity((short) 5);

        Customer c = new Customer("CUV276","Gabriel");
        c.setAddress("Lalgudi,Trichy");
        c.setPhno("8064368897");

    }
}
