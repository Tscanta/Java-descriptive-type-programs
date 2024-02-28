package Descriptives;

//Showroom ICSE 2019
import java.util.*;
class Showroom
{
    String name;
    long mobno;
    double cost,dis,amount;
    public Showroom()
    {
        amount=0.0;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the customer");
        name=sc.nextLine();
        System.out.println("Enter the mobile number of the customer");
        mobno=sc.nextLong();
        System.out.println("Enter the cost");
        cost=sc.nextDouble();
    }
    void calculate()
    {
        if(cost<=10000)
            dis=0.05*cost;
        else if(cost>10000&&cost<=20000)
            dis=0.10*cost;
        else if(cost>20000&&cost<35000)
            dis=0.15*cost;
        else if(cost>350000)
            dis=0.20*cost;
        amount=cost-dis;
    }
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Mobile number: "+mobno);
        System.out.println("Amount to be paid after: "+amount);
    }
    public static void main(String args[])
    {
        Showroom ob=new Showroom();
        ob.input();
        ob.calculate();
        ob.display();
    }
}
        
