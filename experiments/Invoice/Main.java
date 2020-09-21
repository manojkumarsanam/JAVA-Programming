import java.io.*;
import java.util.Scanner;
class Invoice{
        //Define instance variables here
        String number=new String();
        String type = new String();
        int quantity;
        double price;
        //Define parameterized constructor here
        public Invoice(String n,String t,int q,double p)
        { 
            number=n;
            type=t;
            quantity=q;
            price=p;
        }
        // Setters
        public void setnumber(String n)
        {
            number=n;
        }
        public void settype(String t)
        {
            type=t;
        }
        public void setquantity(int q)
        {
            quantity=q;
        }
        public void setprice(double p)
        {
            price=p;
        }
        // Getters
        public String getnumber()
        {
            return number;
        }
        public String gettype()
        {
            return type;
        }
        public int getquantity()
        {
            return quantity;
        }
        public double getprice()
        {
            return price;
        }
       public double getInvoiceAmount(){
                 double invoiceAmount = 0.0;
                // Write your logic here
                invoiceAmount=quantity*price;
                return invoiceAmount;
       }
}
public class Main{
         public static void main(String []args){
                   Invoice myInvoice;
                   //Write your code here  
                   Invoice InvoiceTest = new Invoice("1A05J6","pen",100,5.0);
                   InvoiceTest.setnumber("1B05J6");
                   InvoiceTest.settype("book");
                   InvoiceTest.setquantity(5);
                   InvoiceTest.setprice(250.0);
                   System.out.println("Number="+InvoiceTest.getnumber());
                   System.out.println("type="+InvoiceTest.gettype());
                   System.out.println("Quantity="+InvoiceTest.getquantity());
                   System.out.println("Price per Item="+InvoiceTest.getprice());
                   System.out.println("Invoice Amount="+InvoiceTest.getInvoiceAmount());
         }
}

