package Descriptives;
//SIRIEL VIRTUAL ASSISTANT

import java.util.Scanner;
public class SIRIEL
{
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    //INITIALIZATIONS~
    String name;
    String a,b;
    //CONVO~introductions
    System.out.println("===================================================================");
    System.out.println("*Dramatic Intro*");
    System.out.println("Hey!");
    System.out.println("I am SIRIEL~Your Personal Virtual Assitant");
    System.out.println("SIRIEL: From now onwards I am kind of your slave");
    System.out.println("SIRIEL: I will do whatever you want me to do,");
    System.out.println("SIRIEL: Can you please tell me your name, Good sir");
    name=sc.nextLine();
    System.out.println("--------------------");
    System.out.println("SIRIEL: AHH! what a wonderful name you have Mr."+name);
    System.out.println("SIRIEL: I hope you enjoy working with me");
    System.out.println("SIRIEL: :)");
    System.out.println("===================================================================");
    System.out.println(" ");
    //CONVO~programs
    System.out.println("===================================================================");
    System.out.println("SIRIEL: Right now three program are coded in my system");
    System.out.println("SIRIEL: Which means I can only do three things for you");
    System.out.println("SIRIEL: I am extremly sorry Mr."+name);
    System.out.println("SIRIEL: But please dont worry this won't be a problem for long :)");
    System.out.println("SIRIEL: Here is the list of programs I can perform");
    System.out.println("SIRIEL: 1. Calculations");
    System.out.println("SIRIEL: 2. Temperature Conversion and,");
    System.out.println("SIRIEL: 3. Money Conversion");
    System.out.println("SIRIEL: Would you like me to perform some programs?");
    System.out.println(name+" : "+(a=sc.nextLine()));
    System.out.println("--------------------------------------");
    System.out.println(" ");
    //IF N ELSE~
    if(a.equals("Yes")||a.equals("Yea")||a.equals("Ye")||a.equals("Yeah")||a.equals("Yes sure")||a.equals("Yea sure")||a.equals("Yeah sure")||
    a.equals("Why not")||a.equals("whynot")||a.equals("yea sure why not")||a.equals("ok")||a.equals("okay")||a.equals("k")||a.equals("Kay"))
    {
        System.out.println("SIRIEL: Okay sir which one?");
        System.out.println(name+" : "+(b=sc.nextLine()));
        System.out.println("----------------------------");
        if(b.equals("Temperature conversion"));
        {
            //TEMPERATURE CONVERSION~ 1 
            String t;
            System.out.println("CONVERT TEMPERATURE");
            System.out.println("=============================");
            System.out.println("1. Farheinheit to Celsius");
            System.out.println("2. Celsius to Farheinheit");
            System.out.println("=============================");
            System.out.println("Enter your choice :");
            int c=sc.nextInt();
            switch(c)
            {
                case 1:
                    System.out.println("Enter the temperature in Farheinheit:");
                    int f=sc.nextInt();
                    double cl=5.0/9*(f-32);
                    System.out.println("The temperature in celsius= "+cl+"C");
                break;
                case 2:
                    System.out.println("Enter the temperature in CELSIUS:");
                    double c2=sc.nextInt();
                    double f2=1.8*c2+32;
                    System.out.println("The temperature in falrenheit= "+f2+"F");
                break;
                default:
                    System.out.println("YOUR CHOICE IS INCORRECT! PLEASE TRY AGAIN");
                break;
            }
        }
    }   
    if(a.equals("no"))
    {
        System.out.println("SIRIEL: Okay sir :(");
    }
    if (a.equals("Yea do some temperature conversion"));
    {
        //TEMPERATURE CONVERSION~ 2   
        System.out.println("SIRIEL: Okay sir ");
        String t;
        System.out.println("CONVERT TEMPERATURE");
        System.out.println("=============================");
        System.out.println("1. Farheinheit to Celsius");
        System.out.println("2. Celsius to Farheinheit");
        System.out.println("=============================");
        System.out.println("Enter your choice :");
        int c=sc.nextInt();
        switch(c)
        {
            case 1:
                System.out.println("Enter the temperature in Farheinheit:");
                int f=sc.nextInt();
                double cl=5.0/9*(f-32);
                System.out.println("The temperature in celsius= "+cl+"C");
            break;
            case 2:
                System.out.println("Enter the temperature in CELSIUS:");
                double c2=sc.nextInt();
                double f2=1.8*c2+32;
                System.out.println("The temperature in falrenheit= "+f2+"F");
            break;
            default:
                System.out.println("YOUR CHOICE IS INCORRECT! PLEASE TRY AGAIN");
            break;
        }
    }
}
}