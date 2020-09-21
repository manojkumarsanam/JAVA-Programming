import java.util.*;
class ElectricityBill{

    String ConsumerNumber=new String();
    String ConsumerName=new String();
    int CurrentMonth;
    int PreviousMonth;
    String EBConnection=new String();
    public ElectricityBill(String CN,String name,int PM,int CM,String EBC)
    {
        ConsumerNumber=CN;
        ConsumerName=name;
        PreviousMonth=PM;
        CurrentMonth=CM;
        EBConnection=EBC;
    }
    public String getNumber()
    {
        return ConsumerNumber;
    }
    public String getName()
    {
        return ConsumerName;
    }
    public double BillAmount()
    {
        int units = CurrentMonth - PreviousMonth;
        if(EBConnection=="domestic")
        {
            if(units<=100)
            {
                return units*1.0;
            }
            else if(units<=200)
            {
                return 100*1.0+((units-100)*2.50);
            }
            else if(units<=500)
            {
                return 100*1.0+100*2.50+((units-200)*4.0);
            }
            else
            {
                return 100*1+100*2.50+300*4+((units-500)*6.0);
            }
        }
        else
        {
            if(units<=100)
            {
                return units*2.0;
            }
            else if(units<=200)
            {
                return 100*2.0+((units-100)*4.50);
            }
            else if(units<=500)
            {
                return 100*2.0+100*4.50+((units-200)*6.0);
            }
            else
            {
                return 100*2.0+100*4.50+300*6.0+((units-500)*7.0);
            }
        }
    }
}
class Main
{
    public static void main (String[] args)
    {
        ElectricityBill EB=new ElectricityBill("12459","user",237,459,"domestic");
        System.out.println("ConsumerName:"+EB.getName());
        System.out.println("ConsumerNumber:"+EB.getNumber());
        System.out.println("BillAmount:"+EB.BillAmount());
    }
}
