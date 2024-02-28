package Descriptives;

//A program that converts units
import java.util.*;
class UnitConverter
{
    public static void main(String args[])
    {
        int o,d;
        int mm,cm,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int a=sc.nextInt();
        System.out.println("==================================================");
        System.out.println("SELECT YOUR GENRE OF MEASUREMENT");
        System.out.println("Press 1. for DISTANCE");
        System.out.println("Press 2. for WEIGHT");
        o=sc.nextInt();
        switch(o)
        {
            case 1:
                System.out.println("==================================================");
                System.out.println("Press 1. for Millimetre(mm) to Centimetre(cm)");
                System.out.println("Press 2. for Centimetre(cm) to Millimetre(mm)");
                System.out.println(" ");
                System.out.println("Press 3. for Metre(m) to Centimetre(cm)");
                System.out.println("Press 4. for Centimetre(cm) to Metre(m)");
                d=sc.nextInt();
                System.out.println("==================================================");
                switch(d)
                {
                    case 1:
                        cm=a/10;
                        System.out.println(cm);
                    break;
                    case 2:
                        mm=a*10;
                        System.out.println(mm);
                    break;
                    case 3:
                        cm=a*100;
                        System.out.println(cm);
                    break;
                    case 4:
                        m=a/100;
                        System.out.println(m);
                    break;
                    default:
                        System.out.println("INVALID INPUT");
                    }
                }
            }
        }