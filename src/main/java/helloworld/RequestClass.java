package helloworld;

public class RequestClass
{
    String address;
    String radius;

    public RequestClass()
    {
        address = "1259 Atascadero Street San Luis Obispo 93405";
        radius = "50_000";
    }

    public RequestClass(String address, String radius)
    {
        this.address = address;
        this.radius = radius;
    }

    public String getAddress()
    {
        return address;
    }

    public String getRadius()
    {
        return radius;
//        try
//        {
//            return Integer.parseInt(radius);
//        }
//        catch (Exception e)
//        {
//            return Tester.RADIUS;
//        }
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void setRadius(String radius)
    {
        this.radius = radius;
    }
}
