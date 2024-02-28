package Descriptives;

//ParkingLot
import java.util.*;
class ParkingLot
{
    int vno;int hours;
    double bill;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the vehicle no.");
        vno=sc.nextInt();
        System.out.println("Enter the no. of hours the vehicle is parked at the parking lot");
        hours=sc.nextInt();
    }
    void calculate()
    {
        if(hours<=1)
        bill=3;
        else
        bill=3+1.5*(hours-1);
    }
    void display()
    {   
        System.out.println("======================================================================");
        System.out.println("The vehicle number: "+vno);
        System.out.println("The no. of hours the vehicle is parked at the parking lot: "+hours);
        System.out.println("The Bill= "+bill);
        System.out.println("======================================================================");
    }
    public static void main(String args[])
    {
        ParkingLot ob=new ParkingLot();
        ob.input();
        ob.calculate();
        ob.display();
    }
}