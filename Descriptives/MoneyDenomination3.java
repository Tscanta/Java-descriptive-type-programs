package Descriptives;

//A program tha displays an amount in rupees in terms of notes of different denominations.
import java.util.*;
class MoneyDenomination3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //Initialization
        int r1000=0;
        int r500=0;
        int r100=0;
        int r50=0;
        int r20=0;
        int r10=0;
        int r5=0;
        int r2=0;
        int r1=0;
        System.out.println("Enter the amount");
        int amt=sc.nextInt();
        //calculations
        int bal=amt;
        r1000=bal/1000;
        bal=bal%1000;
        r500=bal/500;
        bal=bal%500;
        r100=bal/100;
        bal=bal%100;
        r50=bal/50;
        bal=bal%50;
        r20=bal/20;
        bal=bal%20;
        r10=bal/10;
        bal=bal%10;
        r5=bal/5;
        bal=bal%5;
        r2=bal/2;
        bal=bal%2;
        r1=bal/1;
        //Displaying
        System.out.println("Amount is: Rs."+amt);
        System.out.println("Rs.1000 notes: "+r1000);
        System.out.println("Rs.500 notes: "+r500);
        System.out.println("Rs.100 notes: "+r100);
        System.out.println("Rs.50 notes: "+r50);
        System.out.println("Rs.20 notes: "+r20);
        System.out.println("Rs.10 notes: "+r10);
        System.out.println("Rs.5 notes: "+r5);
        System.out.println("Rs.2 notes: "+r2);
        System.out.println("Rs.1 notes: "+r1);
        }
}