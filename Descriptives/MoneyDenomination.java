package Descriptives;

//A program tha displays an amount in rupees in terms of notes of different denominations.
public class MoneyDenomination
{
        int amt;
        int r1000,r500,r100,r50,r20,r10,r5,r2,r1;
        void initAmt()
        {
            amt=1782;
            r1000=0;
            r500=0;
            r100=0;
            r50=0;
            r20=0;
            r10=0;
            r5=0;
            r2=0;
            r1=0;
        }
        void detDenom()
        {
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
        }
        void display()
        {
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
        public static void main(String args[])
        {
            MoneyDenomination ob=new MoneyDenomination();
            ob.initAmt();
            ob.detDenom();
            ob.display();
        }
    }